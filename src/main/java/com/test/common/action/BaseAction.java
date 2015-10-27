package com.test.common.action;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;

public abstract class BaseAction extends ActionSupport implements ServletResponseAware, ServletRequestAware {
	
	private static final long serialVersionUID = 8401098122013995650L;
	
	protected HttpServletResponse response;
    protected HttpServletRequest request;
    
    @Override
    public void setServletResponse(HttpServletResponse httpServletResponse) {
        this.response = httpServletResponse;
    }

    @Override
    public void setServletRequest(HttpServletRequest httpServletRequest) {
        this.request = httpServletRequest;
    }
    
    protected void print(String str){
    	try {
			response.getOutputStream().print(str);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}
