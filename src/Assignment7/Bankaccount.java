package Assignment7;
import java.util.*;
public class Bankaccount {
    Scanner sc = new Scanner(System.in);
    private int balance = sc.nextInt();
    void deposit(int deposit){
        System.out.println("");
        balance += deposit;

        System.out.println("Deposit succesfully created :" + deposit);
    }
    void getBalance(){
        System.out.println("Now , I have Balance :" + balance);
    }
    public static void main(String[] args) {
        Bankaccount bankaccount = new Bankaccount();
        bankaccount.deposit(1000);
        bankaccount.getBalance();
    }
}
