package Assignment2;

import java.util.*;
public class Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
          switch (ch){
              case 1:
                  int p = sc.nextInt();
                  int r = sc.nextInt();
                  int t = sc.nextInt();
                  int interest = p * r * t;
                  System.out.println("Assignment2.Interest :"+interest);
              case 2:
                  int p1 = sc.nextInt();
                  int r1 = sc.nextInt();
                  int t1 = sc.nextInt();
                  int interest1 = p1 * r1 * t1;
                  System.out.println(" Compound Assignment2.Interest :"+interest1);;
          }
    }
}
