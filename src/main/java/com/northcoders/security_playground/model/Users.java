package com.northcoders.security_playground.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Users {

    @Id
    @GeneratedValue
    @Column
    Long id;

    @Column
    String name;

    @Column
    String githubUsername;
}
