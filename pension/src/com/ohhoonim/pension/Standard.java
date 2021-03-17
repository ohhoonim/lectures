package com.ohhoonim.pension;

public class Standard extends RoomType {
	public Standard() {
		super(80000, 14);
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb = sb.append("스탠다드룸 ");
		sb = sb.append(super.toString());
		return sb.toString();
	}
}
