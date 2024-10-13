package com.ecommerce.entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String username;
    private String email;
    private String password; // Should be hashed and salted before storage
    private String firstName;
    private String lastName;

    @ManyToMany(mappedBy = "users")
    private Set<Role> roles = new HashSet<>();

    // Getters, setters, and other methods
}
