package com.architecture.calculatorspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.architecture.calculatorspringboot"})
public class CalculatorSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculatorSpringBootApplication.class, args);
	}

}
