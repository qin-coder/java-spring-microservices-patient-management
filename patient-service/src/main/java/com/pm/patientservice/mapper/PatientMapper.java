package com.pm.patientservice.mapper;

import com.pm.patientservice.dto.PatientRequestDTO;
import com.pm.patientservice.dto.PatientResponseDTO;
import com.pm.patientservice.model.Patient;

import java.time.LocalDate;

public class PatientMapper {
    public static PatientResponseDTO mapToPatientResponseDTO(Patient patient) {
        return new PatientResponseDTO(patient.getId().toString(),
                patient.getName(), patient.getEmail(),
                patient.getAddress(), patient.getDateOfBirth(),
                patient.getRegisteredDate());

    }
    public static Patient toModel(PatientRequestDTO patientRequestDTO) {
        Patient patient = new Patient(); // 无参构造
        patient.setName(patientRequestDTO.getName());
        patient.setEmail(patientRequestDTO.getEmail());
        patient.setAddress(patientRequestDTO.getAddress());
        patient.setDateOfBirth(LocalDate.parse(patientRequestDTO.getDateOfBirth()));
        patient.setRegisteredDate(LocalDate.parse(patientRequestDTO.getRegisteredDate()));
        return patient;
    }
}
