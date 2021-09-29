package com.sportyshoes.repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sportyshoes.entity.Order;
import com.sportyshoes.entity.Shoe;



public interface OrderRepository extends JpaRepository<Order, Integer> {
	
	public List<Order> findByOrderDate(LocalDate orderDate);
		
	public List<Order> findByCategory(String category);
	
	

}
