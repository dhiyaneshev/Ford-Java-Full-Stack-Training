package BankApplication;

public class CheckingAccount extends AbstractBankAccount{

    public CheckingAccount(float balance, float amount) {
        this.balance = balance;
        this.amount = amount;
    }

    @Override
    public void performTransaction() {
        if(amount>balance){
            System.out.println("Your Account does not have enough money!!!");
        }
        else{
            balance -= amount;
        }
    }
}