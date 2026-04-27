package com.java.oops.inheritance;

public class Main {

    static void main() {
        Customer customer;
        customer = new Customer(101,"Ramesh","alwaysramesh2003@gmail.com","M","Hyderbad",23,(long)8095789098L,12,35,"SUNDAYFACTORY",true);
        customer.displayCustomer();

        RegularCustomer regularCustomer = new RegularCustomer(101,"Ramesh","alwaysramesh2003@gmail.com","M","Hyderbad",23,(long)8095789098L,12,35,"SUNDAYFACTORY",true,100,"SILVER");
        regularCustomer.displayRegularCustomerDetails();

        PremiumCustomer premiumCustomer = new PremiumCustomer(101,"Ramesh","alwaysramesh2003@gmail.com","M","Hyderbad",23,(long)8095789098L,12,35,"SUNDAYFACTORY",true,0,"GOLD");
        premiumCustomer.displayPremiumCustomerDetails();

        Product product = new Product("Laptop",12,30000,3.0F,21, (byte) 10,true);
       int regularCustomerPrice= product.calculateFinalPrice(regularCustomer);
       int premiunCustomerPrice =  product.calculateFinalPrice(premiumCustomer);
        System.out.println("Regular Customer Price = " + regularCustomerPrice);
        System.out.println("Premium Customer Price = " + premiunCustomerPrice);


    }



}
