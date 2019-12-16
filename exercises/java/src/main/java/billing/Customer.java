package billing;

public class Customer {

    private CustomerType customerType;
    private int products;
    private int adverts;

    public Customer(CustomerType customerType, int adverts, int products) {
        this.customerType = customerType;
        this.products = products;
        this.adverts = adverts;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public int getProducts() {
        return products;
    }

    public int getAdverts() {
        return adverts;
    }
}
