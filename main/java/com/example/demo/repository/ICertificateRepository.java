package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.Certificate;

@Repository
public interface ICertificateRepository extends JpaRepository<Certificate, Long> {
}
