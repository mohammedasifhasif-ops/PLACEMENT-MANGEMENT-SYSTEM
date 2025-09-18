package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Certificate;
import com.example.demo.service.ICertificateService;

@RestController
@RequestMapping("/certificates")
public class CertificateController {

    @Autowired
    private ICertificateService certificateService;

    // CREATE
    @PostMapping
    public Certificate createCertificate(@RequestBody Certificate certificate) {
        return certificateService.saveCertificate(certificate);
    }

    // READ ALL
    @GetMapping
    public List<Certificate> getAllCertificates() {
        return certificateService.getAllCertificates();
    }

    // READ BY ID
    @GetMapping("/{id}")
    public Certificate getCertificateById(@PathVariable("id") Long id) {
        return certificateService.getCertificateById(id);
    }

    // UPDATE
    @PutMapping("/{id}")
    public Certificate updateCertificate(@PathVariable("id") Long id,
                                         @RequestBody Certificate certificate) {
        return certificateService.updateCertificate(id, certificate);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void deleteCertificate(@PathVariable("id") Long id) {
        certificateService.deleteCertificate(id);
    }
}
