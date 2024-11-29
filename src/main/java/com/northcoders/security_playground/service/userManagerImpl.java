package com.northcoders.security_playground.service;

import com.northcoders.security_playground.model.Users;
import com.northcoders.security_playground.repository.UserManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userManagerImpl implements userManagerService {

    @Autowired
    UserManagerRepository userManagerRepository;

    @Override
    public boolean findByGithubUsername(String username) {
        return userManagerRepository.findBygithubUsername(username) != null;
    }
}
