package com.example.springdemo.dto;

import com.example.springdemo.entities.MedicalRecord;
import com.example.springdemo.entities.Patient;
import com.example.springdemo.entities.helper.Gender;
import com.example.springdemo.entities.helper.Profile;

import java.util.List;

public class DoctorDTO extends UserDTO {

    private List<Patient> patients;
    private List<MedicalRecord> medicalRecords;

    public DoctorDTO(String username, String password, String name, Gender gender, String birthday, String address, Profile profile, List<Patient> patients, List<MedicalRecord> medicalRecords) {
        super(username, password, name, gender, birthday, address, profile);
        this.patients = patients;
        this.medicalRecords = medicalRecords;
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