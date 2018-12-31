package rmit.p1;

public class LightDecorator implements Decorator {
    private Decorator decorator;

    public LightDecorator(Decorator decorator) {
        this.decorator = decorator;
    }

    @Override
    public void decorate() {
        decorator.decorate();
        System.out.println("Put lights");
    }
}
