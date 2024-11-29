package com.northcoders.security_playground.service;

import com.northcoders.security_playground.model.Users;

public interface userManagerService {

    boolean findByGithubUsername(String username);
    Users addUser(Users user);


}
