package Assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class RotationbyK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N size :");
        int n = sc.nextInt();
        System.out.println("No. of Times Rotated:");
        int k = sc.nextInt();
        System.out.println("Enter the Array Elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        rotateLeft(arr,k);
    }
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotateLeft(int[] arr, int k) {
        int n = arr.length;
        k %= n;

        // Step 1: Reverse first k elements
        reverse(arr, 0, k - 1);
        // Step 2: Reverse remaining n-k elements
        reverse(arr, k, n - 1);
        // Step 3: Reverse whole array
        reverse(arr, 0, n - 1);

        System.out.println("Rotated Array: " + Arrays.toString(arr));
    }
}
