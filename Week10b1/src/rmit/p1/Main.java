package rmit.p1;

public class Main {

    public static void main(String[] args){
        StudentList studentList = StudentList.INSTANCE;

        Account account = new Account(10);

        AccountMemento accountMemento = account.backup();

        account.setBalance(15);

        System.out.println(account);

        account.restore(accountMemento);

        System.out.println(account);

    }
}

