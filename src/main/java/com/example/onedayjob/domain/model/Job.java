package com.example.onedayjob.domain.model;

import com.example.onedayjob.domain.dto.JobDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Company company;
    private String jobDescription;
    private String requirements;
    private String workingDays;
    private String workingPlace;
    private double hourlyRate;

    public JobDTO toDTO(){
        return JobDTO.builder()
                .jobDescription(jobDescription)
                .company(company)
                .requirements(requirements)
                .workingDays(workingDays)
                .workingPlace(workingPlace)
                .hourlyRate(hourlyRate)
                .build();
    }

}
