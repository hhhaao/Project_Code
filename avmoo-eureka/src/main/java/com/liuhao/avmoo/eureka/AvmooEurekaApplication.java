package com.liuhao.avmoo.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AvmooEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AvmooEurekaApplication.class, args);
		// new SpringApplicationBuilder(Application.class).web(true).run(args);
	}
}
