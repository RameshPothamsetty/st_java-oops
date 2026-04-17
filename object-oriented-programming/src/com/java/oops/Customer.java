package com.java.oops;

public class Customer {
    int id;
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


    //No argument Constructor
    public  Customer(){
        id=1;
        name="Ramu";
        gender="M";
        emailAddress="rap678@gmail.com";
        age=18;
        mobileNumber=9848576011L;
        addToCartCOunt=29;
        orders=25;
        coupons="SUNDAYSPECIAL2026";
        activeStatus=true;





    }
    //Argument Constructor
    public Customer(int id, String name, String gender, String emailAddress, String adress, int age, Long mobileNumber, int addToCartCOunt, int orders, String coupons, boolean activeStatus) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.emailAddress = emailAddress;
        this.adress = adress;
        this.age = age;
        this.mobileNumber = mobileNumber;
        this.addToCartCOunt = addToCartCOunt;
        this.orders = orders;
        this.coupons = coupons;
        this.activeStatus = activeStatus;
    }
}


