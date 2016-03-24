package com.explitech.littlecopy.service;

import java.util.List;

import com.explitech.littlecopy.model.Utilization;
import com.explitech.littlecopy.model.UtilizationExample;
import com.explitech.littlecopy.model.User;

public interface UtilizationService {

	int add(Utilization record);
	int update(Utilization record);
	int delete(int utilizationId);
	
	Utilization find(int utilizationId);
	
	int count(UtilizationExample example);
	List<Utilization> list(UtilizationExample example);	
	
}
