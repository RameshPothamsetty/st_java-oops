package com.java.oops ;

public class Main{
    public static void main(String[] args) {


        Product product = new Product(); //first product
        product.id = 1;
        product.name = "Samsung";
        product.maxRetailPrice = 10000L;
        product.rating = 4.5F;
        product.reviewsCount = 100;
        product.discountPercentage= 25;
        product.isAvailable= true ;
        System.out.println("id = " + product.id);
        System.out.println("name = " + product.name);
        System.out.println("maxRetailPrice = " + product.maxRetailPrice);
        System.out.println("rating = " + product.rating);
        System.out.println("reviewsCount = " + product.reviewsCount);
        System.out.println("discountPercentage =" + product.discountPercentage);
        System.out.println("isAvailable = " + product.isAvailable);




        Product product1 = new Product();
        product1.id =1;
        product1.name = "Samsung Galaxy Book4 Metal Intel";
        product1.maxRetailPrice = 43990L;
        product1.rating = 4.4F;
        product1.reviewsCount = 1065;
        product1.discountPercentage = 23;
        product1.isAvailable= true;
        System.out.println("id="+ product1.id);
        System.out.println("name="+ product1.name);
        System.out.println("maxRetailPrice =" + product1.maxRetailPrice);
        System.out.println("rating = " + product1.rating);
        System.out.println("reviewsCount = " + product1.reviewsCount);
        System.out.println("discountPercentage =" + product1.discountPercentage);
        System.out.println("isAvailable = " + product1.isAvailable);



        Customer customer = new Customer();
        customer.id=101;
        customer.name = "Ramesh";
        customer.gender = "M";
        customer.emailAddress="rap53748@gmail.com";
        customer.adress="7-16-20/90EB,SriramNagar,7th ward, Giddalur";
        customer.age = 22;
        customer.mobileNumber=8096220210L;
        customer.addToCartCOunt=20;
        customer.orders=15;
        customer.coupons="WINTER25";
        customer.activeStatus =true;
        System.out.println("id=" + customer.id);
        System.out.println("name=" + customer.name);
        System.out.println("gender=" + customer.gender);
        System.out.println("emailAddress="+customer.emailAddress);
        System.out.println("adress="+customer.adress);
        System.out.println("age="+customer.age);
        System.out.println("mobileNumber="+customer.mobileNumber);
        System.out.println("addToCartCount="+customer.addToCartCOunt);
        System.out.println("orders="+customer.orders);
        System.out.println("coupons="+customer.coupons);
        System.out.println("activeStatus"+customer.activeStatus);




    }


}
