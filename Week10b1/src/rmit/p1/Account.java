package rmit.p1;

public class Account {

    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                '}';
    }


    //backup method
    public AccountMemento backup(){
       return new AccountMemento(this.balance);
    }

    //restore method
    public void restore(AccountMemento accountMemento){
        this.balance = accountMemento.getBalance();
    }
}
//Create class called Student: String name
//Create a memento for this class

