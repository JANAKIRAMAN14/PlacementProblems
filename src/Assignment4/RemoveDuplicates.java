package Assignment4;

import java.util.*;
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = sc.nextLine();
       String str =  removeDuplicates(s);
        System.out.println(str);
    }
    static String removeDuplicates(String s){
        HashSet<Character> hs = new HashSet<>();
        for(int i = 0 ; i < s.length() ; i++){
            hs.add(s.charAt(i));
        }
        return hs.toString();
    }
}
