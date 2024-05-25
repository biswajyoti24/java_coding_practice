package com.example.demo1.hackerrank;

import java.util.*;
import java.util.stream.Collectors;

class Product{
    int id;
    String name;
    float price;
    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
public class JavaStreamExample {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));
        // This is more compact approach for filtering data  
        List<Product> productsList1 = productsList.stream()
                .filter(product -> product.price < 30000).collect(Collectors.toList());

//        System.out.println(productsList);
//        System.out.println(productsList1);
        productsList.stream()
                .filter(product -> product.price < 30000).forEach(x-> System.out.println(x.name +" - "+ x.price));

        Float totalPrice = productsList.stream()
                .filter(product->product.price < 30000)
                .map(product->product.price)
                .reduce(0.f,(sum, price)->sum+price);   // accumulating price
        System.out.println(totalPrice);

        Float price = productsList.stream().findFirst().get().price;
        Float price1 = productsList.stream().filter(x-> x.name == "Sony Laptop").findFirst().get().price;
        System.out.println(price);
        System.out.println(price1);

    }
}  