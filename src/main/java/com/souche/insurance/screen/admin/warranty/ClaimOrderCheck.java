package com.souche.insurance.screen.admin.warranty;

import com.souche.optimus.core.annotation.View;
import com.souche.optimus.core.controller.Context;
import com.souche.optimus.core.controller.Navigator;
import com.souche.optimus.core.sad.AbstractReactScreen;

import javax.servlet.http.HttpServletRequest;

@View
public class ClaimOrderCheck extends AbstractReactScreen {
	public void execute(Context context, Navigator nav, HttpServletRequest request) {
		context = super.buildContext(context, request);
		nav.forwardTo("/admin/warranty/claimOrderCheck");
	}
}
