package com.example.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloworld {
	
	@RequestMapping
	public String Hello(){
		return "HelloWorld";
	}

}
