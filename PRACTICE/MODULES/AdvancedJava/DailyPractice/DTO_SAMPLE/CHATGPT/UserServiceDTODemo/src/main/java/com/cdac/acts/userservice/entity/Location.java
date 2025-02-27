package com.cdac.acts.userservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity  
public class Location {  
    @Id  
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    private Long id;  
    private double latitude;  
    private double longitude;  
    private String placeName;  
    private String des;  
    // Getters and Setters  
}  