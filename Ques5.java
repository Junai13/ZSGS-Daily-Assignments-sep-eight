package array;

import java.util.Arrays;
import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i = 0 ; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int[] rearrangedArr = new int[n];
        int p = 0, q = n - 1;
        for (int i = n-1; i >=0; i--) {
            if ((i + 1) % 2 == 0)
                rearrangedArr[i] = arr[q--];
            else
                rearrangedArr[i] = arr[p++];
        }
        System.out.println(Arrays.toString(rearrangedArr));

    }
}
