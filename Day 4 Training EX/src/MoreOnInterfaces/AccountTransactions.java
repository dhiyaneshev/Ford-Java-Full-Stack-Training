package moreoninterfaces;

import java.util.Scanner;

interface AccountInterface{
    void deposit(int transactionAmount);
    void withdraw(int transactionAmount);
}

class Account implements AccountInterface{
    private String accountNumber;
    private int balance;

    public Account(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int transactionAmount){
        balance+=transactionAmount;
    }

    public void withdraw(int transactionAmount){
        if(balance<transactionAmount){
            System.out.println("Insufficient Balance!");
        }else{
            balance-=transactionAmount;
        }
    }
}

public class AccountTransactions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Account Number");
        String accNo = sc.nextLine();
        System.out.println("Enter the Account Balance");
        int balance = sc.nextInt();
        Account account = new Account(accNo, balance);
        System.out.println("Enter 1 to deposit an amount, 2 to withdraw an amount");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Enter the amount to deposit");
                int depositAmount = sc.nextInt();
                account.deposit(depositAmount);
                break;
            case 2:
                System.out.println("Enter the amount to withdraw");
                int withdrawAmount = sc.nextInt();
                account.withdraw(withdrawAmount);
                break;
        }
        System.out.println("Your balance after the transaction is: "+account.getBalance());
    }
}