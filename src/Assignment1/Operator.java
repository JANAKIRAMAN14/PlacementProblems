package Assignment1;

import java.util.*;
public class Operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in1 = sc.nextInt();
        int in2 = sc.nextInt();
        int add = in1 & in2;
        int or = in1 | in2;
        int ex_or = in1 ^ in2;
        System.out.println("And operator"+add);
        System.out.println("Or operator"+or);
        System.out.println("Ex_or operator "+ex_or);
        int left = in1 >> 2;
        int right = in2 << 2;
        System.out.println("Left shift"+left);
        System.out.println("Right Shift"+ right);

    }
}
