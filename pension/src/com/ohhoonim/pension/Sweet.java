package com.ohhoonim.pension;

public class Sweet extends RoomType {
	public Sweet() {
		super(260000, 30);
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb = sb.append("����Ʈ�� ");
		sb = sb.append(super.toString());
		return sb.toString();
	}
}
