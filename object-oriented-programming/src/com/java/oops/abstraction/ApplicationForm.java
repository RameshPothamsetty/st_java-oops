package com.java.oops.abstraction;

public class ApplicationForm {
    int id;
    String name;
    static Customer customer;

    public ApplicationForm(int id, String name, Customer customer) {
        this.id = id;
        this.name = name;
        this.customer = customer;



    }
}
