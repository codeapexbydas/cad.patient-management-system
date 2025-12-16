package com.globant.dojo.pms.controller;

import com.globant.dojo.pms.dto.patient.response.PatientInformation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/patients")
public class PatientController {


    @GetMapping("/{patientId}")
    public PatientInformation getPatientInformation(@PathVariable String patientId) {
        System.out.println("Fetching information for patient ID: " + patientId);
        return PatientInformation.builder()
                .patientId("P12345")
                .patientName("John Doe")
                .patientAge(30).build();
    }

}
