package ru.malina.tasks.task5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BasketImplTest {

    @Autowired
    private BasketImpl basket;

    @AfterEach
    void tearDown() {
        basket.clear();
    }

    @Test
    void addProduct() {
        basket.addProduct("Mouse", 15);
        basket.addProduct("Keyboard", 10);
        basket.addProduct("Screen", 12);

        assertEquals(3, basket.getProducts().size());
    }

    @Test
    void removeProduct() {
        basket.addProduct("Mouse", 15);
        basket.addProduct("Keyboard", 10);
        basket.addProduct("Screen", 12);

        basket.removeProduct("Mouse");
        basket.removeProduct("Screen");

        assertEquals(1, basket.getProducts().size());
        assertEquals(10, basket.getProductQuantity("Keyboard"));
    }

    @Test
    void updateProductQuantity() {
        basket.addProduct("Mouse", 15);
        basket.updateProductQuantity("Mouse", 20);

        assertEquals(20, basket.getProductQuantity("Mouse"));
    }

    @Test
    void clear() {
        basket.addProduct("Mouse", 15);
        basket.addProduct("Keyboard", 10);
        basket.addProduct("Screen", 12);

        basket.clear();

        assertEquals(0, basket.getProducts().size());
    }

    @Test
    void getProducts() {
        basket.addProduct("Mouse", 15);
        basket.addProduct("Keyboard", 10);
        basket.addProduct("Screen", 12);

        List<String> actualResult = basket.getProducts();

        assertTrue(actualResult.containsAll(List.of("Mouse", "Keyboard", "Screen")));
    }

    @Test
    void getProductQuantity() {
        basket.addProduct("Keyboard", 10);

        assertEquals(10, basket.getProductQuantity("Keyboard"));
    }
}