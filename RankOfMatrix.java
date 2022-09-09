package array;

import java.util.*;
public class RankOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the matrix:");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] mat = new int[row][col];
        System.out.println("Enter the elements of an array: ");
        for (int i=0;i<row;i++)
            for(int j=0;j<col;j++)
                mat[i][j] = sc.nextInt();
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
                System.out.print(" " + mat[i][j]);
            System.out.print("\n");
        }
        int rank = col;
        for (int r = 0; r < rank; r++)
        {
            if (mat[r][r] != 0)
            {
                for (int c = 0; c < row; c++)
                {
                    if (c != r)
                    {
                        double mult = (double)mat[c][r] / mat[r][r];
                        for (int i = 0; i < rank; i++)
                            mat[c][i] -= mult * mat[r][i];
                    }
                }
            }
            else
            {
                boolean reduce = true;
                for (int i = r + 1; i < row; i++)
                {
                    if (mat[i][r] != 0)
                    {
                        swap(mat, r, i, rank);
                        reduce = false;
                        break ;
                    }
                }
                if (reduce)
                {
                    rank--;
                    for (int i = 0; i < r; i ++)
                        mat[i][r] = mat[i][rank];
                }
                row--;
            }
        }
        System.out.println("Rank of the matrix: " + rank);
    }
    static void swap(int mat[][],
                     int row1, int row2, int col)
    {
        for (int i = 0; i < col; i++)
        {
            int temp = mat[row1][i];
            mat[row1][i] = mat[row2][i];
            mat[row2][i] = temp;
        }
    }
}
