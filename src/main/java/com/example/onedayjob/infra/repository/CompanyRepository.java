package com.example.onedayjob.infra.repository;

import com.example.onedayjob.domain.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company,Long> {
}
