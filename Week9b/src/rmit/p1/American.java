package rmit.p1;

public class American implements Person, Animal {
    @Override
    public void eat() {
        System.out.println("Hamburger");
    }

    @Override
    public void move() {

    }

    @Override
    public void sleep() {
        System.out.println("American sleep");
    }
    //Exercise: define an interface called Shape: getArea
    //Implement 2 subclasses: Circle, Rectangle


}
