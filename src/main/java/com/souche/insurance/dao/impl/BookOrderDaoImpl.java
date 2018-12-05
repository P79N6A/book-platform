package com.souche.insurance.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.souche.insurance.dao.BookOrderDao;
import com.souche.optimus.dao.BasicDao;

/**
 * @author : Arthur
 * @date 创建时间：Dec 4, 2018 10:10:57 PM
 */
public class BookOrderDaoImpl implements BookOrderDao {
	
	@Autowired
	private BasicDao basicDao;
	
}
