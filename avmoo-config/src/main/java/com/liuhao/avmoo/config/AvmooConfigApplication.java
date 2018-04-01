package com.liuhao.avmoo.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class AvmooConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(AvmooConfigApplication.class, args);
	}
}
