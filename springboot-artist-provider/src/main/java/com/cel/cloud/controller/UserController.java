package com.cel.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cel.cloud.entity.User;
import com.cel.cloud.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("simple/{id}")
	public User findById(@PathVariable Long id){
		return userService.findById(id);
	}
}
