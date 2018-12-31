package rmit.p1;

import java.util.ArrayList;

//properties: id, name, address, telephone, email, website
//methods: sellAProduct, receivePayment
public class Shop {
    private String id;
    private String name;
    private String address;
    private ArrayList<Product> products = new ArrayList<>();

    public void addAProduct(Product product){
        products.add(product);
    }

    public void sellAProduct(Product product){
        products.remove(product);
    }

    public void printAllProducts(){
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i));
        }
    }

    public Shop(String id, String name) {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

//Excercise:
//Create a class named Student: id, name
//Create another class named Class: id, name
//methods: addStudent, removeStudent etc.


