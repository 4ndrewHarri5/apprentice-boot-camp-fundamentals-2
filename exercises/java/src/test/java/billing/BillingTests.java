package billing;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class BillingTests {

    @Test
    public void givenDealerWith20AdvertsAndAdvertPromotionProductThenTotalIs1200() {

        Customer customer = new Customer(CustomerType.DEALER, 20, 1);
        Billing billing = new Billing(customer);

        int bill = billing.getBill();

        Assertions.assertThat(bill).isEqualTo(1200);

    }

    @Test
    public void givenDealerWith1000AdvertsWithFinanceAndValuationProductThenTotalIs70000() {

        Customer customer = new Customer(CustomerType.DEALER, 1000, 2);
        Billing billing = new Billing(customer);

        int bill = billing.getBill();

        Assertions.assertThat(bill).isEqualTo(70000);

    }

    @Test
    public void givenPrivateSellerWith3AdvertsWithNoProductsThenTotalIs60() {

        Customer customer = new Customer(CustomerType.PRIVATE, 3, 0);
        Billing billing = new Billing(customer);

        int bill = billing.getBill();

        Assertions.assertThat(bill).isEqualTo(60);

    }

    @Test
    public void givenPrivateSellerWith1AdvertsWith1ProductThenTotalIs30() {

        Customer customer = new Customer(CustomerType.PRIVATE, 1, 1);
        Billing billing = new Billing(customer);

        int bill = billing.getBill();

        Assertions.assertThat(bill).isEqualTo(30);

    }

}
