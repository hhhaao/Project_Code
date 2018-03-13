package com.liuhao.avmoo.web.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IAvmooDao {
	String findData();
}
