package com.securit.jwt.repo;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

import com.securit.jwt.model.Users;

public interface UserRepo extends JpaRepository<Users, Integer>{

}
