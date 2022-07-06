package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.exception.ErrorOne;
import com.example.demo.exception.ErrorTwo;

@Service
public class DemoSerrviceimpl implements DemoSerrvice{

	@Override
	public String getMessgae() {
		// TODO Auto-generated method stub
		return "Hello";
	}

	@Override
	public String getPostMessgae(String message) throws ErrorOne, ErrorTwo {
		// TODO Auto-generated method stub
		
		String newMessage="";
		
		if(message.equals("ErrorOne")) {
			
			throw new ErrorOne("Error one is message");
			
		}else if(message.equals("ErrorTwo")) {
			
			throw new ErrorTwo("Error Two is message");
			
		}else {
			
			newMessage = "Your message is " + message;
		}
		
		return newMessage;
	}
	
	

}
