package com.example.demo.Controllers;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.classic.Logger;

@RestController
@RequestMapping("/api/v1")
public class HomeController {
	Logger logger = (Logger) LoggerFactory.getLogger(HomeController.class);

	@GetMapping("/test")
	public String test() {
		this.logger.warn("This is working message");
		return "Testing message";
	}

}
