package Assignment4;

import java.util.*;
public class CountVowelsandConsonants {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = sc.nextLine();
        System.out.println(countvowelsConsonants(s));
    }
    static String countvowelsConsonants(String s){
        int vowels = 0 ;
        int constants = 0 ;
        List<Integer> li = new ArrayList<>();
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I'
                    ||s.charAt(i) == 'O' || s.charAt(i) == 'U'){

                vowels++;
            }
            else constants++;
        }
        li.add(vowels);
        li.add(constants);
        return li.toString();
    }
}
