package com.example.onedayjob.Common;

import com.example.onedayjob.domain.dto.CompanyDTO;

import java.util.regex.Pattern;

public class ControllerHelper {

    public static void validateCompanyDTO(CompanyDTO companyDTO) {
        if (companyDTO.getPhone() == null || companyDTO.getPhone().length() < 10 || companyDTO.getPhone().length() > 11) {
            throw new IllegalArgumentException("전화번호는 10~11자리여야 합니다.");
        }

        String idRegex = "^[a-zA-Z0-9]{8,}$";
        if (companyDTO.getUserId() == null || !Pattern.matches(idRegex, companyDTO.getUserId())) {
            throw new IllegalArgumentException("ID는 영문+숫자 8자리 이상이어야 합니다.");
        }

        String pwRegex = "^(?=.*[a-zA-Z])(?=.*\\d)(?=.*\\W).{8,}$";
        if (companyDTO.getUserPw() == null || !Pattern.matches(pwRegex, companyDTO.getUserPw())) {
            throw new IllegalArgumentException("PW는 영문+숫자+특수문자 8자리 이상이어야 합니다.");
        }

        if (companyDTO.getStoreName()== null || companyDTO.getAddress() == null) {
            throw new IllegalArgumentException("필수 입력값이 누락되었습니다.");
        }
    }
}

