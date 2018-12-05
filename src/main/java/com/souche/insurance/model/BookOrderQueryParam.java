package com.souche.insurance.model;

import java.io.Serializable;

/**
 * 订单查询参数
 * 
 */
public class BookOrderQueryParam implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer qaId;
	/**
	 * 订单编号
	 */
	private String orderCode;
	/***
	 * 买家姓名
	 */
	private String buyerName;
	/**
	 * 买家身份证号
	 */
	private String buyerIdentityId;
	/**
	 * 卖家ID
	 */
	private String buyerAddr;
	/**
	 * 卖家电话
	 */
	private String isHandled;
	/**
	 * 支付状态
	 */
	private String handleTime;

	private Integer page = 1;

	private Integer pageSize = 10;

	public Integer getQaId() {
		return qaId;
	}

	public void setQaId(Integer qaId) {
		this.qaId = qaId;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getBuyerName() {
		return buyerName;
	}

	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

	public String getBuyerIdentityId() {
		return buyerIdentityId;
	}

	public void setBuyerIdentityId(String buyerIdentityId) {
		this.buyerIdentityId = buyerIdentityId;
	}

	public String getBuyerAddr() {
		return buyerAddr;
	}

	public void setBuyerAddr(String buyerAddr) {
		this.buyerAddr = buyerAddr;
	}

	public String getIsHandled() {
		return isHandled;
	}

	public void setIsHandled(String isHandled) {
		this.isHandled = isHandled;
	}

	public String getHandleTime() {
		return handleTime;
	}

	public void setHandleTime(String handleTime) {
		this.handleTime = handleTime;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

}
