package com.example.TesterApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.example.alfred.common.AlfredConfiguration;

/**
 * Test application that uses alfred.
 *
 *to use alfred, the application must import AlfredConfigurations.class
 */
@SpringBootApplication
@Import(AlfredConfiguration.class)
public class TesterAppApplication {

	/**
	 * main method to start the application
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(TesterAppApplication.class, args);
	}

}
