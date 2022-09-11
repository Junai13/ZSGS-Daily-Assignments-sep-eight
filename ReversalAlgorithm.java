package array;
import java.util.*;
public class ReversalAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of array:");
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i]= sc.nextInt();
        System.out.println("Enter how many times the array rotated: ");
        int r = sc.nextInt();
        if(r == 0)
            return;
        r = r % n;
        reverseArray(arr, 0, r - 1);
        reverseArray(arr, r, n - 1);
        reverseArray(arr, 0, n - 1);

        System.out.println("Rotated Array: ");
        for(int j=0;j<n;j++){
            System.out.print(arr[j] + "  ");
        }
    }
    static void reverseArray(int arr[], int start, int end)
    {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
