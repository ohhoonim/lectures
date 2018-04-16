package object;

public class CarTest {
	public static void main(String[] args) {
		
		Car car = new Car(180, 10);
		System.out.println("현재속도 : " + car.currenSpeed());
		
		car.speedUp(50);
		System.out.println("현재속도 : " + car.currenSpeed());
		
		car.speedDown(10);
		System.out.println("현재속도 : " + car.currenSpeed());
		
		car.speedUp(200);
		System.out.println("현재속도 : " + car.currenSpeed());
		
		car.speedDown(2000); // down속도를 아무리 낮춰도 0
		System.out.println("현재속도 : " + car.currenSpeed());
		
	}
}
