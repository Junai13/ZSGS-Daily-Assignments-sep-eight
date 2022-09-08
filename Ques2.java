package array;

import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int size = sc.nextInt();

        int[] arrWeight = new int[size], arrSum = new int[size];
        int sum = 0;
        int temp1;
        int temp2 = 0;
        System.out.println("Enter the elements to the array");
        for (int i = 0; i < size; i++) {
            arrWeight[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            int sqr = (int) Math.sqrt(arrWeight[i]);
            if (sqr * sqr == arrWeight[i])
                sum += 5;
            if (arrWeight[i] % 4 == 0 && arrWeight[i] % 6 == 0)
                sum += 4;
            if (arrWeight[i] % 2 == 0)
                sum += 3;
            arrSum[i] = sum;
            sum=0;
        }

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arrSum[i] < arrSum[j]) {
                    temp1 = arrSum[i];
                    arrSum[i] = arrSum[j];
                    arrSum[j] = temp1;
                    temp2 = arrWeight[i];
                    arrWeight[i] = arrWeight[j];
                    arrWeight[j] = temp2;
                }
            }
        }
        System.out.println("The Output:<Number, weightage>");
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print("<" + arrWeight[i] + "," + arrSum[i] + "> ");
        }
    }
}

