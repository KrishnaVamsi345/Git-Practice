package com.security.springsecurityproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.security.springsecurityproject.entity.User;
import com.security.springsecurityproject.service.SecurityService;

@RestController
@RequestMapping("/users")
public class SecurityController {
	
	@Autowired
	private User user;
	
	@Autowired
	private SecurityService securityService;
	
	@GetMapping("/allUsers")
	public String getUsers()
	{
		return "Success";
	}
	

}
