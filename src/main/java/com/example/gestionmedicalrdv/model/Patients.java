package com.example.gestionmedicalrdv.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;

public class Patients extends Users {
    private String address;
    private String phoneNumber;

     @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
    private List<Appointment> rendezVous;

    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
    private List<Prescription> prescriptions;

    public Patients(String firstName, String lastName, String email, String password, String image, Roles role,
            String address, String phoneNumber, List<Appointment> rendezVous, List<Prescription> prescriptions) {
        super(firstName, lastName, email, password, image, Roles.PATIENT);
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.rendezVous = rendezVous;
        this.prescriptions = prescriptions;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Appointment> getRendezVous() {
        return this.rendezVous;
    }

    public void setRendezVous(List<Appointment> rendezVous) {
        this.rendezVous = rendezVous;
    }

    public List<Prescription> getPrescriptions() {
        return this.prescriptions;
    }

    public void setPrescriptions(List<Prescription> prescriptions) {
        this.prescriptions = prescriptions;
    }


}
