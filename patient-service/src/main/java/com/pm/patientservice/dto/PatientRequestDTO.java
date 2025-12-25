package com.pm.patientservice.dto;

import com.pm.patientservice.dto.validators.CreatePatientValidationGroup;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class PatientRequestDTO {
    @NotBlank(message = "First Name is required")
    @Size(max = 100, message = "Name cannot exceed 100 characters")
    private String firstName;

    @NotBlank(message = "Last Name is required")
    @Size(max = 100, message = "Name cannot exceed 100 characters")
    private String lastName;

    @NotBlank(message = "Email is required")
    @Email(message = "Email should be valid")
    private String email;

    @NotBlank(message = "Address is required")
    private String address;

    @NotBlank(message = "Date of birth is required")
    private String dateOfBirth;

    @NotBlank(groups = CreatePatientValidationGroup.class, message =
            "Registered date is required")
    private String registeredDate;

    public @NotBlank(message = "First Name is required") @Size(max = 100, message = "First Name cannot exceed 100 characters") String getFirstName() {
        return firstName;
    }

    public void setFirstName(
            @NotBlank(message = "First Name is required") @Size(max = 100, message = "First Name cannot exceed 100 characters") String firstName) {
        this.firstName = firstName;
    }

    public @NotBlank(message = "Last Name is required") @Size(max = 100, message = "Last Name cannot exceed 100 characters") String getLastName() {
        return lastName;
    }

    public void setLastName(
            @NotBlank(message = "Last Name is required") @Size(max = 100, message = "Last Name cannot exceed 100 characters") String lastName) {
        this.lastName = lastName;
    }

    public @NotBlank(message = "Email is required") @Email(message = "Email should be valid") String getEmail() {
        return email;
    }

    public void setEmail(
            @NotBlank(message = "Email is required") @Email(message = "Email should be valid") String email) {
        this.email = email;
    }

    public @NotBlank(message = "Address is required") String getAddress() {
        return address;
    }

    public void setAddress(
            @NotBlank(message = "Address is required") String address) {
        this.address = address;
    }

    public @NotBlank(message = "Date of birth is required") String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(
            @NotBlank(message = "Date of birth is required") String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(String registeredDate) {
        this.registeredDate = registeredDate;
    }
}
