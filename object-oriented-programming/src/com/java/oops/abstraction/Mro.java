package com.java.oops.abstraction;

public class Mro extends Certificate {

    int id;
    int money;
    String name;

    public Mro(int id1, int money, String name1) {
        super(String.valueOf(101),"BirthCertificate", "Madhu", "07-05-2026", "Ramu");
        this.id = id1;
        this.money = money;
        this.name = name1;
    }

    public Certificate generateCertificate(ApplicationForm  applicationForm) {
        Certificate certificate = null;
        if (money > 500) {
            certificate = new Certificate("1", "Ramesh", "madhu", "08-05-2026","Ramesh");
        }
        return certificate;
    }
}
