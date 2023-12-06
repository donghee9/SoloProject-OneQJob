package com.example.onedayjob.presetation;

import com.example.onedayjob.domain.dto.CompanyDTO;
import com.example.onedayjob.domain.model.Company;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class JobController {
    //메인화면
    @GetMapping("/OneQJob")
    public String main(Model model){
        model.addAttribute("viewJob","일자리 보기");
        model.addAttribute("registerJob","일자리 등록");
        model.addAttribute("registerIndividual","개인용 회원가입");
        model.addAttribute("registerCorporate","기업용 회원가입");
        model.addAttribute("login","로그인");
        return "main";
    }
    // 일자리 보기
//    @GetMapping("/OneQJob/viewAllJob")
//    public List<String> jobList(){
//        return "jobList";
//    }
//
//    //일자리 등록 화면 불러오기
//    @GetMapping("/OneQJob/registerNewJob")
//    public String registerNewJob(){
//        return "registerJob";
//    }
//    @PostMapping("/OneQJob/registerNewJob")
//    public String registerNewJobPost(){
//        return "main";
//    }


    //기업용 회원가입 불러오기
    @GetMapping("/OneQJob/registerForCompany")
    public String registerCompany() {
        return "registerForCompany";
    }



//    //개인용 회원가입 불러오기
//    @GetMapping("/OneQJob/registerForIndividual")
//    public String registerIndividual(){
//        return "registerForUser";
//    }
//    @PostMapping("/OneQJob/registerForIndividual")
//    public String registerIndividualPost(){
//        return "main";
//    }
//
//
//
//
//
//    //로그인 화면 불러오기
//    @GetMapping("/OneQJob/Login")
//    public String Login(){
//        return "login";
//    }
}
