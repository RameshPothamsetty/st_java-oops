package com.java.oops.abstraction;

public class Attender {
   int id;
    int money;
    String name;
    Mro mro;
    ApplicationForm applicationForm;

    public Attender(int id,int money, String name, ApplicationForm applicationForm , Mro mro) {
        this.id = id;
        this.money = money;
        this.name = name;
        this.applicationForm = applicationForm;
        this.mro = mro;
    }

    Certificate processCertificate(ApplicationForm applicationForm) {
        if (money > 500){
            return  mro.generateCertificate(applicationForm);
        }
        else {
            return null;
        }
    }


}
