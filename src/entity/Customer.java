package entity;

public class Customer {
    private int Customerid;
    private String CustomerfullName;
    private double Customerbalance;
    private String CustomermobileNumber;

    public Customer() {
    }

    public Customer(int Customerid, String CustomerfullName, String CustomermobileNumber, double Customerbalance) {
        this.Customerid = Customerid;
        this.CustomerfullName = CustomerfullName;
        this.Customerbalance = Customerbalance;
        this.CustomermobileNumber = CustomermobileNumber;
    }

    public boolean hasBalance(double amount) {
        return Customerbalance >= amount;
    }

    public void deductBalance(double amount) {
        if (hasBalance(amount)) {
            Customerbalance -= amount;
        }
    }


    public int getCustomerid() {
        return Customerid;
    }

    public void setCustomerid(int customerid) {
        Customerid = customerid;
    }

    public String getCustomerfullName() {
        return CustomerfullName;
    }

    public void setCustomerfullName(String customerfullName) {
        CustomerfullName = customerfullName;
    }

    public String getCustomermobileNumber() {
        return CustomermobileNumber;
    }

    public void setCustomermobileNumber(String customermobileNumber) {
        CustomermobileNumber = customermobileNumber;
    }

    public double getCustomerbalance() {
        return Customerbalance;
    }

    public void setCustomerbalance(double customerbalance) {
        Customerbalance = customerbalance;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "Customerid=" + Customerid +
                ", CustomerfullName='" + CustomerfullName + '\'' +
                ", Customerbalance=" + Customerbalance +
                '}';
    }
}
