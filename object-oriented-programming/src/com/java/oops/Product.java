package com.java.oops;

public class Product {
    int id;
    String name;
    Long maxRetailPrice;
    float rating;
    int reviewsCount;
    byte discountPercentage;
    boolean isAvailable;

    public Product() {
        id = 110;
        name = "sreya";
        maxRetailPrice = 32000L;
        rating = 3.5F;
        reviewsCount = 30;
        discountPercentage = 25;
        isAvailable = true;

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

    // no arguments no return type
    void displayProductDetails(){
        Product product = new Product();
        System.out.println("id = " + product.id);
        System.out.println("name = " + product.name);
        System.out.println("maxRetailPrice = " + product.maxRetailPrice);
        System.out.println("rating = " + product.rating);
        System.out.println("reviewsCount = " + product.reviewsCount);
        System.out.println("discountPercentage =" + product.discountPercentage);
        System.out.println("isAvailable = " + product.isAvailable);
    }

    void displayProductByCompany(String Company){
        System.out.println("Displaying Product =" + Company);
    }
/* arguments with no return type */
    void displayProductByCategoryAndManufacturedYear(String Category, int Year){
        System.out.println("Displaying Category and Manufactured Year =" + Category+  "..." + Year);
    }

    // with return type no aruments

    long totalInventoryValue(){
        long totalInventoryValue=2343546789L;
        return totalInventoryValue;
    }

    // with return type and with arguments

    long totalEarnings(int Year){
        long totalEarnings=5467890L;
        return totalEarnings;
    }
}
