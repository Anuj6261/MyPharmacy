package com.pharmacystore.dao;

import java.util.List;

import com.pharmacystore.pojo.Order;
import com.pharmacystore.pojo.User;

public interface UserDao 
{

	boolean register(User user);
	boolean checkUser(User user);
	 List<Order> displaymycancelledorder( User user);
	 boolean  cancelOrder(Order order);
	 
}
