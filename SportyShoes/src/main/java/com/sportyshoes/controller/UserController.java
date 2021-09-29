package com.sportyshoes.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sportyshoes.entity.User;
import com.sportyshoes.repository.UserRepository;



@RestController
@RequestMapping("/admin")
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	
	//Find user by user name
	@GetMapping("/userDetail")
	public Optional<User> findUserByUserName(@RequestParam(value = "userName") String userName){
		User users = userRepository.findByUserName(userName).get();
		return Optional.of(users);
	}
	
	
	//Get User Details
	@GetMapping("/userDetails")
	public List<User> findAllUsers(@RequestParam(value = "role") String role){
		List<User> users = userRepository.findByRole(role);
		return users;
	}
	
	//Update Admin Password
	@PutMapping("/updatePassword")
	public String updatePassword(@RequestParam(value = "userName") String userName, @RequestBody User userObj ) {
		User fetchUser = userRepository.findByUserName(userName).get();
		fetchUser.setPassword(userObj.getPassword());
		User user = userRepository.save(fetchUser);
		return "Password is successfully Updated";
		
	}
	
	
}
