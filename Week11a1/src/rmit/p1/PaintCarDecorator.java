package rmit.p1;

public class PaintCarDecorator implements Decorator {

    private Decorator decorator;

    public PaintCarDecorator(Decorator decorator) {
        this.decorator = decorator;
    }

    @Override
    public void decorate() {
        decorator.decorate();
        System.out.println("Paint the car");
    }
}
