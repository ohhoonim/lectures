package object.example;

public class Car {
	public String company = "HYUNDAI";
	
	private String model = "그랜져";
	private String color = "검정";
	int speed;

	protected int maxSpeed = 160;
	
	public static String madeBy = "KOREA";
	public static final String exportTo = "USA";

	// 생성자
	public Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	// 디폴트 생성자
	public Car() {
		
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int getSpeed() {
		return this.speed;
	}
}
