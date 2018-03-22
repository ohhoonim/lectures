package com.ohhoonim.pension;

public class Sweet extends RoomType {
	public Sweet() {
		super(260000, 30);
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb = sb.append("½ºÀ§Æ®·ë ");
		sb = sb.append(super.toString());
		return sb.toString();
	}
}
