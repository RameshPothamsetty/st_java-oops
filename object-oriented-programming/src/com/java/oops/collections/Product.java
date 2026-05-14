package com.java.oops.collections;

import java.util.Objects;

public class Product {
    int id;
    String name;
    Long maxRetailPrice;
    float rating;
    int reviewsCount;
    byte discountPercentage;
    boolean isAvailable;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", maxRetailPrice=" + maxRetailPrice +
                ", rating=" + rating +
                ", reviewsCount=" + reviewsCount +
                ", discountPercentage=" + discountPercentage +
                ", isAvailable=" + isAvailable +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id && Float.compare(rating, product.rating) == 0 && reviewsCount == product.reviewsCount && discountPercentage == product.discountPercentage && isAvailable == product.isAvailable && Objects.equals(name, product.name) && Objects.equals(maxRetailPrice, product.maxRetailPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, maxRetailPrice, rating, reviewsCount, discountPercentage, isAvailable);
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

