package com.booking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.booking.entity.User;
import com.booking.repository.UserRepository;
import com.booking.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController 
{
	@Autowired
    private UserService userserive;
	
	@Autowired
	private UserRepository userrepo;
	
	@PostMapping("/save")
	public String saveUser( @RequestBody User user)
	{
		
		userserive.saveUser(user);
		return "User Saved Successfully"; 
	}
	
	@PutMapping("/update")
	public User updateUser(@RequestParam("id") Long id)
	{
		User user = userrepo.findById(id).get();
		user.setUserName("Irfan");
		user.setEmail("irfan@123gmail.com");
		user.setPassword("142545");
		userrepo.save(user);
		return user;
	}
	
	@PatchMapping("/patch/{id}")
	public User updation(@PathVariable("id") Long id)
	{
		User user = userrepo.findById(id).get();
		user.setPassword("12345");
		return user;
	}
}
