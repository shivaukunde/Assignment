package com.example.demo.service;

import com.example.demo.exception.ErrorOne;
import com.example.demo.exception.ErrorTwo;

public interface DemoSerrvice {
	
	public String getMessgae();
	
	public String getPostMessgae(String message) throws ErrorOne, ErrorTwo;

}
