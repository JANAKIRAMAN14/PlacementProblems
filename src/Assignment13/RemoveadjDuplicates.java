package Assignment13;

import java.util.Stack;

public class RemoveadjDuplicates {
    public static void main(String[] args) {
        String s = "abbaca";
        System.out.println(removeAdjDuplicate(s));
    }
    static String removeAdjDuplicate(String s){
        Stack <Character> st = new Stack<>();
        StringBuilder str = new StringBuilder();
        for(char c : s.toCharArray()){
            if(!st.isEmpty() && st.peek() == c) st.pop();
            else {
                st.push(c);
            }
        }
        for(char d : st){
            str.append(d);
        }

       return str.toString();
    }
}
