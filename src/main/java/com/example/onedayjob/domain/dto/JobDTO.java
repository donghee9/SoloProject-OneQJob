package com.example.onedayjob.domain.dto;

import com.example.onedayjob.domain.model.Company;
import com.example.onedayjob.domain.model.Job;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class JobDTO {
    private Company company;
    private String jobDescription;
    private String requirements;
    private String workingDays;
    private String workingPlace;
    private double hourlyRate;

    public Job toEntity(){
        return Job.builder()
                .jobDescription(jobDescription)
                .company(company)
                .requirements(requirements)
                .workingDays(workingDays)
                .workingPlace(workingPlace)
                .hourlyRate(hourlyRate)
                .build();
    }
}
