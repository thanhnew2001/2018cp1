package rmit.p1.product;

public class Phone extends Product {
    private double screenSize;
    private double screenResolution;
    private double frontCameraResolution;
    private double rearCamera1Resolution;
    @Override
    public void display() {
        System.out.println("Screen size " + screenSize);
        System.out.println("Screen resolution " + screenResolution);
    }
}
