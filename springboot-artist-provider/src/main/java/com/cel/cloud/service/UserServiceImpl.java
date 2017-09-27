package com.cel.cloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cel.cloud.entity.User;
import com.cel.cloud.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public User findById(Long id) {
		return userMapper.findById(id);
	}
}
