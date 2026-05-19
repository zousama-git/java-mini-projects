package com.example.test.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.test.service.UserService;
import com.example.test.util.User;


@RestController
@RequestMapping("/api/users")
public class UserControler {
	private final UserService service;
	
	@Autowired
	public UserControler(UserService service){
		this.service = service;
	}
	
	@GetMapping
	public List <User> getAll() {
		return service.getUser();
	}
}