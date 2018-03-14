package com.liuhao.avmoo.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.liuhao.avmoo.web.dao.IAvmooDao;
import com.liuhao.avmoo.web.domain.AvmooVO;

@RestController
public class AvmooController {

	@Autowired
	private IAvmooDao daosss;

	@RequestMapping(value = "/getData", method = RequestMethod.GET)
	public String getDatasss() {
		return "ok123";
	}

	@RequestMapping(value = "/ttt", method = RequestMethod.GET)
	public List<AvmooVO> getTtt() {
		return daosss.findData();
	}
}
