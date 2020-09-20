package com.rajkumar.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.rajkumar.spring.boot.repository")
public class SpringBootCompleteApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCompleteApplication.class, args);
	}

}
