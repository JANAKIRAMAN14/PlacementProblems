package Assignment4;

import java.util.*;
public class ReverseStringUsingStringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        StringBuilder s = new StringBuilder("hello");
       String res = String.valueOf(s.reverse());
        System.out.println(res);
    }

}
