package com.ohhoonim.pension;

public class Standard extends RoomType {
	public Standard() {
		super(80000, 14);
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb = sb.append("���Ĵٵ�� ");
		sb = sb.append(super.toString());
		return sb.toString();
	}
}
