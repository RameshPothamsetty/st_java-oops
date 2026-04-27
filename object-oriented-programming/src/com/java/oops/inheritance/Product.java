package com.java.oops.inheritance;

public class Product {
    int id;
    String name;
    int maxRetailPrice;
    float rating;
    int reviewsCount;
    byte discountPercentage;
    boolean isAvailable;


    public Product(String name, int id, int maxRetailPrice, float rating, int reviewsCount, byte discountPercentage, boolean isAvailable) {
        this.name = name;
        this.id = id;
        this.maxRetailPrice = maxRetailPrice;
        this.rating = rating;
        this.reviewsCount = reviewsCount;
        this.discountPercentage = discountPercentage;
        this.isAvailable = isAvailable;
    }

    int calculateFinalPrice(RegularCustomer customer){
        int  finalPrice= maxRetailPrice-(maxRetailPrice * discountPercentage / 100)+50;
        return finalPrice;


    }

    int calculateFinalPrice(PremiumCustomer customer){
        discountPercentage+=20;
        int finalPrice = maxRetailPrice-(maxRetailPrice * discountPercentage / 100);
        return finalPrice;
    }


}
