package com.example.onedayjob.domain.model;

import com.example.onedayjob.domain.dto.CompanyDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String storeName;
    private String phone;
    private String address;
    private String userId;
    private String userPw;

    public CompanyDTO toDTO(){
        return CompanyDTO.builder()
                .storeName(storeName)
                .phone(phone)
                .address(address)
                .userId(userId)
                .userPw(userPw)
                .build();
    }
}
