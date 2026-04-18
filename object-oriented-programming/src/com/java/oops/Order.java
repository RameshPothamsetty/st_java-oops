package com.java.oops;

public class Order {
    int orderId;
    String orderNumber;
    long customerId;
    String orderDate;
    double totalAmount;
    byte orderStatus;
    boolean isGift;
    String shipppingAddress;


    public Order(){
        orderId=1;
        orderNumber="101";
        customerId=101234L;
        orderDate="20-04-2026";
        totalAmount=30000;
        orderStatus=1;
        isGift=true;
        shipppingAddress="Giddalur";



    }

    public Order(int orderId, String orderNumber, long customerId, String orderDate, double totalAmount, byte orderStatus, boolean isGift, String shipppingAddress) {
        this.orderId = orderId;
        this.orderNumber = orderNumber;
        this.customerId = customerId;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
        this.orderStatus = orderStatus;
        this.isGift = isGift;
        this.shipppingAddress = shipppingAddress;
    }
}
