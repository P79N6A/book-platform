package com.souche.insurance.service.impl;

import org.springframework.stereotype.Service;

import com.souche.insurance.model.BookOrderModel;
import com.souche.insurance.model.BookOrderQueryParam;
import com.souche.insurance.service.BookOrderService;
import com.souche.optimus.common.page.Page;

/**
 * @author : Arthur
 * @date 创建时间：Dec 4, 2018 2:19:50 PM
 */
@Service("bookOrderService")
public class BookOrderServiceImpl implements BookOrderService {

	@Override
	public Page<BookOrderModel> queryPageOrderList(BookOrderQueryParam orderQueryParam) {
		// TODO Auto-generated method stub
		return null;
	}

}
