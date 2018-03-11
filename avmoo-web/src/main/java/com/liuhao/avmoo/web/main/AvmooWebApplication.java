package com.liuhao.avmoo.web.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.liuhao.avmoo.web")
public class AvmooWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(AvmooWebApplication.class, args);
	}
}
