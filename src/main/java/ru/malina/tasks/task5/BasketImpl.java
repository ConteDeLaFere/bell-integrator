package ru.malina.tasks.task5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BasketImpl implements Basket {

    private final Map<String, Integer> products;

    public BasketImpl() {
        products = new HashMap<>();
    }

    @Override
    public void addProduct(String product, int quantity) {
        products.put(product, Math.max(quantity, 0));
    }

    @Override
    public void removeProduct(String product) {
        products.remove(product);
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        products.put(product, Math.max(quantity, 0));
    }

    @Override
    public void clear() {
        products.clear();
    }

    @Override
    public List<String> getProducts() {
        return products.keySet()
                .stream()
                .toList();
    }

    @Override
    public int getProductQuantity(String product) {
        return products.getOrDefault(product, 0);
    }
}
