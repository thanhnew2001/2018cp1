package rmit.p1;

import shape.Circle;
import shape.Shape;

public class Main {

    public static void main(String[] args) {

        Person am = new American();
        am.eat();

        Person it = new Italian();
        it.eat();

        Person vn = new Vietnamese();
        vn.eat();

        Shape c = new Circle(10);
        System.out.println(c.getArea());

    }
}
