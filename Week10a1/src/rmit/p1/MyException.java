package rmit.p1;

public class MyException extends Exception {
    public MyException(String message) {
        super(message);
        System.out.println("Myexception::"+message);
    }
}
