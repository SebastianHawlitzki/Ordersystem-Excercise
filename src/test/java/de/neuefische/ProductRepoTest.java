package de.neuefische;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepoTest {
    @Test
    void returnExpectProduct() {
        //given
        ProductRepo repoTest = new ProductRepo();

        //when
        Product actual = repoTest.getProduct(1);

        //then
        //  assertEquals(new Product(1, "Product1"),actual );
        assertEquals("Product1", actual.getProductName());
    }

}