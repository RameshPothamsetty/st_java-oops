package com.java.oops.abstraction;

public class Certificate {
    String id;
    String name;
    String IssuedBy;
    String IssuedDate;
    String IssuedTo;

    public Certificate(String id, String name, String issuedBy, String issuedDate, String issuedTo) {
        this.id = id;
        this.name = name;
        IssuedBy = issuedBy;
        IssuedDate = issuedDate;
        IssuedTo = issuedTo;
    }
}
