package array;
import java.util.*;
public class Ques10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the matrix 1: ");
        int row1 = sc.nextInt();
        int col1 = sc.nextInt();
        int[][] mat1 = new int[row1][col1];
        System.out.println("Enter the elements of matrix 1: ");
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                mat1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the size of the matrix 2: ");
        int row2 = sc.nextInt();
        int col2 = sc.nextInt();
        int[][] mat2 = new int[row2][col2];
        System.out.println("Enter the elements of matrix 2: ");
        for(int i=0;i<row2;i++){
            for(int j=0;j<col2;j++){
                mat2[i][j] = sc.nextInt();
            }
        }
        System.out.println("--------------------------------------------------");
        System.out.println("enter 1 for addition \nEnter 2 for subtraction \nEnter 3 for multiplication \nEnter 4 for Scalar multiplication \nEnter 5 for Transpose \n" );
        System.out.println("--------------------------------------------------");
        int op = sc.nextInt();
        switch (op){
            case 1:
                int[][] ans_mat = new int[row1][col1];
                if((row1==row2)&&(col1==col2)){
                    for(int i=0;i<row1;i++){
                        for(int j=0;j<col1;j++){
                            ans_mat[i][j]= mat1[i][j] + mat2[i][j];
                        }
                    }
                    for(int i=0;i<row1;i++){
                        for(int j=0;j<col1;j++){
                            System.out.print(ans_mat[i][j]+ " ");
                        }
                        System.out.println();
                    }
                }else{
                    System.out.println("These matrix can not be added:");
                }
                break;
            case 2:
                int[][] sub_mat = new int[row1][col1];
                if((row1==row2)&&(col1==col2)){
                    for(int i=0;i<row1;i++){
                        for(int j=0;j<col1;j++){
                            sub_mat[i][j]= mat1[i][j] - mat2[i][j];
                        }
                    }
                    for(int i=0;i<row1;i++){
                        for(int j=0;j<col1;j++){
                            System.out.print(sub_mat[i][j]+ " ");
                        }
                        System.out.println();
                    }
                }else{
                    System.out.println("These matrix can not be subtracted:");
                }
                break;
            case 3:
                if(col1==row2) {
                    int[][] multiplication= new int[row1][col2];
                    for (int i = 0; i < row1; i++) {
                        for (int j = 0; j < col2; j++) {
                            for (int k = 0; k < col1; k++) {
                                multiplication[i][j] += mat1[i][k] * mat2[k][j];
                            }
                        }
                    }
                    System.out.println("Multiplication of two matrices is: ");
                    for(int i=0;i<row1;i++){
                        for(int j = 0;j<col2;j++){
                            System.out.print(multiplication[i][j]+ " ");
                        }
                        System.out.println();
                    }
                }
                else{
                    System.out.println("These matrix can not be multiplied!!!!!");
                }
                break;
            case 4:
                System.out.println("Enter the scalar value:" );
                int scalar = sc.nextInt();
                int[][] sca1=new int[row1][col1];
                int[][] sca2 = new int[row2][col2];
                for(int i =0;i<row1;i++) {
                    for (int j = 0; j < col1; j++) {
                        sca1[i][j] = scalar * mat1[i][j];
                    }
                }
                for(int i =0;i<row2;i++) {
                    for (int j = 0; j < col2; j++) {
                        sca2[i][j] = scalar * mat2[i][j];
                    }
                }
                System.out.println("Scalar matrices \n matrix 1");
                for(int i =0;i<row1;i++) {
                    for (int j = 0; j < col1; j++) {
                        System.out.print(sca1[i][j] + "  ");
                    }
                    System.out.println();
                }
                System.out.println("Matrix 2");
                for(int i =0;i<row2;i++) {
                    for (int j = 0; j < col2; j++) {
                        System.out.print(sca2[i][j] + "  ");
                    }
                    System.out.println();
                }
                break;
            case 5:
                int[][] tranpose1 = new int[col1][row1];
                int[][] tranpose2 = new int[col2][row2];
                for(int i =0;i<col1;i++){
                    for(int j=0;j<row1;j++){
                        tranpose1[i][j] = mat1[j][i];
                    }
                }
                for(int i =0;i<col2;i++){
                    for(int j=0;j<row2;j++){
                        tranpose2[i][j] = mat1[j][i];
                    }
                }
                System.out.println("Transposed Matrix: " + "\n" + "Matrix 1");
                for(int i =0;i<col1;i++) {
                    for (int j = 0; j < row1; j++) {
                        System.out.print(tranpose1[i][j] + "  ");
                    }
                    System.out.println();
                }
                System.out.println("Matrix 2");
                for(int i =0;i<col2;i++) {
                    for (int j = 0; j < row2; j++) {
                        System.out.print(tranpose2[i][j] + "  ");
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("0");
                break;
        }
    }
}
