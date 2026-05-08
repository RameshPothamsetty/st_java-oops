package com.java.oops.abstraction;

public class Main {
    static void main() {
        Customer customer = new Customer(12,"Ramesh","Ramesh12@gmail.com","Hyderabad");
        ApplicationForm applicationForm = new ApplicationForm(1,"BirthCertificate",customer);
        Mro mro = new Mro(121,1000,"Madhusamala");
        Attender attender = new Attender(122,1000,"Rajesh",applicationForm,mro);

        CertificateService certificateService = new CertificateServiceImpl(attender) {
            @Override
            Certificate getMyCertificate(ApplicationForm applicationForm) {
                return null;
            }
        };
        Certificate certificate = certificateService.getCertificate(applicationForm);
        PrintService printService = new NormalPrintService();
        printService.printCertificate(certificate);




    }

}
