package com.example.manajeroback.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "utilisateurs")
public class Test implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long numAbon;

    LocalDate dateDebut;
    LocalDate dateFin;
    float prixAbon;
}




