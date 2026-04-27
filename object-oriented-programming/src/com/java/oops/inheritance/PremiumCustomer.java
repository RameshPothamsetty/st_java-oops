package com.java.oops.inheritance;

public class PremiumCustomer extends Customer {
    int shippingCharges;
    String memberShip;

    public PremiumCustomer(int id, String name, String emailAddress, String gender, String adress, int age, Long mobileNumber, int addToCartCOunt, int orders, String coupons, boolean activeStatus, int shippingCharges, String memberShip) {
        super(id, name, emailAddress, gender, adress, age, mobileNumber, addToCartCOunt, orders, coupons, activeStatus);
        this.shippingCharges = shippingCharges;
        this.memberShip = memberShip;
    }
    void displayPremiumCustomerDetails(){
        PremiumCustomer premiumCustomer = new PremiumCustomer(101,"Ramesh","alwaysramesh2003@gmail.com","M","Hyderbad",23,(long)8095789098L,12,35,"SUNDAYFACTORY",true,0,"GOLD");
        displayCustomer();
        System.out.println("Premium Customer Charges = " + premiumCustomer.shippingCharges);
        System.out.println("Premium Customer Membership " + premiumCustomer.memberShip);

    }
}

