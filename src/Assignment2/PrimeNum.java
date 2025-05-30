package Assignment2;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int num = 2; num <= n; num++) {
            if (isprime(num)) {
                System.out.println(" " + num);
            }
        }
    }

    static boolean isprime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;
    }
}