package com.test.service_reg_and_descovery_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 
 * You first need a Eureka Service registry.
 * 
 * You can use Spring Cloud’s @EnableEurekaServer to stand up a registry with
 * which other applications can communicate.
 * 
 * This is a regular Spring Boot application with one annotation
 * (@EnableEurekaServer) added to enable the service registry.
 * 
 * @author User
 *
 */
@EnableEurekaServer
@SpringBootApplication
public class ServiceRegistrationAndDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistrationAndDiscoveryServiceApplication.class, args);
	}
}