package com.sportyshoes.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

@Entity
@Table(name = "orders")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int orderId;
	
	private String category;
	
	
	private LocalDate orderDate;
	
	private String orderName;
	
	private String orderDescription;
	
	private int orderQuantity;
	
	private double orderPrice;
	
	public Order(String category, String orderName, String orderDescription, int orderQuantity, double orderPrice) {
		super();
		this.category = category;
		this.orderName = orderName;
		this.orderDescription = orderDescription;
		this.orderQuantity = orderQuantity;
		this.orderPrice = orderPrice;
	}

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public String getOrderDescription() {
		return orderDescription;
	}

	public void setOrderDescription(String orderDescription) {
		this.orderDescription = orderDescription;
	}

	public int getOrderQuantity() {
		return orderQuantity;
	}

	public void setOrderQuantity(int orderQuantity) {
		this.orderQuantity = orderQuantity;
	}

	public double getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(double orderPrice) {
		this.orderPrice = orderPrice;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", category=" + category + ", orderDate=" + orderDate + ", orderName="
				+ orderName + ", orderDescription=" + orderDescription + ", orderQuantity=" + orderQuantity
				+ ", orderPrice=" + orderPrice + "]";
	}



}
