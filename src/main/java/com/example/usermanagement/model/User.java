package com.example.usermanagement.model;

import lombok.Data;
import lombok.ToString;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
@Data
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    private String email;
    private String firstName;
    private String lastName;
    private String job;
}
