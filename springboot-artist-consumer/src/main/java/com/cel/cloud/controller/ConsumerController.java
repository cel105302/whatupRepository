package com.cel.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cel.cloud.entity.User;

@RestController
public class ConsumerController {
	@Autowired
	private RestTemplate restTemlate;
	public User findById(Long id){
		return this.restTemlate.getForObject("http://localhost:8089/simple/" + id, User.class);
	}
}
