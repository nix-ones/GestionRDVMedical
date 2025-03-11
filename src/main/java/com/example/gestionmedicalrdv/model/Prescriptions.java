package com.example.gestionmedicalrdv.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Prescriptions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "appointment_id", nullable = false)
    private Appointment appointment;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patients patient;

    @ManyToOne
    @JoinColumn(name = "docteur_id")
    private Doctors docteur;


    private String medicament;
    private String motif;
    private LocalDateTime prescriptionDateTime;

    public Prescriptions(Appointment appointment, Patients patient, Doctors docteur, String medicament, String motif,
            LocalDateTime prescriptionDateTime) {
        this.appointment = appointment;
        this.patient = patient;
        this.docteur = docteur;
        this.medicament = medicament;
        this.motif = motif;
        this.prescriptionDateTime = prescriptionDateTime;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Appointment getAppointment() {
        return this.appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }

    public Patients getPatient() {
        return this.patient;
    }

    public void setPatient(Patients patient) {
        this.patient = patient;
    }

    public Doctors getDocteur() {
        return this.docteur;
    }

    public void setDocteur(Doctors docteur) {
        this.docteur = docteur;
    }

    public String getMedicament() {
        return this.medicament;
    }

    public void setMedicament(String medicament) {
        this.medicament = medicament;
    }

    public String getMotif() {
        return this.motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public LocalDateTime getPrescriptionDateTime() {
        return this.prescriptionDateTime;
    }

    public void setPrescriptionDateTime(LocalDateTime prescriptionDateTime) {
        this.prescriptionDateTime = prescriptionDateTime;
    }

    
    
}
