package com.liuhao.avmoo.web.main;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.liuhao.avmoo.web")
public class AvmooWebApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AvmooWebApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("========AvmooWebApplication Start Ok===========");
	}
}
