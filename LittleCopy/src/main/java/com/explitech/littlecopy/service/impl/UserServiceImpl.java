package com.explitech.littlecopy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.explitech.littlecopy.dao.UserMapper;
import com.explitech.littlecopy.model.User;
import com.explitech.littlecopy.model.UserExample;
import com.explitech.littlecopy.service.UserService;

public class UserServiceImpl implements UserService {

	
	@Autowired
	private UserMapper userDao;
	
	public int add(User record) {
		// TODO Auto-generated method stub
		return userDao.insertSelective(record);
	}

	public int update(User record) {
		// TODO Auto-generated method stub
		return userDao.updateByPrimaryKeySelective(record);
	}

	public int delete(int userId) {
		// TODO Auto-generated method stub
		return userDao.deleteByPrimaryKey(userId);
	}

	public User find(int userId) {
		// TODO Auto-generated method stub
		return userDao.selectByPrimaryKey(userId);
	}

	public int count(UserExample example) {
		// TODO Auto-generated method stub
		return userDao.countByExample(example);
	}

	public List<User> list(UserExample example) {
		// TODO Auto-generated method stub
		return userDao.selectByExample(example);
	}

	
	
}
