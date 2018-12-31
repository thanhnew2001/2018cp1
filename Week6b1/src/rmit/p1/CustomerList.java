package rmit.p1;

import java.util.ArrayList;
import java.util.List;

public class CustomerList {

    private List<Customer> customers = new ArrayList<>();

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
    public void add(Customer customer){
        this.customers.add(customer);
    }
    //delete by id
    public void delete(String id){
        for (int i = 0; i < this.customers.size() ; i++) {
            Customer customer = this.customers.get(i);
            if(customer.getId().equalsIgnoreCase(id)){
                this.customers.remove(i);
                break;
            }
        }
    }
    //update?
    public void update(Customer newCustomer){
        for (Customer customer: this.customers)
        {
            if(customer.getId().equalsIgnoreCase(newCustomer.getId())){
                this.customers.remove(customer);
                this.customers.add(newCustomer);

                break;
            }
        }
    }

    //get 1 customer by id
    public Customer get(String id){
        for(Customer c: customers){
            if(c.getId().equalsIgnoreCase(id))
                return c;
        }
        return null;
    }

    //get all customers
    public List<Customer> getAll(){
        return this.customers;
    }

    //search customers by name, address, phone
    public List<Customer> search(String keyword){
        List<Customer> result = new ArrayList<>();
        for(Customer c: customers){
           if(c.getName().indexOf(keyword)>-1 || c.getAddress().indexOf(keyword)>-1){
              result.add(c);
           }
        }
        return result;
    }
}
