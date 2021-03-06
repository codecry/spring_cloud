package com.nico;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableCaching
@EnableDiscoveryClient //服务发现
@EnableCircuitBreaker
public class UserAPP {
	
	public static void main(String[] args) {
		
		SpringApplication.run(UserAPP.class , args);
	}

}
