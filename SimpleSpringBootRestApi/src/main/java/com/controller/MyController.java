package com.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@RequestMapping(value="say") //by default method =get, response in plain text
	public String sayHello() {
	return "Welcome to Spring Rest API";
	}
	@RequestMapping(value="plain", method=RequestMethod.GET, produces=MediaType.TEXT_PLAIN_VALUE) //by default method =get, response in plain text
	public String sayPlain() {
	return "<h2>Welcome to plain Spring Rest API</h2>";
}
	@RequestMapping(value="html", method=RequestMethod.GET,produces=MediaType.TEXT_HTML_VALUE) //by default method =get, response in plain text
	public String sayHTML() {
	return "<h2>Welcome to plain Spring Rest API</h2>";
}
	@RequestMapping(value="xml", method=RequestMethod.GET,produces=MediaType.TEXT_XML_VALUE) //by default method =get, response in plain text
	public String sayXml() {
	return "<sbc>Welcome to plain Spring Rest API</sbc>";
}

}
