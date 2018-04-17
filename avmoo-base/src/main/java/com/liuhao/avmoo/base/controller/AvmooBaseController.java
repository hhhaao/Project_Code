package com.liuhao.avmoo.base.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AvmooBaseController {
	@RequestMapping("/gd")
	public Object getData() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", "avmoo_base");

		return map;
	}
}
