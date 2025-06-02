package Assignment6;
import java.util.*;
public class First_nonRepeat {
    public static void main(String[] args) {
        String s = "mountain";
        System.out.println(findChar(s));
    }
    static int findChar(String s){
       int [] fre = new int[26];
       for(char c : s.toCharArray()){
           fre[c - 'a']++;
       }
      for(int i : fre){
          if(1 < i ) return -1;
      }
      return 0;
       }
    }