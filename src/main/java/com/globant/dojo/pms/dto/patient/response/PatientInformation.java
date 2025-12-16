package com.globant.dojo.pms.dto.patient.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Builder
@Getter
public class PatientInformation {

    private String patientId;
    private String patientName;
    private int patientAge;
    private String patientGender;


}
