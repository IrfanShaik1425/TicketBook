package com.booking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booking.entity.User;
import com.booking.repository.UserRepository;

@Service
public class UserServiceImplementation implements UserService
{

	@Autowired
	private UserRepository userrepo;
	@Override
	public String saveUser(User user) 
	{
		
		userrepo.save(user);
		return "Successufully Save";
	}

}
