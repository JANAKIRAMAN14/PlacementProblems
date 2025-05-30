package Assignment5;
import java.util.*;
public class CountOfPower {
    public static void main(String[] args) {
        int n = 2;
        int t = 5;
        int total = 1;
        System.out.println(findPower(n,t,total));
    }
    static int findPower(int n , int t,int total){
        if(t == 0) return total;
        total *= n;
        return findPower(n , t-1, total);
    }
}
