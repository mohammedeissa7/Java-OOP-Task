//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import entity.Product;

import java.util.Map;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Product product = new Product("makarona",122.0, 12,122.0);

        System.out.println("Product Name: " + product.getProductName());


    }
}
