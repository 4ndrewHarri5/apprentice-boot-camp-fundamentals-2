package checkout;

import java.util.ArrayList;
import java.util.List;

class Checkout {
    private int total;
    private List<Product> allProducts;
    private Receipt receipt = new Receipt();

    public Checkout() {
        allProducts = new ArrayList<>();
    }

    void scan(String sku) {

        Product product = Product.parse(sku);
        allProducts.add(product);

        /*if ("A".equals(sku)) {
            total += 50;
            if (++numberOfA % 5 == 0) {
                total -= 30;
            }
            receipt.scannedA();
        } else if ("B".equals(sku)) {
            total += 30;
            if (++numberOfB % 2 == 0) {
                total -= 15;
            }
            receipt.scannedB();
        } else if ("C".equals(sku)) {
            total += 20;
            receipt.scannedC();
        } else if ("D".equals(sku)) {
            total += 15;
            receipt.scannedD();
        }*/
    }

    int total() {
        return receipt.getTotal();
    }

    String receipt() {
        return receipt.getText();
    }
}
