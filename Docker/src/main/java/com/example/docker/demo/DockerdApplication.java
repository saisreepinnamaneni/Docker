package com.example.docker.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerdApplication {
	
	@GetMapping("/message")
	public String getMessage() {
		return "welcome to DXC ";
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerdApplication.class, args);
	}

}
