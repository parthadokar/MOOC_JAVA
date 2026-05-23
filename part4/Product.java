package part4;

public class Product {
    private String inititalName;
    private double inititalPrice;
    private int initialQuantity;

    public Product (String inititalName, double inititalPrice, int initialQuantity) {
        this.inititalName = inititalName;
        this.inititalPrice = inititalPrice;
        this.initialQuantity = initialQuantity;
    }

    public void printProduct() {
        System.out.println(this.inititalName + " , price " + this.inititalPrice + " ," + this.initialQuantity + "pcs");
    }
}
