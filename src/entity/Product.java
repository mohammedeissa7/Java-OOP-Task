package entity;
import java.time.LocalDateTime;

public class Product {

    private String productName;
    private double productPrice;
    private int productQuantity;
    private double productWeight;
    private boolean expireable;
    private boolean shipable;
    LocalDateTime expirationDate;


    public Product(String productName, double productPrice, int productQuantity, double productWeight) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
        this.productWeight = productWeight;

    }
    public Product(String productName, double productPrice, int productQuantity, double productWeight, boolean expireable, boolean shipable,LocalDateTime expirationDate) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
        this.productWeight = productWeight;
        this.expireable = expireable;
        this.shipable = shipable;
        this.expirationDate = expirationDate;

    }



    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public double getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public double getProductWeight() {
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

    public LocalDateTime getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDateTime expirationDate) {
        this.expirationDate = expirationDate;
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
