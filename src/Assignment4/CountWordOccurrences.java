package Assignment4;

import java.util.*;
public class CountWordOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = sc.nextLine();
     int res =  countword(s);
        System.out.println(res);
    }
    static int countword(String s){
        int count = 0 ;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == '.'){
                count++;
            }
        }
        return count;
    }
}
