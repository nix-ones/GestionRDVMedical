package com.example.gestionmedicalrdv.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Administrator extends Users {
    private String department;

    public Administrator(String firstName, String lastName, String email, String password, String image, Roles role,
            String department) {
        super(firstName, lastName, email, password, image, Roles.ADMIN);
        this.department = department;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    
}
