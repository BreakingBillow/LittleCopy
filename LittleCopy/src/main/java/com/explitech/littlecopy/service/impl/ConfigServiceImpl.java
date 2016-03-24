package com.explitech.littlecopy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.explitech.littlecopy.dao.ConfigMapper;
import com.explitech.littlecopy.model.Config;
import com.explitech.littlecopy.model.ConfigExample;
import com.explitech.littlecopy.model.User;
import com.explitech.littlecopy.service.ConfigService;

public class ConfigServiceImpl implements ConfigService {

	@Autowired
	private ConfigMapper configDao;
	
	public int add(Config record) {
		// TODO Auto-generated method stub
		return configDao.insertSelective(record);
	}

	public int update(Config record) {
		// TODO Auto-generated method stub
		return configDao.updateByPrimaryKeySelective(record);
	}

	public int delete(int configId) {
		// TODO Auto-generated method stub
		return configDao.deleteByPrimaryKey(configId);
	}

	public Config find(int configId) {
		// TODO Auto-generated method stub
		return configDao.selectByPrimaryKey(configId);
	}

	public int count(ConfigExample example) {
		// TODO Auto-generated method stub
		return configDao.countByExample(example);
	}

	public List<Config> list(ConfigExample example) {
		// TODO Auto-generated method stub
		return configDao.selectByExample(example);
	}

}
