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
		sb = sb.append("���� ������ - [�̸�] ");
		sb = sb.append(this.name);
		sb = sb.append(" [��ȭ��ȣ] ");
		sb = sb.append(this.phone);
		return sb.toString();
	}
}
