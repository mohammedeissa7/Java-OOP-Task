package util;

import entity.Product;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class ProdectInit {
    public static Map<String, Product> productinit() {
        Map<String, Product> products = new HashMap<>();
        products.put(
          "Cheese",
          new Product("Cheese", 400.0, 8, 100.0, true,true, LocalDateTime.of(2026, 10, 1, 0, 0))
        );
        products.put(
                "Biscuits",
                new Product("Biscuits", 400.0, 8, 100.0, true,true, LocalDateTime.of(2026, 10, 1, 0, 0))
        );products.put(
                "TV",
                new Product("TV", 400.0, 8, 100.0)
        );products.put(
                "ScratchCard",
                new Product("Cheese", 400.0, 8, 100.0)
        );

        return products;
    }
}
