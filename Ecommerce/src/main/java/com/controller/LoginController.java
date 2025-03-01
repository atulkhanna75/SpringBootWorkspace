package com.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Login;
import com.service.LoginService;

@RestController
@RequestMapping("login")		// http://localhsot:8181/login 
@CrossOrigin
public class LoginController {

	@Autowired
	LoginService loginService;
	
	@PostMapping(value = "signup",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String signup(@RequestBody Login login) {
		return loginService.signup(login);
	}
	
	@PostMapping(value = "signin",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String signin(@RequestBody Login login) {
		return loginService.signin(login);
	}
}