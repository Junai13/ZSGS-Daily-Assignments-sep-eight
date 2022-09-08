package array;

import java.util.Scanner;
public class Ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and coloums of the matrix1: ");
        int m1 = sc.nextInt();
        int n1 = sc.nextInt();
        System.out.println("Enter the elements in the matrix: ");
        int[][] matrix1 = new int[m1][n1];
        for(int i=0;i<m1;i++){
            for(int j = 0;j<n1;j++){
                matrix1[i][j]= sc.nextInt();
            }
        }
        System.out.println("Enter the rows and coloums of the matrix2: ");
        int m2 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println("Enter the elements in the matrix2: ");
        int[][] matrix2 = new int[m2][n2];
        int[][] multiplication = new int[m1][n2];
        for(int i=0;i<m2;i++){
            for(int j = 0;j<n2;j++){
                matrix2[i][j]= sc.nextInt();
            }
        }
        if(n1==m2) {

            for (int i = 0; i < m1; i++) {
                for (int j = 0; j < n2; j++) {
                    for (int k = 0; k < n1; k++) {
                        multiplication[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
            System.out.println("Multiplication of two matrices is: ");
            for(int i=0;i<m1;i++){
                for(int j = 0;j<n2;j++){
                    System.out.print(multiplication[i][j]+ " ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("These matrix can not be multiplied!!!!!");
        }

            System.out.println();
        }
    }

