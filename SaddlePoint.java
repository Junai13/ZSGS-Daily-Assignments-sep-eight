package array;
import  java.util.Scanner;

public class SaddlePoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sizeof the matrix:");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        System.out.println("Enter the elements of matrix:" );
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int min = 0, max= 0;
        int[][] index = new int[m][n];
        for (int i = 0; i < m; i++)
        {
            min = matrix[i][0];
            for (int j = 0; j < n; j++)
            {
                if (min >= matrix[i][j])
                {
                    min = matrix[i][j];
                    index[0][0] = i;
                    index[0][1] = j;
                }
            }
//finds the maximum element in the same column
            int j = index[0][1];
            max = matrix[0][j];
            for (int k = 0; k < m; k++)
            {
                if (max <= matrix[k][j])
                {
                    max = matrix[i][j];
                    index[1][0] = k;
                    index[1][1] = j;
                }
            }
//saddle point is the minimum of a row and maximum of the column
            if (min == max)
            {
                if (index[0][0] == index[1][0] && index[0][1] == index[1][1])
                {
                    System.out.print("\nSaddle point in the matrix is at index: (" + index[0][0] + ", " + index[0][1] + ") : " + max + "\n");
                }
            }
        }
    }
}
