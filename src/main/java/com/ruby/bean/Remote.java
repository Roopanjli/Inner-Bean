package com.ruby.bean;


public class Remote 
{
	private String type;

	public Remote() {
		super();
	}

	public Remote(String type) {
		super();
		this.type = type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Remote [type=" + type + "]";
	}   
}
