package com.java.oops.abstraction;

public abstract class CertificateService {
    abstract Certificate getMyCertificate(ApplicationForm applicationForm);

    public abstract Certificate getCertificate(ApplicationForm applicationForm);
}

