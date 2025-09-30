package com.pm.patientservice.mapper;

import com.pm.patientservice.dto.PatientResponseDTO;
import com.pm.patientservice.model.Patient;

public class PatientMapper {
    public static PatientResponseDTO mapToPatientResponseDTO(Patient patient) {
        return new PatientResponseDTO(patient.getId().toString(),
                patient.getName(), patient.getEmail(),
                patient.getAddress(), patient.getDateOfBirth(),
                patient.getRegisteredDate());

    }
}
