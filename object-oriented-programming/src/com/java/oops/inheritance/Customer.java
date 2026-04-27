package com.java.oops.inheritance;

public class Customer {
    int  id;
    String name;
    String gender;
    String emailAddress;
    String adress;
    int age;
    Long mobileNumber;
    int addToCartCOunt;
    int orders;
    String coupons;
    boolean activeStatus;

    public Customer(int id, String name, String emailAddress, String gender, String adress, int age, Long mobileNumber, int addToCartCOunt, int orders, String coupons, boolean activeStatus) {
        this.id = id;
        this.name = name;
        this.emailAddress = emailAddress;
        this.gender = gender;
        this.adress = adress;
        this.age = age;
        this.mobileNumber = mobileNumber;
        this.addToCartCOunt = addToCartCOunt;
        this.orders = orders;
        this.coupons = coupons;
        this.activeStatus = activeStatus;
    }
    void displayCustomer(){
        Customer customer = new Customer(101,"Ramesh","alwaysramesh2003@gmail.com","M","Hyderbad",23,(long)8095789098L,12,35,"SUNDAYFACTORY",true);
        System.out.println("id = " + customer.id);
        System.out.println("name = " + customer.name);
        System.out.println("emailAddress = " + customer.emailAddress);
        System.out.println("gender = " + customer.gender);
        System.out.println("address = " + customer.adress);
        System.out.println(" age = " + customer.age);
        System.out.println("mobileNumber = " + customer.mobileNumber);
        System.out.println("addToCartCount = " + customer.addToCartCOunt);
        System.out.println("orders = " + customer.orders);
        System.out.println("coupons = " + customer.coupons);
        System.out.println("activeStatus = " + customer.activeStatus);
    }
}

