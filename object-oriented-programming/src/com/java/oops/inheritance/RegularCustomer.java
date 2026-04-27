package com.java.oops.inheritance;

public class RegularCustomer extends Customer {
    int shippingCharges;
    String memberShip;

    public RegularCustomer(int id, String name, String emailAddress, String gender, String adress, int age, Long mobileNumber, int addToCartCOunt, int orders, String coupons, boolean activeStatus, int shippingCharges, String memberShip) {
        super(id, name, emailAddress, gender, adress, age, mobileNumber, addToCartCOunt, orders, coupons, activeStatus);
        this.shippingCharges = shippingCharges;
        this.memberShip = memberShip;


    }

    void displayRegularCustomerDetails(){
        RegularCustomer regularCustomer = new RegularCustomer(101,"Ramesh","alwaysramesh2003@gmail.com","M","Hyderbad",23,(long)8095789098L,12,35,"SUNDAYFACTORY",true,50,"SILVER");
        displayCustomer();
        System.out.println(" Regular Customer Shipping Charges = " + regularCustomer.shippingCharges);
        System.out.println("Regular Customer Membership = " + regularCustomer.memberShip);
    }
}
