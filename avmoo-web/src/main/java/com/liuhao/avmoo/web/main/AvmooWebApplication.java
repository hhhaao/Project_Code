package com.liuhao.avmoo.web.main;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.liuhao.avmoo.web")
@MapperScan("com.liuhao.avmoo.web.dao")
public class AvmooWebApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AvmooWebApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("========AvmooWebApplication Start 123===========");
	}
}
