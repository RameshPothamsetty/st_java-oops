package com.java.oops;

public class Product {
    int id;
    String name;
    Long maxRetailPrice;
    float rating;
    int reviewsCount;
    byte discountPercentage;
    boolean isAvailable;

    public Product(){
        id=110;
        name="sreya";
        maxRetailPrice= 32000L;
        rating=3.5F;
        reviewsCount=30;
        discountPercentage=25;
        isAvailable=true;

    }

    public Product(int id, String name, Long maxRetailPrice, float rating, int reviewsCount, byte discountPercentage, boolean isAvailable) {
        this.id = id;
        this.name = name;
        this.maxRetailPrice = maxRetailPrice;
        this.rating = rating;
        this.reviewsCount = reviewsCount;
        this.discountPercentage = discountPercentage;
        this.isAvailable = isAvailable;
    }
}
