package com.lianxi5;

import java.io.Serializable;

public class Yonghu implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5523994379355349995L;
	private String name;
	private int password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public Yonghu(String name,int password) {
		super();
		this.name = name;
		this.password = password;
		// TODO Auto-generated constructor stub
	}

}
