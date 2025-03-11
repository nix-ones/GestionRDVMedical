package com.example.gestionmedicalrdv.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Patients extends Users {
    private String address;
    private String phoneNumber;

     @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
    private List<Appointment> rendezVous;

    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
    private List<Prescriptions> prescriptions;

    public Patients(String firstName, String lastName, String email, String password, String image, Roles role,
            String address, String phoneNumber, List<Appointment> rendezVous, List<Prescriptions> prescriptions) {
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

    public List<Prescriptions> getPrescriptions() {
        return this.prescriptions;
    }

    public void setPrescriptions(List<Prescriptions> prescriptions) {
        this.prescriptions = prescriptions;
    }


}
