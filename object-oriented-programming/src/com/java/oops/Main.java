package com.java.oops;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {


        Product product = new Product(); //first product
        product.id = 1;
        product.name = "Samsung";
        product.maxRetailPrice = 10000L;
        product.rating = 4.5F;
        product.reviewsCount = 100;
        product.discountPercentage = 25;
        product.isAvailable = true;
        System.out.println("id = " + product.id);
        System.out.println("name = " + product.name);
        System.out.println("maxRetailPrice = " + product.maxRetailPrice);
        System.out.println("rating = " + product.rating);
        System.out.println("reviewsCount = " + product.reviewsCount);
        System.out.println("discountPercentage =" + product.discountPercentage);
        System.out.println("isAvailable = " + product.isAvailable);


        Product product1 = new Product();
        product1.id = 1;
        product1.name = "Samsung Galaxy Book4 Metal Intel";
        product1.maxRetailPrice = 43990L;
        product1.rating = 4.4F;
        product1.reviewsCount = 1065;
        product1.discountPercentage = 23;
        product1.isAvailable = true;
        System.out.println("id=" + product1.id);
        System.out.println("name=" + product1.name);
        System.out.println("maxRetailPrice =" + product1.maxRetailPrice);
        System.out.println("rating = " + product1.rating);
        System.out.println("reviewsCount = " + product1.reviewsCount);
        System.out.println("discountPercentage =" + product1.discountPercentage);
        System.out.println("isAvailable = " + product1.isAvailable);


        Customer customer = new Customer();
        customer.id = 101;
        customer.name = "Ramesh";
        customer.gender = "M";
        customer.emailAddress = "rap53748@gmail.com";
        customer.adress = "7-16-20/90EB,SriramNagar,7th ward, Giddalur";
        customer.age = 22;
        customer.mobileNumber = 8096220210L;
        customer.addToCartCOunt = 20;
        customer.orders = 15;
        customer.coupons = "WINTER25";
        customer.activeStatus = true;
        System.out.println("id=" + customer.id);
        System.out.println("name=" + customer.name);
        System.out.println("gender=" + customer.gender);
        System.out.println("emailAddress=" + customer.emailAddress);
        System.out.println("adress=" + customer.adress);
        System.out.println("age=" + customer.age);
        System.out.println("mobileNumber=" + customer.mobileNumber);
        System.out.println("addToCartCount=" + customer.addToCartCOunt);
        System.out.println("orders=" + customer.orders);
        System.out.println("coupons=" + customer.coupons);
        System.out.println("activeStatus" + customer.activeStatus);
        System.out.println("1");


        Customer customer1= new Customer();
        System.out.println("id=" + customer1.id);
        System.out.println("name=" + customer1.name);
        System.out.println("gender=" + customer1.gender);
        System.out.println("emailAddress=" + customer1.emailAddress);
        System.out.println("adress=" + customer1.adress);
        System.out.println("age=" + customer1.age);
        System.out.println("mobileNumber=" + customer1.mobileNumber);
        System.out.println("addToCartCount=" + customer1.addToCartCOunt);
        System.out.println("orders=" + customer1.orders);
        System.out.println("coupons=" + customer1.coupons);
        System.out.println("activeStatus" + customer1.activeStatus);

        Customer customer2=new Customer(102,"Ravi","M","erifuki@gmail.com","Giddalur",23,9705470305L,24,20,"SUNDAYMORNING2025",true);
        System.out.println("id=" + customer2.id);
        System.out.println("name=" + customer2.name);
        System.out.println("gender=" + customer2.gender);
        System.out.println("emailAddress=" + customer2.emailAddress);
        System.out.println("adress=" + customer2.adress);
        System.out.println("age=" + customer2.age);
        System.out.println("mobileNumber=" + customer2.mobileNumber);
        System.out.println("addToCartCount=" + customer2.addToCartCOunt);
        System.out.println("orders=" + customer2.orders);
        System.out.println("coupons=" + customer2.coupons);
        System.out.println("activeStatus" + customer2.activeStatus);


        Product product2=new Product();
        System.out.println("id=" + product2.id);
        System.out.println("name=" + product2.name);
        System.out.println("maxRetailPrice =" + product2.maxRetailPrice);
        System.out.println("rating = " + product2.rating);
        System.out.println("reviewsCount = " + product2.reviewsCount);
        System.out.println("discountPercentage =" + product2.discountPercentage);
        System.out.println("isAvailable = " + product2.isAvailable);

        Product product3=new Product(111,"riya",40000L,3.7F,40,(byte)35,true);
        System.out.println("id=" + product3.id);
        System.out.println("name=" + product3.name);
        System.out.println("maxRetailPrice =" + product3.maxRetailPrice);
        System.out.println("rating = " + product3.rating);
        System.out.println("reviewsCount = " + product3.reviewsCount);
        System.out.println("discountPercentage =" + product3.discountPercentage);
        System.out.println("isAvailable = " + product3.isAvailable);



        Order order1=new Order();
        System.out.println("orderId=" + order1.orderId);
        System.out.println("orderNumber=" + order1.orderNumber);
        System.out.println("customerId=" + order1.customerId);
        System.out.println("orderDate=" + order1.orderDate);
        System.out.println("totalAmount=" + order1.totalAmount);
        System.out.println("orderStatus=" + order1.orderStatus);
        System.out.println("isGift=" + order1.isGift);
        System.out.println("shippingAddress=" + order1.shipppingAddress);

        Order order2;
        order2 = new Order(2,"102", (long) 105432L,"23-04-2026", 40000.0, (byte) 2,true,"Ongole");

        System.out.println("orderId=" + order2.orderId);
        System.out.println("orderNumber=" + order2.orderNumber);
        System.out.println("customerId=" + order2.customerId);
        System.out.println("orderDate=" + order2.orderDate);
        System.out.println("totalAmount=" + order2.totalAmount);
        System.out.println("orderStatus=" + order2.orderStatus);
        System.out.println("isGift=" + order2.isGift);
        System.out.println("shippingAddress=" + order2.shipppingAddress);


        Payment payment1=new Payment();
        System.out.println("paymentId=" + payment1.paymentId);
        System.out.println("orderId=" + payment1.orderId);
        System.out.println("amount=" + payment1.amount);
        System.out.println("paymentMethod=" + payment1.paymentMethod);
        System.out.println("paymentStatus=" + payment1.paymentStatus);
        System.out.println("transactionId=" + payment1.transactionId);
        System.out.println("paidAt=" + payment1.paidAt);
        System.out.println("isRefunded=" + payment1.isRefunded);


        Payment payment2=new Payment(11,1234563L, 30000.0,"Online", (byte) 1,"5647090","Work",false);
        System.out.println("paymentId=" + payment2.paymentId);
        System.out.println("orderId=" + payment2.orderId);
        System.out.println("amount=" + payment2.amount);
        System.out.println("paymentMethod=" + payment2.paymentMethod);
        System.out.println("paymentStatus=" + payment2.paymentStatus);
        System.out.println("transactionId=" + payment2.transactionId);
        System.out.println("paidAt=" + payment2.paidAt);
        System.out.println("isRefunded=" + payment2.isRefunded);


    }


}
