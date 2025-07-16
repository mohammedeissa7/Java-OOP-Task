package service;
import entity.Cart;
import entity.Customer;
public interface CheckoutService {
    void checkout(Cart cart, Customer customer);

}
