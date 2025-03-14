package com.example.gestionmedicalrdv.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Doctors extends Users {
    
    private String specialty;
    private String numberDocteur;

    @OneToMany(mappedBy = "docteur", cascade = CascadeType.ALL)
    private List<Appointment> rendezVous;

    @OneToMany(mappedBy = "docteur", cascade = CascadeType.ALL)
    private List<Prescriptions> prescriptions;

    public Doctors(String firstName, String lastName, String email, String password, String image, Roles role,
            String specialty, String numberDocteur, List<Appointment> rendezVous, List<Prescriptions> prescriptions) {
        super(firstName, lastName, email, password, image, Roles.DOCTOR);
        this.specialty = specialty;
        this.numberDocteur = numberDocteur;
        this.rendezVous = rendezVous;
        this.prescriptions = prescriptions;
    }
   


    public String getSpecialty() {
        return this.specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getNumberDocteur() {
        return this.numberDocteur;
    }

    public void setNumberDocteur(String numberDocteur) {
        this.numberDocteur = numberDocteur;
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
