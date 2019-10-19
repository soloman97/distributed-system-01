package com.example.springdemo.entities;

import com.example.springdemo.entities.helper.Gender;
import com.example.springdemo.entities.helper.Profile;

import javax.persistence.*;
import java.util.List;

@Entity
@PrimaryKeyJoinColumn(name = "username")
@Table(name = "doctor")
public class Doctor extends User {

    @Column(name = "patient")
    @OneToMany
    private List<Patient> patients;

    @Column(name = "medical_record")
    @OneToMany
    private List<MedicalRecord> medicalRecords;

    public Doctor(String username, String password, String name, Gender gender, String birthday, String address, Profile profile) {
        super(username, password, name, gender, birthday, address, profile);
    }

    public Doctor(String username, String password, Profile profile) {
        super(username, password, profile);
    }

    public Doctor(List<Patient> patients) {
        this.patients = patients;
    }

    public Doctor() {
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    public List<MedicalRecord> getMedicalRecords() {
        return medicalRecords;
    }

    public void setMedicalRecords(List<MedicalRecord> medicalRecords) {
        this.medicalRecords = medicalRecords;
    }
}
