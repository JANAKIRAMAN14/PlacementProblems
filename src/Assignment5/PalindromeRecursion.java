package Assignment5;
import java.util.*;
public class PalindromeRecursion {
    public static void main(String[] args) {
        String s = "madam";
        int i =0 ;
        int n = s.length() - 1;
        System.out.println(palindrome(s,n,i));
    }
    static boolean palindrome(String s,int n,int i){
       if(i == n ) return true;
       if(s.charAt(i) != s.charAt(n)) return false;
       return palindrome(s,n - 1  ,i+1);
    }
}