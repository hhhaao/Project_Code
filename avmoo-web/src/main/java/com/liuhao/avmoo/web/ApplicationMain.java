package com.liuhao.avmoo.web;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.liuhao.avmoo.web.init.AvmooApplicationContextInitializer;

@SpringBootApplication
public class ApplicationMain implements CommandLineRunner {

	public static void main(String[] args) {
		// SpringApplication.run(ApplicationMain.class, args);
		// ConfigurableApplicationContext
		SpringApplication app = new SpringApplication(ApplicationMain.class);
		app.addInitializers(new AvmooApplicationContextInitializer());
		// app.addListeners(listeners);		
		app.run(args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("========ApplicationMain Start OK===========");
	}
}
