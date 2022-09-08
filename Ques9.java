package array;

import java.util.Scanner;

public class Ques9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("Enter the elements of an array: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int i, k = 0, l = 0;
        while (k < row && l < col) {
            for (i = l; i < col; ++i) {
                System.out.print(arr[k][i] + " ");
            }
            k++;
            for (i = k; i < row; ++i) {
                System.out.print(arr[i][col - 1] + " ");
            }
            col--;

            if (k < row) {
                for (i = col - 1; i >= l; --i) {
                    System.out.print(arr[row - 1][i] + " ");
                }
                row--;
            }

            if (l < col) {
                for (i = row - 1; i >= k; --i) {
                    System.out.print(arr[i][l] + " ");
                }
                l++;
            }
        }
    }
}
