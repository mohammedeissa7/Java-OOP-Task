package util;


import entity.Cart;
import entity.Product;

import java.util.List;
import java.util.Scanner;

public class InputUtility {

    private static Scanner scanner = new Scanner(System.in);
    public static void displayMainMenu() {

        System.out.println("MAIN MENU");
        System.out.println("1. View Inventory");
        System.out.println("2. Add Item to Cart");
        System.out.println("3. View Cart");
        System.out.println("4. Exit");

    }

    public static void displayProducts(List<Product> products) {
        System.out.println("PRODUCTS");
        String format = "%-15s | %-10s | %-5s | %-10s | %-10s%n";
        System.out.printf(format, "Product", "Price", "Stock", "Shippable", "Expirable");


        products.forEach(product -> System.out.printf(
                format, product.getProductName(), product.getProductPrice(),
                product.getProductQuantity() )
        );
    }

    public static Object[] enterProduct() {
        System.out.print("Enter product name: ");
        String productName = scanner.nextLine().trim();

        System.out.print("Enter quantity: ");
        int requiredQuantity = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Added " + requiredQuantity + " of '" + productName + "' to your cart");

        return new Object[]{productName, requiredQuantity};
    }

    public static void displayCart(Cart cart) {
        List<Product> products = cart.getProducts();

        System.out.println("CART");
        products.forEach(product -> System.out.printf(product.toString()));


    }
}
