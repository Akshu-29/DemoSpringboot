package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.beans.UserDetails;
import com.example.service.UserService;

@RestController
@RequestMapping("/users")
public class DemoSprinbootController {

	//http://localhost:8080/users/1
	
	/*
	 * @GetMapping(path="/{userId}" ) // to fetch json or xml response public
	 * ResponseEntity<UserDetails> getUser(@PathVariable String userId) {
	 * UserDetails userDtls = new UserDetails(); userDtls.setFirstName("Azam");
	 * userDtls.setLastName("Qureshi"); userDtls.setEmail("aaa@.com");
	 * userDtls.setUserId(userId); return new
	 * ResponseEntity<UserDetails>(userDtls,HttpStatus.ACCEPTED); }
	 */
	
	
	  @Autowired  
	  UserService userService;  
	  //creating a get mapping that retrieves all the user detail from the database   
	  @GetMapping()  
	  private List<UserDetails> getAllUsers()   
	  {  
	  return userService.getAllUsers();  
	  }  
	  //creating a get mapping that retrieves the detail of a specific user  
	  @GetMapping("{id}")  
	  private UserDetails getUser(@PathVariable("id") int id)   
	  {  
	  return userService.getUserById(id);  
	  }  
	 
		
}
