package Assignment5;
import java.util.*;
public class NoOfDigit {
    public static void main(String[] args) {
        int digit = 432;
        int count = 0 ;
        System.out.println(findDigt(digit,count));
    }
    static int findDigt(int digit,int count){
         if(digit == 0) return count;
         int temp = digit % 10;
          count++;
          digit /= 10;
         return findDigt(digit,count);

    }
}
