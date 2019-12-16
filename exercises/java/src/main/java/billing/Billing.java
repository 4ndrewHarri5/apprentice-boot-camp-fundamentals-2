package billing;

public class Billing {

    private final Customer customer;

    public Billing(Customer customer) {
        this.customer = customer;
    }

    private int calculateProductCost() {
        return 10 * customer.getProducts() * customer.getAdverts();
    }

    private int calculateAdvertCost() {
        int advertCost = 0;
        int customerAdverts = customer.getAdverts();
        switch (customer.getCustomerType()) {
            case PRIVATE:
                advertCost = customerAdverts * 20;
                break;
            case DEALER:
                advertCost = customerAdverts * 50;
                break;
        }
        return advertCost;
    }

    public int getBill() {
        return calculateAdvertCost() + calculateProductCost();
    }

}
