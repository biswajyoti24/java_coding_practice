package com.example.demo1.practiceProgrammes;

import java.util.ArrayList;
import java.util.List;

public class javaStream {
    public static  void main(String[] args){
        System.out.println("Add A list od product");
        List <Product> productList = new ArrayList<>();
        productList.add(new Product(1,"Cycle",2000));
        productList.add(new Product(2,"Mobile",10000));
        productList.add(new Product(3,"Car",200000));
        productList.add(new Product(4,"Truck",300000));
        productList.add(new Product(5,"Tv",15000));
        productList.add(new Product(6,"Laptop",30000));

        System.out.println("productList"+":"+productList.get(0).product_name);
        productList.stream().filter(product -> product.product_price<15000);

    }
}
