package com.cel.cloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.boot.SpringApplication;

@SpringBootApplication
@EnableEurekaClient
public class SpringbootProviderApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringbootProviderApplication.class, args);
	}
}
