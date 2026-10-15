package com.spring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringDemoJenkinsApplication {
	
	@GetMapping("/msg")
	public String getMsg()
	{
		return "jenkins cicd demo ! again....again upload";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoJenkinsApplication.class, args);
	}

}
