package com.example.TesterApp;

import com.example.controller.HelloWorldController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TesterAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldController.class, args);
	}

}
