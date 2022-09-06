package com.ust;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan(basePackages = {"com.ust"})
public class DemoStudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoStudentApplication.class, args);
	}

}
