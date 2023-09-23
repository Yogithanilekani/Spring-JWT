package com.jwt.example.JwtExample.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.example.JwtExample.models.User;
import com.jwt.example.JwtExample.service.UserService;

@RestController
@RequestMapping("/home")
public class HomeController {
	
	@Autowired
	public UserService userservice;
	
//	http://localhost:8081/home/user
	@GetMapping("/user")
	public List<User> getUser() {
		System.out.println("getting users");
		return this.userservice.getUsers();
		
	}

}
