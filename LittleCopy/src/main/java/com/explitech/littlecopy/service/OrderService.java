package com.explitech.littlecopy.service;

import java.util.List;

import com.explitech.littlecopy.model.Order;
import com.explitech.littlecopy.model.OrderExample;
import com.explitech.littlecopy.model.User;

public interface OrderService {

	int add(OrderService record);
	int update(OrderService record);
	int delete(int orderId);
	
	Order find(int OrderId);
	
	int count(OrderExample example);
	List<Order> list(OrderExample example);	
	
}
