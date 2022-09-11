package array;

import java.util.*;
public class BlockSwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the size of the Array:  ");
        int n = sc.nextInt();
        System.out.print(" Enter the elements of array:   ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        System.out.println("Enter how many time of array to be rotated: ");
        int r = sc.nextInt();
        blockswap(arr,0,r,n);
        for(int i=0;i<n;i++)
            System.out.println(arr[i]);

    }
    public static void blockswap(int arr[], int i,
                                     int d, int n)
    {
        if(d == 0 || d == n)
            return;
        if(n - d == d)
        {
            swap(arr, i, n - d + i, d);
            return;
        }

        if(d < n - d)
        {
            swap(arr, i, n - d + i, d);
            blockswap(arr, i, d, n - d);
        }
        else
        {
            swap(arr, i, d, n - d);
            blockswap(arr, n - d + i, 2 * d - n, d);
        }
    }
    public static void swap(int arr[], int fi,
                            int si, int d)
    {
        int i, temp;
        for(i = 0; i < d; i++)
        {
            temp = arr[fi + i];
            arr[fi + i] = arr[si + i];
            arr[si + i] = temp;
        }
    }
}
