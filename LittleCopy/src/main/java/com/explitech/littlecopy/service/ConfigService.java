package com.explitech.littlecopy.service;

import java.util.List;

import com.explitech.littlecopy.model.Config;
import com.explitech.littlecopy.model.ConfigExample;
import com.explitech.littlecopy.model.User;

public interface ConfigService {

	int add(Config record);
	int update(Config record);
	int delete(int configId);
	
	Config find(int configId);
	
	int count(ConfigExample example);
	List<Config> list(ConfigExample example);	
	
}
