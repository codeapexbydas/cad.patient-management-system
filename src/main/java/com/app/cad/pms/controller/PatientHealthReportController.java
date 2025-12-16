package com.globant.dojo.pms.controller;

import com.globant.dojo.pms.dto.report.response.PatientBaseReport;
import com.globant.dojo.pms.service.PatientHealthReportService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/documents")
public class PatientHealthReportController {

    private PatientHealthReportService patientHealthReportService;

    @GetMapping("/report/{patientId}")
    public PatientBaseReport getReport(@PathVariable String patientId){

        return patientHealthReportService.getHealthReport(patientId);
    }



}
