package com.liuhao.avmoo.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

import com.netflix.zuul.http.ZuulServlet;

@SpringBootApplication
@EnableZuulProxy
public class AvmooZuulApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(AvmooZuulApplication.class, args);
	}
}
