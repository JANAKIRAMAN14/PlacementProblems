package Assignment9;
import java.util.*;
public class FirstNChar {
    public static void main(String[] args) {
        String s = "aba";
        int n = 10;
        System.out.println(firstNumChar(s,n));
    }
    static int firstNumChar(String s, int n){
        StringBuilder str = new StringBuilder(s);
        int count = 0 ;
         while(str.length() < n){
             str.append(s);
         }
        for(int i = 0 ; i < n ; i++){
            if(str.charAt(i) == 'a') count++;
        }
        return count;
    }
}
