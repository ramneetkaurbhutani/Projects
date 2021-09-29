package com.sportyshoes.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.datetime.joda.LocalDateParser;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sportyshoes.entity.Order;
import com.sportyshoes.entity.Shoe;
import com.sportyshoes.repository.OrderRepository;

@RestController
@RequestMapping("/admin")
public class OrderController {
	
	@Autowired
	OrderRepository orderRepository;
	
	//Get Purchase Report By Date
	@GetMapping("/orderDetails/date/{orderDate}")
	public List<Order> getOrdersByOrderDate(@PathVariable(value = "orderDate") String orderDate) throws ParseException{
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate localDate = LocalDate.parse(orderDate, formatter);
		List<Order> orders = orderRepository.findByOrderDate(localDate);
		return orders;
			
	}
	
	//Get Purchase Report by Category
	@GetMapping("/orderDetails/category")
	public List<Order> getOrdersByCategory(@RequestParam String category){
		List<Order> orders = orderRepository.findByCategory(category);
		return orders;
			
	}
	
	//Get Purchase Report
	@GetMapping("/orderDetails")
	public List<Order> getOrders(){
		List<Order> orders = orderRepository.findAll();
		return orders;
			
	}
	

}
