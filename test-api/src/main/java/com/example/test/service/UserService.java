package com.example.test.service;

import org.springframework.stereotype.Service;
import com.example.test.reporisitory.UserRepository;
import java.util.*;
import com.example.test.util.User;

@Service
public class UserService {
	private final UserRepository repo;
	
	public UserService(UserRepository repo){
		this.repo = repo;}
	
	public List <User> getUser() {
		return repo.findAll();
	}
}