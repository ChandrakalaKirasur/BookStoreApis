package com.bridgelabz.bookstoreapi.service;

import java.util.List;

import com.bridgelabz.bookstoreapi.entity.OrderDetails;
import com.bridgelabz.bookstoreapi.entity.User;

public interface OrderService {

	List<OrderDetails> getOrderList(String token);

	User getOrderConfrim(String token);
}