package com.luv2code.springboot.demo.mycoolapp.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

	@GetMapping("/workout")
	public String getDailyWorkout()
	{
		return "Work har and enjoy the success"; 
	}
	@GetMapping("/fortune")
	public String getDailyFortune()
	{
		return "Every Day is a new starts"; 
	}
	
	@GetMapping("/")
	public String sayHello()
	{
		return "Hellow World Time on server is:"+LocalDateTime.now();
	}
	public FunRestController() {
		// TODO Auto-generated constructor stub
	}

}
