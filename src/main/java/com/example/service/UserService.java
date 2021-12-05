package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.beans.UserDetails;
import com.example.repository.UserRepository;
@Service

public class UserService {

	@Autowired 
	UserRepository userRepository;  
	
	public List<UserDetails> getAllUsers()   
	{  
	List<UserDetails> users = new ArrayList<UserDetails>();  
	userRepository.findAll().forEach(user -> users.add(user));  
	return users;  
	}  
	//getting a specific record  
	public UserDetails getUserById(int id)   
	{  
	return userRepository.findById(id).get();  
	}  
}
