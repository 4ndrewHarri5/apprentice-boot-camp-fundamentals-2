package checkout;

public enum Product {

    A(50, 5, 30, 220),
    B(30, 2, 15, 45),
    C(20, 0, 0, 0),
    D(15, 0, 0, 0);

    private int price;
    private int numberToTrigger;
    private int discount;
    private int totalForDiscount;

    Product(int price, int numberToTrigger, int discount, int totalForDiscount) {
        this.price = price;
        this.numberToTrigger = numberToTrigger;
        this.discount = discount;
        this.totalForDiscount = totalForDiscount;
    }

    public static Product parse(String stockKeepingUnit) {
        if (stockKeepingUnit.equals("A")) {
            return Product.A;
        }
        if (stockKeepingUnit.equals("B")) {
            return Product.B;
        }
        if (stockKeepingUnit.equals("C")) {
            return Product.C;
        }
        if (stockKeepingUnit.equals("D")) {
            return Product.D;
        }
    }

    public int getPrice() {
        return price;
    }

    public int getNumberToTrigger() {
        return numberToTrigger;
    }

    public int getDiscount() {
        return discount;
    }

    public int getTotalForDiscount() {
        return totalForDiscount;
    }

}
