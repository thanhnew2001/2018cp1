package rmit.p1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        CustomerList list = new CustomerList();
        Customer customer1 = new Customer("1", "Huy", "8382782", "hcmc");
        Customer customer2 = new Customer("2", "Hung", "8382782", "hcmc");
        Customer customer3 = new Customer("3", "Hoang", "8382782", "hcmc");

        list.add(customer1);
        list.add(customer2);
        list.add(customer3);

        for (Customer c: list.getCustomers()){
            System.out.println(c);
        }
        System.out.println("Search result:");
        for (Customer c: list.search("ng")){
            System.out.println(c);
        }

//        list.delete("1");
//        System.out.println("new list after deleting");
//        for (Customer c: list.getCustomers()){
//            System.out.println(c);
//        }
//        System.out.println("new list after updating");
//        customer2.setName("BBBBBBBBBB");
//        list.update(customer2);
//        for (Customer c: list.getCustomers()){
//            System.out.println(c);
//        }

    }
}
