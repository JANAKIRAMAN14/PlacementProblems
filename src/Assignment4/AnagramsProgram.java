package Assignment4;

import java.util.*;
public class AnagramsProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s1 = sc.nextLine();
        System.out.println("Enter the String :");
        String s2 = sc.nextLine();
       if(anagrams(s1,s2)){
           System.out.println("It Anagrams :");
       }
       else System.out.println("Not Anagrams:");
    }
    static boolean anagrams(String  s1 , String s2){
      if(s1.equals(s2)){
          return true;
      }
return false;
    }
}
