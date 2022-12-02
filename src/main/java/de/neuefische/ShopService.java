package de.neuefische;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Map;

public class ShopService  {
//Attribute

    private ProductRepo productRepo;
    private OrderRepo orderRepo;

    // Methoden

   // getProduct(){




    public Map<Integer, Product> listOfAllProducts() {
        return this.productRepo.getProducts();

    }

    //addOrder(){



    //getOrder(){



   public Map<Integer, Order> listOfAllOrders(){
        return this.orderRepo.getOrders();

    }


}
