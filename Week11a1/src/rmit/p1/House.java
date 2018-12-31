package rmit.p1;

public class House implements Decorator {

    public void build(){
        System.out.println("Build a house");
    }

    @Override
    public void decorate() {
        build();
    }
}
