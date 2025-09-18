package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.Certificate;

public interface ICertificateService {

    Certificate saveCertificate(Certificate certificate);

    List<Certificate> getAllCertificates();

    Certificate getCertificateById(Long id);

    Certificate updateCertificate(Long id, Certificate certificate);

    void deleteCertificate(Long id);
}
