package com.vehicle.tracker.email.notifer;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@EnableEurekaClient
public class EmailNotiferApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmailNotiferApplication.class, args);
	}

}