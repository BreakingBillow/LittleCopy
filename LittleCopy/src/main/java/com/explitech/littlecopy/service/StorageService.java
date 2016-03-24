package com.explitech.littlecopy.service;

import java.util.List;

import com.explitech.littlecopy.model.Storage;
import com.explitech.littlecopy.model.StorageExample;
import com.explitech.littlecopy.model.User;

public interface StorageService {

	int add(Storage record);
	int update(Storage record);
	int delete(int storageId);
	
	Storage find(int storageId);
	
	int count(StorageExample example);
	List<Storage> list(StorageExample example);	
}
