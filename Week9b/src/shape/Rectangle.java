package shape;

public class Rectangle implements Shape {
    private double a;
    private double b;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return a*b;
    }

    //Excercise 3: define an interface called Drawer: draw()
    //Implement BorderDrawer, ColorDrawer

    //Exercise 4: define a bank account as interface: calculateAnnualInterest()
    //Implement 2 types:
    // DepositAccount: 10%
    // TransactionAccount: 1%

    //Exercise 5: define an interface StudentManager:
    //methods: add, getAll, get
    //FileStudentManager
    //InMemoryStudentManager
}
