package object;

public class CarTest {
	public static void main(String[] args) {
		
		Car car = new Car(180, 10);
		System.out.println("����ӵ� : " + car.currenSpeed());
		
		car.speedUp(50);
		System.out.println("����ӵ� : " + car.currenSpeed());
		
		car.speedDown(10);
		System.out.println("����ӵ� : " + car.currenSpeed());
		
		car.speedUp(200);
		System.out.println("����ӵ� : " + car.currenSpeed());
		
		car.speedDown(2000); // down�ӵ��� �ƹ��� ���絵 0
		System.out.println("����ӵ� : " + car.currenSpeed());
		
	}
}
