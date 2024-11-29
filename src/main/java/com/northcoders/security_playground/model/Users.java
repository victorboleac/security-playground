package com.northcoders.security_playground.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;



@Entity

public class Users {


    @Column
    Long id;

    @Column
    String name;



    @Column
    String githubUsername;
    public Users(Long id, String name, String githubUsername) {
        this.id = id;
        this.name = name;
        this.githubUsername = githubUsername;
    }

}
