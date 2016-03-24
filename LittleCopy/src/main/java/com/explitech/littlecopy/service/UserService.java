package com.explitech.littlecopy.service;

import java.util.List;

import com.explitech.littlecopy.model.User;
import com.explitech.littlecopy.model.UserExample;


public interface UserService {

	int add(User record);
	int update(User record);
	int delete(int userId);
	
	User find(int userId);
	
	int count(UserExample example);
	List<User> list(UserExample example);	
}
