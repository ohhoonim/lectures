package com.ohhoonim.pension;

public class Sweet extends RoomType {
	public Sweet() {
		super(260000, 30);
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb = sb.append("스위트룸 ");
		sb = sb.append(super.toString());
		return sb.toString();
	}
}
