package BankApplication;

public class SavingsAccount extends AbstractBankAccount{

    public SavingsAccount(float balance, float amount) {
        this.balance = balance;
        this.amount = amount;
    }

    @Override
    public void performTransaction() {
        balance-=amount;
        displayBalance();
    }
    public void applyInterest(float interestPercent){
        System.out.println("Amount: "+amount);
        System.out.println("Interest Percent: "+interestPercent);
        amount = (float) (amount * 0.01 * interestPercent);
        System.out.println("Amount with Interest: "+amount);
    }
}