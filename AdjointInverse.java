package array;
import java.util.*;
public class AdjointInverse {

    static void getCofactor(int[][] arr, int[][] temp, int p, int q, int n)
    {
        int i = 0, j = 0;

        for (int row = 0; row < n; row++)
        {
            for (int col = 0; col < n; col++)
            {
                if (row != p && col != q)
                {
                    temp[i][j++] = arr[row][col];
                    if (j == n - 1)
                    {
                        j = 0;
                        i++;
                    }
                }
            }
        }
    }
    static int determinant(int[][] arr, int n,int size)
    {
        int det = 0;
        if (n == 1)
            return arr[0][0];
        int [][]temp = new int[size][size];

        int sign = 1;
        for (int f = 0; f < n; f++)
        {
            getCofactor(arr, temp, 0, f, n);
            det += sign * arr[0][f] * determinant(temp, n - 1, size);
            sign = -sign;
        }

        return det;
    }
    static void adjoint(int[][] arr,int [][]adj,int size)
    {
        if (size == 1)
        {
            adj[0][0] = 1;
            return;
        }

        int asign;                   //For sign
        int [][]temp = new int[size][size];

        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                getCofactor(arr, temp, i, j, size);
                asign = ((i + j) % 2 == 0)? 1: -1;
                adj[j][i] = (asign)*(determinant(temp, size-1,size));
            }
        }
    }
    static boolean inverse(int[][] arr, float [][]inverse,int size)
    {
        int det = determinant(arr, size,size);
        if (det == 0)
        {
            System.out.print("Singular matrix, can't find its inverse");
            return false;
        }

        int [][]adj = new int[size][size];
        adjoint(arr, adj,size);
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                inverse[i][j] = adj[i][j]/(float)det;

        return true;
    }

    static void display(int[][] arr,int size)
    {
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
                System.out.print(" " + arr[i][j]+ "  ");
            System.out.println();
        }
    }
    static void display(float[][] arr,int size)
    {
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
                System.out.printf("%.6f ",arr[i][j]);
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: (The size of rows and columns should be equal)");
        int size = sc.nextInt();
        int[][] arr = new int[size][size];
        System.out.println("Enter the elements of the matrix: ");
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int [][]adj = new int[size][size];                                                    // To store adjoint of A[][]

        float [][]inv = new float[size][size];                                               // To store inverse of A[][]

        System.out.print("Input matrix is :\n");
        display(arr,size);

        System.out.print("\nThe Adjoint is :\n");
        adjoint(arr, adj,size);
        display(adj,size);

        System.out.print("\nThe Inverse is :\n");
        if (inverse(arr, inv,size))
            display(inv,size);

    }
}
