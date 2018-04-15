package com.liuhao.avmoo.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.liuhao.avmoo.web.domain.AvmooVO;

@Mapper
public interface IAvmooDao {
	List<AvmooVO> findData();
}
