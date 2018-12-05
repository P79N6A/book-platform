package com.souche.insurance.json.admin.order;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Maps;
import com.souche.insurance.model.BookOrderModel;
import com.souche.insurance.model.BookOrderQueryParam;
import com.souche.insurance.service.BookOrderService;
import com.souche.optimus.common.page.Page;
import com.souche.optimus.core.annotation.Json;
import com.souche.optimus.core.annotation.Param;
import com.souche.optimus.core.annotation.View;
import com.souche.optimus.core.sad.AbstractReactAction;
import com.souche.optimus.core.sad.Props;
import com.souche.optimus.core.sad.ReactAction;
import com.souche.optimus.core.sad.State;

import lombok.extern.slf4j.Slf4j;

/**
 * 订单管理
 * 
 * @author arthur
 *
 */
@Slf4j
@View(value = "OrderIndex", desc = "订单管理")
public class OrderIndex extends AbstractReactAction {

	@Autowired
	private BookOrderService bookOrderService;

	@Override
	public Map<String, Object> init(Props props) {
		Map<String, Object> map = Maps.newHashMap();
		BookOrderQueryParam orderQueryParam=new BookOrderQueryParam();
		orderQueryParam.setPage(1);
		orderQueryParam.setPageSize(5);
		Page<BookOrderModel> queryPageResult = bookOrderService.queryPageOrderList(orderQueryParam);
		map.put("list", queryPageResult);
		return map;
	}

	@ReactAction(desc = "获取订单列表")
	public void getList(@Json(value = "state.query", defaultValue = "") JSONObject query,
			@Param(value = "state.page", defaultValue = "1") Integer page,
			@Param(value = "state.pageSize", defaultValue = "5") Integer pageSize) {
		log.info("订单列表查询参数：query:"+query);
		State state = super.getState();
		BookOrderQueryParam bookOrderQueryParam = JSONObject.toJavaObject(query, BookOrderQueryParam.class);
//		bookOrderQueryParam.setExtInsureChanceStatus(
//				StringUtils.equals("null", bookOrderQueryParam.getExtInsureChanceStatus()) ? ""
//						: bookOrderQueryParam.getExtInsureChanceStatus()
//		);
//		bookOrderQueryParam.setArea(StringUtil.trim(StringUtils.defaultIfEmpty(bookOrderQueryParam.getProvinceCode(), "")
//					+ " "+StringUtils.defaultIfEmpty(bookOrderQueryParam.getCityCode(), "")));
//		bookOrderQueryParam.setProvinceCode(null);
//		bookOrderQueryParam.setCityCode(null);
//		if(StringUtils.equals(bookOrderQueryParam.getWorkflowStatusCode(), "null")) {
//			bookOrderQueryParam.setWorkflowStatusCode(null);
//		}
		bookOrderQueryParam.setPage(page);
		bookOrderQueryParam.setPageSize(pageSize);
		Page<BookOrderModel> queryPageResult = bookOrderService.queryPageOrderList(bookOrderQueryParam);
		state.set("list", queryPageResult);
	}

	@ReactAction(desc = "保存客户信息")
	public void saveCustomerInfo() {
//		State state = super.getState();
//		InsuranceOrderModel orderParam = JSONObject
//				.parseObject(state.get("orderCustomerInfoData").toString(), InsuranceOrderModel.class);
//		String orderInfoString = state.get("orderInfo").toString();
//		InsuranceOrderModel orderInfo = JSONObject.parseObject(orderInfoString,
//				InsuranceOrderModel.class);
//		orderParam.setQaId(orderInfo.getQaId());
//		log.info("保存客户信息：{}", JSONObject.toJSONString(orderParam));
//		orderParam.setOperator(AuthNHolder.userId());
//		orderParam.setOperatorName(AuthNHolder.userName());
//		Boolean result = this.insuranceOrderService.saveCustomerInfo(orderParam);
//		if (result != null && result) {
//			state.set("editCustVisible", false);
//			state.set("productAuthorizeData", null);
//			state.set("productAuthorizeRecord", null);
//			return;
//		}
//		throw new InsuranceServiceException("保存失败");
	}



}
