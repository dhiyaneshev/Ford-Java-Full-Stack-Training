package BankApplication;

import java.util.Scanner;

public class Polymorphism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//    boolean flag = true;
//
//    while(flag){
//        System.out.println("*******Bank Application********");
//        System.out.println("Index:-");
//        System.out.println("1 -> Withdraw");
//        System.out.println("2 -> Deposit");
//        System.out.println("3 -> display balance");
//        System.out.println("4 -> exit");
//    }
        SavingsAccount savingsAccount = new SavingsAccount(20000,345);

        savingsAccount.performTransaction();
        savingsAccount.displayBalance();
        savingsAccount.applyInterest(10);

        CheckingAccount checkingAccount = new CheckingAccount(20000,345);
        checkingAccount.performTransaction();
        checkingAccount.displayBalance();
    }

}