package com.java.oops.abstraction;

public class ColorPrintServices extends PrintService{

    @Override
    public void printCertificate(Certificate certificate){
        System.out.println("Printing certificate in color");
        System.out.println("Id : " + certificate.id
                +  " \n Name : " + certificate.name
                + " \n IssuedTO : " + certificate.IssuedTo
                + " \n IssuedBy : " + certificate.IssuedBy
                + " \n IssuedDate " + certificate.IssuedDate);
    }


}
