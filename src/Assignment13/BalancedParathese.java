package Assignment13;

import java.util.Stack;

public class BalancedParathese {
    public static void main(String[] args) {
        String s = "((()))";
       boolean check = checkParanthese(s);
       if(check) System.out.println("Balanced : ");
       else System.out.println("Not Balanced : ");
    }
    static boolean checkParanthese(String s){
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '(') {
                st.push(c);
            }
            else if (c == '{') {
                st.push(c);
            } else if (c == '[') {
                st.push(c);
            }
            else if (c == ')') {
                if(!st.isEmpty() && st.peek().equals('(')){
                    st.pop();
            }
        }
            else if (c == '}') {
                if(!st.isEmpty() && st.peek().equals('{')){
                    st.pop();
                }
            }
            else if (c == ']') {
                if(!st.isEmpty() && st.peek().equals('[')){
                    st.pop();
                }
            }
        }
        if(st.isEmpty()) return true;

        return false;
    }
}
