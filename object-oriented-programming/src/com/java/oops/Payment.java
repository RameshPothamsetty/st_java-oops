package com.java.oops;

public class Payment {
    int paymentId;
    long orderId;
    double amount;
    String paymentMethod;      // e.g., "CREDIT_CARD", "PAYPAL", "COD"
    byte paymentStatus;        // e.g., 1=PENDING, 2=SUCCESS, 3=FAILED
    String transactionId;
    String paidAt;               // timestamp (milliseconds since epoch)
    boolean isRefunded;




    public Payment(){
        paymentId=10;
        orderId=103L;
        amount=60000;
        paymentMethod="Online payment";
        paymentStatus=1;
        transactionId= "123445";
        paidAt="Home";
        isRefunded=true;

    }

    public Payment(int paymentId, long orderId, double amount, String paymentMethod, byte paymentStatus, String transactionId, String paidAt, boolean isRefunded) {
        this.paymentId = paymentId;
        this.orderId = orderId;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.paymentStatus = paymentStatus;
        this.transactionId = transactionId;
        this.paidAt = paidAt;
        this.isRefunded = isRefunded;
    }
}