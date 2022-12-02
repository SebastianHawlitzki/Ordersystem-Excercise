package de.neuefische;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class OrderRepoTest {
@Test
void expectReturnNewOrder() {
    //given
    Map<Integer, Order> orders = new HashMap<>();
    OrderRepo repoTest = new OrderRepo(orders);

    //when
    Order actual = repoTest.getOrder(1);

    //then
    //  assertEquals(new Product(1, "Product1"),actual );
    assertEquals(null, actual);
}

@Test
void newOrderEqualsOrderKey() {
    //given
    Map<Integer, Order> orders = new HashMap<>();

    OrderRepo repoTest = new OrderRepo(orders);

    List<Product> products = new ArrayList<>();

    orders.put(1, new Order(10, products ));
    //when
    Order actual = repoTest.getOrder(1);

    //then
    //  assertEquals(new Product(1, "Product1"),actual );
    assertEquals(new Order(10, products), actual);
}


}