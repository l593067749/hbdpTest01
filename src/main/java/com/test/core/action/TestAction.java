package com.test.core.action;


import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.test.common.action.BaseAction;
import com.test.common.util.RequestUtil;
import com.test.core.service.TestService;


@Controller
public class TestAction extends BaseAction{
	
    @Resource
	private TestService testService;

	public String execute(){
		//��������
		String format = RequestUtil.getString(request, "test", "JSON");
		
		return NONE;
	}
	
}
