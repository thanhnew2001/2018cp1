package rmit.p1;

public class PaintDecorator implements Decorator {

    private Decorator decorator;

    public PaintDecorator(Decorator decorator) {
        this.decorator = decorator;
    }

    @Override
    public void decorate() {
        decorator.decorate();
        System.out.println("Paint the house");
    }
}
