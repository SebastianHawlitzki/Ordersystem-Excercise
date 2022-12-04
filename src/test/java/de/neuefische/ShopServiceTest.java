package de.neuefische;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ShopServiceTest {

    @Test
    void getListOfAllProducts() {
        //given
        Map<Integer, Product> products = Map.of(
                1, new Product(1, "Product1"),
                2, new Product(2, "Product2"),
                3, new Product(3, "Product3"),
                4, new Product(4, "Product4")
        );


        //when
        Map actual = products;

        //then
        //  assertEquals(new Product(1, "Product1"),actual );
        assertEquals(products, actual);
    }






    @Test
    void getListOfAllOrders() {
        //given
        Map<Integer, Order> orders = new HashMap<>();


        //when
        Map actual = orders;

        //then
        assertEquals(orders, actual);
    }
}