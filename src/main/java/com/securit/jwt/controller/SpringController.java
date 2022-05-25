package com.securit.jwt.controller;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.securit.jwt.model.Users;
import com.securit.jwt.repo.UserRepo;

@RestController
public class SpringController {
	
	@Autowired
	UserRepo userRepo;
	
	@PostMapping(path="/addData",consumes = "application/json")
	public String addData(@RequestBody Users users) {
		userRepo.save(users);
	
		return "done";
	}
	
	
	@PostMapping(path="/get",consumes = "application/json")
	public String get(@RequestBody List<Users> users) {
	for (Users users2 : users) {
		System.out.println("id"+users2.getId());
	}
	System.out.println(users.size());
		return "done";
	}
	

}
