package com.example.gestionmedicalrdv.model;

import java.sql.Date;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-incrémentation de l'ID
    private Long id;

    private Date dateRendezVous;
    private String motif;
    private String statut; // Exemple: "PLANIFIÉ", "TERMINÉ", "ANNULÉ"

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patients patient;

    @ManyToOne
    @JoinColumn(name = "docteur_id")
    private Doctors docteur;

    public Appointment(Date dateRendezVous, String motif, String statut, Patients patient, Doctors docteur) {
        this.dateRendezVous = dateRendezVous;
        this.motif = motif;
        this.statut = statut;
        this.patient = patient;
        this.docteur = docteur;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateRendezVous() {
        return this.dateRendezVous;
    }

    public void setDateRendezVous(Date dateRendezVous) {
        this.dateRendezVous = dateRendezVous;
    }

    public String getMotif() {
        return this.motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public String getStatut() {
        return this.statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
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

    
}
