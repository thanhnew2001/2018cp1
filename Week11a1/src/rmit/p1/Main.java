package rmit.p1;

public class Main {

    public static void main(String[] args) {

//        House house = new House();
//        house.decorate();

        Decorator decorator = new PaintDecorator(new LightDecorator(new House()));
        decorator.decorate();

        Decorator carDecorator = new PaintCarDecorator(new Car());
        carDecorator.decorate();

    }
}
