package checkout;

import java.util.List;
import java.util.stream.Collectors;

class Receipt {

    private String text = "";
    private int total;

    void generate(List<Product> products) {
        String receiptText = products.stream().map(product -> {
            if (product.getDiscount() != 0) {
                final long numberOfProductsOfThatProduct = products.stream().filter(p -> p.equals(product)).count();
                if(numberOfProductsOfThatProduct % product.getNumberToTrigger() == 0) {
                    text += " - " + product.getDiscount() + " (" + product.getNumberToTrigger() + " for " + product.getTotalForDiscount() + " )";
                    total += product.getPrice() - product.getDiscount();
                }else{
                    total += product.getPrice();
                }
                text += "\n";
            }
            return "";
        }).collect(Collectors.joining());
    }

    void scannedA() {
        text += "A: 50";
        if (++numberOfA % 5 == 0){
            text += " - 30 (5 for 220)";
            total += 20;
        }
        else {
            total += 50;
        }
        text += "\n";
    }

    void scannedB() {
        text += "B: 30";
        if (++numberOfB % 2 == 0) {
            text += " - 15 (2 for 45)";
            total += 15;
        }
        else {
            total += 30;
        }
        text += "\n";
    }

    void scannedC() {
        text += "C: 20\n";
        total += 20;
    }

    void scannedD() {
        text += "D: 15\n";
        total += 15;
    }

    String getText() {
        return text + "Total: " + total;
    }

    int getTotal() {
        return total;
    }
}
