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

import java.util.HashMap;
import java.util.Map;

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
            Map<String, String> response = new HashMap<>();
            response.put("message", "signUp Success");
            return ResponseEntity.ok(response); // 성공 메시지를 JSON 형식으로 반환
        } catch (Exception e) {
            Map<String, String> errorResponse = new HashMap<>();
            errorResponse.put("message", "signUp Failed: " + e.getMessage());
            return ResponseEntity.badRequest().body(errorResponse); // 실패 메시지를 JSON 형식으로 반환
        }
    }


}

