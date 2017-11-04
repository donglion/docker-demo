package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	@GetMapping
	public String test() {
		return "hello";
	}

	@GetMapping("/test2")
	public String test2() {
		return "hello 2";
	}

	@GetMapping("/test3")
	public String test3() {
		return "hello 3";
	}

	@GetMapping("/test4")
	public String test4() {
		return "hello 4";
	}

	@GetMapping("/test5")
	public String test5() {
		return "hello 5";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
