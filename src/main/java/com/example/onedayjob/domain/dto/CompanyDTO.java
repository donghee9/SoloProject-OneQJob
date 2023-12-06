package com.example.onedayjob.domain.dto;

import com.example.onedayjob.domain.model.Company;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CompanyDTO {

        private String storeName;
        private String phone;
        private String address;
        private String userId;
        private String userPw;

        public Company toEntity(){
            return Company.builder()
                    .storeName(storeName)
                    .phone(phone)
                    .address(address)
                    .userId(userId)
                    .userPw(userPw)
                    .build();


        }
}
