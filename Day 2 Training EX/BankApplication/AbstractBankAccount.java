package BankApplication;

public abstract class AbstractBankAccount implements BankAccount{
    float balance;
    float amount;
    public void displayBalance() {
        System.out.println("Balance Amount: "+balance);
    }


}