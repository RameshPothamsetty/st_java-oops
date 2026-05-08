package com.java.oops.abstraction;


public abstract class CertificateServiceImpl extends CertificateService {
    Attender attender;

    public CertificateServiceImpl(Attender attender) {
        this.attender = attender;
    }

    @Override
    public Certificate getCertificate(ApplicationForm applicationForm) {

        return attender.processCertificate(applicationForm);
    }
}

