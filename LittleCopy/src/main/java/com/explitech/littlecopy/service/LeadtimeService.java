package com.explitech.littlecopy.service;

import java.util.List;

import com.explitech.littlecopy.model.Leadtime;
import com.explitech.littlecopy.model.LeadtimeExample;
import com.explitech.littlecopy.model.User;

public interface LeadtimeService {

	int add(Leadtime record);
	int update(Leadtime record);
	int delete(int leadtimeId);
	
	Leadtime find(int leadtimeId);
	
	int count(LeadtimeExample example);
	List<Leadtime> list(LeadtimeExample example);	
	
}
