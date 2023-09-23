package com.jwt.example.JwtExample.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.jwt.example.JwtExample.models.User;

@Service
public class UserService {
	
	private List<User> store =new ArrayList<>();
	
	public UserService() {
		store.add(new User(UUID.randomUUID().toString(),"yogotha","yo@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),"vini","viini@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),"nagesh","nagesh@gmail.com"));
		
	}
	
	public List<User> getUsers() {
		return this.store;
		
		
	}
}
