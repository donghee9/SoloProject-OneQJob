package com.example.onedayjob.domain.service;

import com.example.onedayjob.domain.dto.CompanyDTO;
import com.example.onedayjob.domain.model.Company;
import com.example.onedayjob.infra.repository.CompanyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class CompanyServiceImpl implements CompanyService{

    private  final CompanyRepository companyRepository;

    @Override
    public CompanyDTO registerCompany(CompanyDTO companyDTO) {
        Company company = Company.builder()
                .storeName(companyDTO.getStoreName())
                .phone(companyDTO.getPhone())
                .address(companyDTO.getAddress())
                .userId(companyDTO.getUserId())
                .userPw(companyDTO.getUserPw())
                .build();

        company = companyRepository.save(company);
        return company.toDTO();
    }
}
