package com.globant.dojo.pms.dto.report.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Builder
@Getter
@Setter
public class PatientBaseReport {

    private String reportId;
    private String issuedOn;
    private String patientName;
    private String type;


}
