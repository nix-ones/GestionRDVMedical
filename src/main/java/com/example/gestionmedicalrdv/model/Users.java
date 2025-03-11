package com.example.gestionmedicalrdv.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.Data;

@Entity
@Data
@Inheritance(strategy = InheritanceType.JOINED) 
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Prénom", nullable = false)
    private String firstName;
    @Column(name = "Nom", nullable = false)
    private String lastName;
    @Column(name = "E-mail",unique = true, nullable = false)
    private String email;
    @Column(name = "MotDePasse", nullable = false)
    private String password;
    @Column(name = "Image", nullable = true)
    private String image;
    @Column(name = "DateDeCréation", nullable = false) 
    private LocalDateTime createdAt;

    @Enumerated(EnumType.STRING)
    private Roles role;

    public Users(String firstName, String lastName, String email, String password, String image, Roles role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.image = image;
        this.role = role;
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Roles getRole() {
        return this.role;
    }

    public void setRole(Roles role) {
        this.role = role;
    }
    
}
