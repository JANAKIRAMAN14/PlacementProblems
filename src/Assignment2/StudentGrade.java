package Assignment2;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        if(A >= 90 & A <= 100){
            System.out.println("A Grade");
        } else if (B >= 75 & 89 >= B) {
            System.out.println("B Grade");
        } else if (C >= 60 & C <= 74) {
            System.out.println("C Grade");
        } else if (D >= 40 & D <= 59) {
            System.out.println("D Grade");
        }
        else{
            System.out.println("Below 40");
       }
    }
}
