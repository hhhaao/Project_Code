package com.liuhao.avmoo.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AvmooController {

	@RequestMapping(value = "/getData", method = RequestMethod.GET)
	public String getData() {
		return "ok";
	}
}
