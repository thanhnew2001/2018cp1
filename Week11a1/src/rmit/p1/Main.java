package rmit.p1;

public class Main {

    public static void main(String[] args) {

//        House house = new House();
//        house.decorate();

        Decorator decorator = new PaintDecorator(new House());

        decorator.decorate();

    }
}
