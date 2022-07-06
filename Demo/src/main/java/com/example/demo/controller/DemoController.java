package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.ErrorOne;
import com.example.demo.exception.ErrorTwo;
import com.example.demo.service.DemoSerrvice;

@RestController
public class DemoController {
	
	@Autowired
	DemoSerrvice demoService;
	
	@GetMapping("/demo")
	public String test1() {

		return demoService.getMessgae();
	}
	
	
	@PostMapping("/demo/{message}") // http://localhost:8080/demo
	public String test2(@PathVariable("message") String message) throws ErrorOne, ErrorTwo {
		
		String finalmessgae = "";
		
		try {
			
			 finalmessgae = demoService.getPostMessgae(message);
		}catch(Exception e){
			finalmessgae = "Exception occured " + e.getMessage();
			
		}
		return finalmessgae;
		
		
	}
	

}
