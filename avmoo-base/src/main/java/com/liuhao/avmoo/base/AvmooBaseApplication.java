package com.liuhao.avmoo.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AvmooBaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(AvmooBaseApplication.class, args);
	}
}
