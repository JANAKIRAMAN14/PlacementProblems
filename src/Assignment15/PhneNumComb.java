package Assignment15;
import java.util.*;
public class PhneNumComb {
    static String[] map = {
            "", "", "abc", "def", "ghi", "jkl",
            "mno", "pqrs", "tuv", "wxyz"
    };

    public static void main(String[] args) {
        String s = "46";
        List<String> ans = new ArrayList<>();
        findCombination(s , ans,"",0);
        System.out.println(ans.toString());
    }
    static void findCombination(String s , List<String> ans ,String current, int index){
      if(index == s.length()){
          ans.add(current);
          return ;
      }
        String letters = map[s.charAt(index) - '0'];
       for(char c : letters.toCharArray()){
           findCombination(s,ans , current + c , index + 1);
       }
    }
}
