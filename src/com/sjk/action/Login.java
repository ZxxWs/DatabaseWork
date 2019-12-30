package com.sjk.action;

import com.opensymphony.xwork2.ActionSupport;

public class Login extends ActionSupport{

	/**
	 * 访问action的时候，默认执行execute方法
	 * 然后配置action访问路径
	 * 
	 * 
	 * */
	
	
	public String execute() {
		return "Success";
	}
}
