package com.globant.dojo.pms.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="patients")
@Getter
@Setter
@AllArgsConstructor
@Builder
public class Patient {

    @Id
    @Column(name = "patient_id", nullable = false, unique = true)
    private String patientId;

    @Column (name = "name", nullable = false)
    private String name;

    @Column(name = "age", nullable = false)
    private int age;

    @Column(name = "gender", nullable = false)
    private String gender;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "address")
    private String address;

    @Column(name = "date_of_birth")
    private String dateOfBirth;

    @Column(name = "emergency_contact")
    private String emergencyContact;

    @Column(name = "blood_type")
    private String bloodType;

    @Column(name = "created_at")
    private String createdAt;

    @Column(name = "updated_at")
    private String updatedAt;

    @OneToMany (mappedBy = "patient", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<HealthReport> healthReports;

}
