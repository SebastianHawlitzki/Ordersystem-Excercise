package de.neuefische;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Map;

public class ShopService  {
//Attribute

    private ProductRepo productRepo;
    private OrderRepo orderRepo;


    // getProduct(){


    //getProductList
    public Map<Integer, Product> listOfAllProducts() {
        return this.productRepo.getProducts();

    }

    //addOrder(){
   // public OrderRepo add(Order order) {
   //     orders.put(order.getOrderID(), order);


    //getOrder(){



//getOrderList
   public Map<Integer, Order> listOfAllOrders(){
        return this.orderRepo.getOrders();

    }


}
