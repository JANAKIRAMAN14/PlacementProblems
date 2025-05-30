package Assignment1;

import java.util.Scanner;

public class Tyepeconversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      float f = sc.nextFloat();
         int n = sc.nextInt();
       System.out.println((int)f);
       float f1 =(float)n;
       f1 += f;
        System.out.println(f1);
         char c = 'A';
         int n1 = c ;
        int res = n1 + n;
        System.out.println(n1+n);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sub = num2 - num1;
        int add = num1 + num2;
        Double d = sc.nextDouble();
        System.out.println("Addition :"+add);
        System.out.println("Subtraction :"+ sub);
        System.out.println("Division:"+ num1 / num2);
        System.out.println("Mulitiplication"+ num1 * num2);

        System.out.println("Multiply result of add with double :"+add*d);

        
    }
}