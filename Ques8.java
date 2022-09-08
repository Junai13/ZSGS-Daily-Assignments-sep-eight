package array;
import java.util.Scanner;
public class Ques8 {
    static void rightRotate(int[][] matrix, int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i=0;i<n;i++)
        {
            int low = 0, high = n-1;
            while(low < high)
            {
                int temp = matrix[i][low];
                matrix[i][low] = matrix[i][high];
                matrix[i][high] = temp;
                low++;
                high--;
            }
        }
        System.out.println("The Right Rotated Matrix is: ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(matrix[i][j]+" " +"\t");
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int m= sc.nextInt();
        int n = sc.nextInt();
        int matrix[][] = new int[m][n];
        System.out.println("Enter the elements of an array: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The Original Matrix is: ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(matrix[i][j]+" " +"\t");
            }
            System.out.println();
        }
        rightRotate(matrix, n);
    }
}
