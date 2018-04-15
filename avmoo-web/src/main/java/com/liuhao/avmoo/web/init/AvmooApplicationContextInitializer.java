package com.liuhao.avmoo.web.init;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

public class AvmooApplicationContextInitializer
		implements ApplicationContextInitializer<ConfigurableApplicationContext> {

	@Override
	public void initialize(ConfigurableApplicationContext applicationContext) {
		System.out.println("===============AvmooApplicationContextInitializer.initialize===========================");
	}

	// /META-INF/
	// spring.factories
	// org.springframework.context.ApplicationContextInitializer=com.liuhao.avmoo.web.init.AvmooApplicationContextInitializer
	
	// Customize the Environment or ApplicationContext before it starts
	// 1.Programmatically per application by calling the addListeners and addInitializers methods on SpringApplication before you run it
	// 2.Declaratively per application by setting context.initializer.classes or context.listener.classes
	// 3.Declaratively for all applications by adding a META-INF/spring.factories and packaging a jar file that the applications all use as a library
	
}
