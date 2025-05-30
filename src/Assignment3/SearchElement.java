package Assignment3;

import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N Size");
        int n = sc.nextInt();
        System.out.println("Enter The target:");
        int target = sc.nextInt();
        System.out.println("Arrays Elements are:");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == target) System.out.println(j + "Index of the first occurrence of x in the array");
            else System.out.println("Not found");
        }
    }
}
