package abstractclasses;

import java.util.Scanner;

abstract class Account {
    // Attributes: accountNumber, balance
    String accountNumber;
    double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    abstract void deposit(double amount);
    abstract void withdraw(double amount);
}
class SavingsAccount extends Account {
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    void deposit(double amount) {
        System.out.println("After deposit of "+amount+": SavingsAccount Balance = "+(balance+amount));
    }

    @Override
    void withdraw(double amount) {
        System.out.println("After withdraw of "+amount+": SavingsAccount Balance = "+(balance-amount));
    }

}
class CurrentAccount extends Account {
    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    void deposit(double amount) {
        System.out.println("After deposit of "+amount+": CurrentAccount Balance = "+(balance+amount));
    }

    @Override
    void withdraw(double amount) {
        System.out.println("After withdraw of "+amount+": CurrentAccount Balance = "+(balance-amount));
    }
}


public class BankingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("For SavingsAccount: ");
        System.out.print("Account Number = ");
        String savingsAccNo = sc.nextLine();
        System.out.print("Initial Balance = ");
        double savingsBalance = sc.nextDouble();
        sc.nextLine();
        SavingsAccount savingsAccount = new SavingsAccount(savingsAccNo, savingsBalance);

        System.out.println("For CurrentAccount: ");
        System.out.print("Account Number = ");
        String currentAccNo = sc.nextLine();
        System.out.print("Initial Balance = ");
        double currentBalance = sc.nextDouble();
        sc.nextLine();
        CurrentAccount currentAccount = new CurrentAccount(currentAccNo, currentBalance);

        savingsAccount.deposit(2000);
        currentAccount.withdraw(1500);
    }
}