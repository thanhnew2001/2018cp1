package account;

public class SavingAccount implements Account {
    private double balance;

    @Override
    public double getAnnualInterest() {
        return balance*0.1;
    }
}
