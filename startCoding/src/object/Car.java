package object;

// Ŭ����
public class Car {
	
	String company = "HYUNDAI";
	String model = "�׷���";
	String color = "����";
	int maxSpeed ;
	int minSpeed ;
	int speed;	
	
	Car (int maxSpeed, int minSpeed) {
		this.maxSpeed = maxSpeed;
		this.minSpeed = minSpeed;
	}
	Car () {
		this.maxSpeed = 120;
		this.minSpeed = 0;
	}
	
	void setColor (String color) {
		this.color = color;
	} 
	
	String getColor () {
		return this.color;
	}
	
	void speedUp(int newSpeed) {
		this.speed += newSpeed;
		if (this.speed >= this.maxSpeed) {
			this.speed = this.maxSpeed;
		}
	}
	
	void speedDown(int newSpeed) {
		this.speed -= newSpeed;
		if (this.speed <= this.minSpeed) {
			this.speed = this.minSpeed;
		}
	}
	
	int currenSpeed() {
		return this.speed;
	}
	
	
}
