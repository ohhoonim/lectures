package com.ohhoonim.pension;

public class Customer {
	private String name;
	private String phone;
	public static int index = 0;
	
	public Customer(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb = sb.append("현재 투숙객 - [이름] ");
		sb = sb.append(this.name);
		sb = sb.append(" [전화번호] ");
		sb = sb.append(this.phone);
		return sb.toString();
	}
}
