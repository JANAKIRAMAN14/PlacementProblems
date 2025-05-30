package Assignment4;

import java.util.*;
public class PalindromeinString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String s = sc.nextLine();
      String result =  isPalindrome(s);
      if(result.equals(s)) System.out.println("Palindrome :"+result);
      else System.out.println("Not palindrome : "+ result);
    }
    static String isPalindrome(String s){
        String str = "";
     for(int i = s.length() - 1 ; i >= 0 ; i--){
         str += s.charAt(i);
     }
     return str;
    }
}
