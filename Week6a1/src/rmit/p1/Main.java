package rmit.p1;

public class Main {

    public static void main(String[] args) {

        Product product1 = new Product("phone", "iPhone");
        Product product2 = new Product("laptop", "Zenbook Asus");

        Shop shop = new Shop("shop1", "Vinmart");
        shop.addAProduct(product1);
        shop.addAProduct(product2);

        shop.printAllProducts();
    }
}
