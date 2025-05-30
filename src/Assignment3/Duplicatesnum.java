package Assignment3;

import  java.util.*;
public class Duplicatesnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N size :");
        int n = sc.nextInt();
        System.out.println("Enter the Array Elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        findtheduplicate(arr);
    }
        static String findtheduplicate(int[] arr) {
            HashSet<Integer> li = new HashSet<>();
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    if (j != k && arr[j] == arr[k]) {
                        li.add(arr[j]);
                    }
                }
            }
            return li.toString();
        }
}
