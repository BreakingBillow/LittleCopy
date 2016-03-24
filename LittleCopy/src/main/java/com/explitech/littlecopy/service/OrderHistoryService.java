package com.explitech.littlecopy.service;

import java.util.List;

import com.explitech.littlecopy.model.OrderHistory;
import com.explitech.littlecopy.model.OrderHistoryExample;
import com.explitech.littlecopy.model.User;

public interface OrderHistoryService {

	int add(OrderHistory record);
	int update(OrderHistory record);
	int delete(int orderHistoryId);
	
	OrderHistory find(int orderHistoryId);
	
	int count(OrderHistoryExample example);
	List<OrderHistory> list(OrderHistoryExample example);	
	
}
