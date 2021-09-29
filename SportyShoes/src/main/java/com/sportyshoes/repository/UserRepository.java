package com.sportyshoes.repository;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sportyshoes.entity.User;


public interface UserRepository extends JpaRepository<User, Integer> {
	
	 Optional<User> findByUserName(String userName);
	 
	 List<User> findByRole(String role);
	 
	 
}
