package com.souche.insurance.screen.admin.checker;

import javax.servlet.http.HttpServletRequest;

import com.souche.optimus.core.annotation.View;
import com.souche.optimus.core.controller.Context;
import com.souche.optimus.core.controller.Navigator;
import com.souche.optimus.core.sad.AbstractReactScreen;

@View
public class EditCheckerArea extends AbstractReactScreen {
	public void execute(Context context, Navigator nav, HttpServletRequest request) {
		context = super.buildContext(context, request);
		nav.forwardTo("/admin/checker/editCheckerArea");
	}
}
