package com.globant.dojo.pms.service;

import com.globant.dojo.pms.dto.report.response.PatientBaseReport;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PatientHealthReportService {

    public PatientBaseReport getHealthReport(String patientId){

        System.out.println("Patient Id::"+patientId);

        return buildMockPatientReport();

    }

    private static PatientBaseReport buildMockPatientReport(){
        return PatientBaseReport.builder()
                .reportId("R123")
                .issuedOn("10122025")
                .type("NA")
                .patientName("Ram")
                .build();
    }
}
