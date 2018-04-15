package com.liuhao.avmoo.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.WebApplicationContext;

import com.liuhao.avmoo.web.dao.IAvmooDao;
import com.liuhao.avmoo.web.domain.AvmooVO;

@RestController
public class AvmooController {

	@Autowired
	private IAvmooDao daosss;

	@Autowired
	private ApplicationContext ctx;

	@Autowired
	private Environment env;

	@Autowired
	private WebApplicationContext webCtx;

	@Value("${my.name}")
	private String myName;

	@RequestMapping(value = "/getData", method = RequestMethod.GET)
	public String getDatasss() {

		System.out.println(ctx);
		System.out.println(webCtx);
		System.out.println(webCtx.getParent());
		System.out.println(webCtx.getParent().getParent());

		
		System.out.println(env.getProperty("flyway.sql-migration-separator"));
		System.out.println(env.getProperty("flyway.sql-migration-prefix"));
		System.out.println(env.getProperty("flyway.locations"));
		
		// env.getProperty("");

		return "ok123";
	}

	@RequestMapping(value = "/getConfigServerData", method = RequestMethod.GET)
	public String getConfigServerData() {

		return "Spring Configuration Server" + myName;
	}

	@RequestMapping(value = "/ttt", method = RequestMethod.GET)
	public List<AvmooVO> getTtt() {
		return daosss.findData();
	}
}
