package com.cel.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cel.cloud.entity.User;

@RestController
public class ConsumerController {
	@Autowired
	private RestTemplate restTemlate;
	@GetMapping("/test/{id}")
	public User findById(@PathVariable Long id){
		System.out.println(id);
		return this.restTemlate.getForObject("http://localhost:8088/simple/" + id, User.class);
	}
}
