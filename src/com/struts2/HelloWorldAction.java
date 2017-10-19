package com.struts2;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String execute() throws Exception {

		if ("wang".equals(getName())) {
			return "FAILURE";
		} else {
			return "SUCCESS";
		}
	}

	public void validate() {
		if ("".equals(getName())) {
			addActionError("用户名不能为空");
		}
	}
}
