package com.ohhoonim.pension;

public class RoomType {
	private int price;
	private int roomSize;
	
	public RoomType(int price, int roomSize) {
		this.price = price;
		this.roomSize = roomSize;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb = sb.append("(");
		sb = sb.append(this.roomSize);
		sb = sb.append("Æò/");
		sb = sb.append(this.price);
		sb = sb.append("¿ø)");
		return sb.toString();
	}
}
