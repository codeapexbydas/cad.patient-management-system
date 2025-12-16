package com.globant.dojo.pms.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "health_reports")
@Builder
@Setter
@Getter
@AllArgsConstructor
public class HealthReport {

    @Id
    @Column (name = "report_id", nullable = false, unique = true)
    private String reportId;
/*
    @Column (name = "patient_id", nullable = false)
    private String patientId;*/

    @Column (name = "report_date", nullable = false)
    private String reportDate;

    @Column (name = "report_type", nullable = false)
    private String reportType;

    @Column (name = "issuedAt", nullable = false)
    private String issuedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient patient;


}
