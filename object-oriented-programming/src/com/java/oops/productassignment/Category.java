package com.java.oops.productassignment;

public enum Category {

    ELECTRONICS("Electronics"),
    CLOTHING("Clothing"),
    ACCESSORIES("Accessories"),
    HOME_APPLIANCES("Home Appliances");

    private String displayName;

    Category(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}