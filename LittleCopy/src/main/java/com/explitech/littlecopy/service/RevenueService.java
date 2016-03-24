package com.explitech.littlecopy.service;

import java.util.List;

import com.explitech.littlecopy.model.Revenue;
import com.explitech.littlecopy.model.RevenueExample;
import com.explitech.littlecopy.model.User;

public interface RevenueService {

	int add(Revenue record);
	int update(Revenue record);
	int delete(int revenueId);
	
	Revenue find(int revenueId);
	
	int count(RevenueExample example);
	List<Revenue> list(RevenueExample example);	
	
}
