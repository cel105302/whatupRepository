package com.cel.cloud.mapper;

import org.apache.ibatis.annotations.Param;

import com.cel.cloud.entity.User;

public interface UserMapper {
	public User findById(@Param(value = "id") Long id);
}
