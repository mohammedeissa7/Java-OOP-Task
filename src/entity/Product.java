package entity;

public class Product {

    private String productName;
    private String productPrice;
    private int productQuantity;
    private int productWeight;
    private boolean expireable;
    private boolean shipable;

    public Product() {
    }

    public Product(String productName, String productPrice, int productQuantity, int productWeight) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
        this.productWeight = productWeight;

    }



    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public int getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(int productWeight) {
        this.productWeight = productWeight;
    }

    public boolean isExpireable() {
        return expireable;
    }

    public void setExpireable(boolean expireable) {
        this.expireable = expireable;
    }

    public boolean isShipable() {
        return shipable;
    }

    public void setShipable(boolean shipable) {
        this.shipable = shipable;
    }

    @Override
    public String toString() {
        return "Product{" +
                "Name='" + productName + '\'' +
                ", Price='" + productPrice + '\'' +
                ", Quantity=" + productQuantity +
                '}';
    }
}
