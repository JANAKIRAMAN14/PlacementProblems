package Assignment7;
import java.util.*;
public class Calculator {
    int result ;
    static int operationCount ;
    public void add(int a ,int b){
        result = a + b;
        operationCount++;
    }
    static int  countDisplay(){
        return operationCount;
    }
    public static void main(String[] args) {
         Calculator calculator = new Calculator();
         calculator.add(10,20);
         calculator.add(100001,12345);
         int  res = calculator.countDisplay();
        System.out.println(operationCount + " " +"Number of Times :");
    }
}
