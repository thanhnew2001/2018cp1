package account;

public class TransactionAccount implements Account {
    private double balance;

    @Override
    public double getAnnualInterest() {
        return balance*0.01;
    }
}
