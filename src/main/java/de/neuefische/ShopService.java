package de.neuefische;



import java.util.Map;

public class ShopService  {
//Attribute

    private ProductRepo productRepo;
    private OrderRepo orderRepo;


    // getProduct(){
    public Product getProduct(int productKey) {
    return  productRepo.getProduct(productKey);
}

    //getProductList
    public Map<Integer, Product> listOfAllProducts() {
        return this.productRepo.getProducts();

    }

    //addOrder(){
    public Order add(Order order){
        return orderRepo.add(order);
    }


    //getOrder(){
    public Order getOrder(int orderKey){
        return orderRepo.getOrder(orderKey);
    }


    //getOrderList
   public Map<Integer, Order> listOfAllOrders(){
        return this.orderRepo.getOrders();

    }


}
