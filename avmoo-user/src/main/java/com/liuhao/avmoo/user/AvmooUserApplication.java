package com.liuhao.avmoo.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AvmooUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(AvmooUserApplication.class, args);
	}
}
