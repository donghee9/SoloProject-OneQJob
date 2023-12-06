package com.example.onedayjob.presetation;

import com.example.onedayjob.Common.ControllerHelper;
import com.example.onedayjob.domain.dto.CompanyDTO;
import com.example.onedayjob.domain.service.CompanyService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CompanyController {
    private final CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }


    @PostMapping("/OneQJob/registerForCompany")
    @ResponseBody
    public ResponseEntity<?> registerCompanyPost(@RequestBody CompanyDTO companyDTO) {
        try {
            ControllerHelper.validateCompanyDTO(companyDTO);
            companyService.registerCompany(companyDTO);
            return ResponseEntity.ok("signUp Success"); // 성공 메시지
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("signUp Failed: " + e.getMessage()); // 실패 메시지
        }
    }
    }

