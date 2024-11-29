package com.northcoders.security_playground.repository;

import com.northcoders.security_playground.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserManagerRepository extends CrudRepository<Users, Long> {

    String findBygithubUsername(String username);
}
