package com.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	// http://localhost:9090/singleQueryParam?emailid=raj@gmail.com
	
	@RequestMapping(value = "singleQueryParam")
	public String singleQueryParam(@RequestParam("emailid") String email) {
		return "Welcome to Spring boot with Query Param "+email;
	}
	//http://localhost9090/loginQueryParam?emailid=akash@gmail.com&password=123
	@RequestMapping(value = "loginQueryParam")
	public String loginQueryParam(@RequestParam("emailid") String email, @RequestParam("password") String password) {
		if(email.equals("akash@gmail.com") && password.equals("123")) {
			return "Successfully login with query param";
		}else {
			return "Failure try once again with query param";
		}
	}
	
	//  http://localhost:9090/singlePathParam/raj@gmail.com
	
	@RequestMapping(value = "singlePathParam/{emailid}")
	public String singlePathParam(@PathVariable("emailid") String email) {
		return "Welcome to Spring boot with Path Param "+email;
	}
	
	//  http://localhost:9090/loginPathParam/akash@gmail.com/123
	
	@RequestMapping(value = "loginPathParam/{emailid}/{password}")
	public String loginPathParam(@PathVariable("emailid") String email, @PathVariable("password") String password) {
		if(email.equals("akash@gmail.com") && password.equals("123")) {
			return "Successfully login with path param";
		}else {
			return "Failure try once again with path param";
		}
	}
}