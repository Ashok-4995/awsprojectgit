package com.example.Awsproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AwsProjectController {
	
	
	@GetMapping(value="/get")
	public String getmsg() {
		return "This is AshokAnbarasan .it is checking for aws working properly or not.";
	}

}
