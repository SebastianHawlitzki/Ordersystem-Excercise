package de.neuefische;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
@AllArgsConstructor
public class Order {
    //Attribute

    private int orderID;


    List<Product> products = new ArrayList<>();





}
