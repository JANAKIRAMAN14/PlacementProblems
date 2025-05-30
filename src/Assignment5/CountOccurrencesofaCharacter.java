package Assignment5;
import java.util.*;
public class CountOccurrencesofaCharacter {
    public static void main(String[] args) {
        String s = "programming";
        char c = 'g';
        int i = 0;
        int count = 0;
        System.out.println(countTheCharacter(s,c, i,count));
    }
    static int countTheCharacter(String s , char c,int i,int count){
        if(i == s.length()
        ) return count;
        if(s.charAt(i) == c) count++;
        return countTheCharacter(s,c,i+1,count);
    }
}
