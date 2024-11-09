package com.cdac.acts.userservice.dto;

import lombok.Data;

@Data
public class UserLocationDTO {  
    private Long userId;  
    private String username;  
    private double latitude;  
    private double longitude;  
    private String place;  
    // Getters and Setters  
}