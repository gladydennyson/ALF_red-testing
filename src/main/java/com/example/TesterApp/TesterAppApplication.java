package com.example.TesterApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.example.alfred.common.AspectsModuleConfiguration;

@SpringBootApplication
@Import(AspectsModuleConfiguration.class)
public class TesterAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesterAppApplication.class, args);
	}

}
