package com.java.oops.collections;

import java.util.HashSet;

public class HashSetTest {
    static void main(String[] args) {
        HashSet<Product> hs = new HashSet<>();
        hs.add(new Product(1,"Laptop",300000L, 20F,3, (byte) 25,true));
        hs.add(new Product(2,"Mobile",40000l,30f,4, (byte) 25,true));
//        hs.add(new Product(1,"Laptop",300000L, 20F,3, (byte) 25,true));

        hs.add(new Product(3,"Fridge",50000l,40f,5, (byte) 30,true));
        hs.add(new Product(2,"Bike",800000l,90f,6, (byte) 40,true));
        System.out.println(hs);

    }
}
