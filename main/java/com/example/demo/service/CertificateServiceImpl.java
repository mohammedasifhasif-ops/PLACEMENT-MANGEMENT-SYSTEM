package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Certificate;
import com.example.demo.repository.ICertificateRepository;

@Service
public class CertificateServiceImpl implements ICertificateService {

    @Autowired
    private ICertificateRepository certificateRepository;

    @Override
    public Certificate saveCertificate(Certificate certificate) {
        return certificateRepository.save(certificate);
    }

    @Override
    public List<Certificate> getAllCertificates() {
        return certificateRepository.findAll();
    }

    @Override
    public Certificate getCertificateById(Long id) {
        return certificateRepository.findById(id).orElse(null);
    }

    @Override
    public Certificate updateCertificate(Long id, Certificate certificate) {
        Optional<Certificate> existing = certificateRepository.findById(id);
        if (existing.isPresent()) {
            Certificate certToUpdate = existing.get();
            certToUpdate.setCertificateName(certificate.getCertificateName());
            certToUpdate.setIssuedBy(certificate.getIssuedBy());
            return certificateRepository.save(certToUpdate);
        } else {
            throw new RuntimeException("Certificate not found with id: " + id);
        }
    }

    @Override
    public void deleteCertificate(Long id) {
        if (certificateRepository.existsById(id)) {
            certificateRepository.deleteById(id);
        } else {
            throw new RuntimeException("Certificate not found with id: " + id);
        }
    }
}
