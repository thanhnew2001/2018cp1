package rmit.p1;

public class Product {

    private final static String VIETNAM = "Vietnam";
    private String id;
    private String name;
    private String desc;
    private String madeIn;
    private double price;
    private double discount;
    //methods


    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", madeIn='" + madeIn + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                '}';
    }

    public double calculateFinalPrice(){
        return price*(1-discount);
    }

    public boolean isLocalProduct(){
        if(madeIn.equalsIgnoreCase(VIETNAM))
            return true;
        else
            return false;
    }


    public Product(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
