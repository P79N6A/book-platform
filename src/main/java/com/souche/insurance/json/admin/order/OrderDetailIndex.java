//package com.souche.insurance.json.admin.order;
//
//import java.util.Map;
//
//import org.apache.commons.lang.ObjectUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import com.alibaba.fastjson.JSONObject;
//import com.google.common.collect.Maps;
//import com.souche.insurance.common.exception.InsuranceServiceException;
//import com.souche.insurance.domain.model.InsuranceOrderDetailWrapperModel;
//import com.souche.insurance.domain.model.InsuranceOrderModel;
//import com.souche.insurance.service.InsuranceOrderService;
//import com.souche.optimus.core.annotation.View;
//import com.souche.optimus.core.sad.AbstractReactAction;
//import com.souche.optimus.core.sad.Props;
//import com.souche.optimus.core.sad.ReactAction;
//import com.souche.optimus.core.sad.State;
//import com.souche.sso.client2.AuthNHolder;
//
//import lombok.extern.slf4j.Slf4j;
//
///**
// * 
// * @author hehaibo
// *
// */
//@Slf4j
//@View(value = "OrderDetailIndex", desc = "订单管理")
//public class OrderDetailIndex extends AbstractReactAction {
//
//	@Autowired
//	private InsuranceOrderService insuranceOrderService;
//
//	@Override
//	public Map<String, Object> init(Props props) {
//		Map<String, Object> map = Maps.newHashMap();
//		String orderCode = props.get("orderCode", String.class);
//		String from =props.get("from",String.class);
//		InsuranceOrderDetailWrapperModel orderDetail = insuranceOrderService
//				.getInsuranceOrderDetailModelByOrderCode(orderCode);
//		map.put("orderDetail", orderDetail);
//		map.put("from", from);
//		return map;
//	}
//	
//	@ReactAction(desc = "审核质保订单")
//	public void auditQaOrder() {
//		State state = super.getState();
//		InsuranceOrderModel auditParam = JSONObject
//				.parseObject(ObjectUtils.toString(state.get("auditParam")), InsuranceOrderModel.class);
//		log.info("审核质保订单：{}", JSONObject.toJSONString(auditParam));
//		auditParam.setOperator(AuthNHolder.userId());
//		auditParam.setOperatorName(AuthNHolder.userName());
//		Boolean result = this.insuranceOrderService.auditQaOrder(auditParam);
//		if (result != null && result) {
//			return;
//		}
//		throw new InsuranceServiceException("保存失败");
//	}
//}
