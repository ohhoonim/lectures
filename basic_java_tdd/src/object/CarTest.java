package object;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

import object.example.Car;
// import 는 사용할 클래스가 어느 위치에 있는지 알려주는 역할을 한다.

public class CarTest {

	@Test
	public void carFieldTest() {
		Car car = new Car();
		
		assertThat(car.company, is("HYUNDAI"));
	}
	
	@Test
	public void carFieldAccessTest() {
		Car car = new Car();
		
		//assertThat(car.model, is("그랜져"));
		// <== 이와 같이 사용할 수 없다. 
		// model 필드는 private 으로 인해 외부에서는 
		// 접근할 수 없다. 
		// public, private, protected 
		// <== 접근한정자 access modifier
		// 접근한정자를 사용하는 이유는 객체지향프로그래밍의
		// 캡슐화 참조.
		/*
		 	public : 누구나 접근 가능
		 	private : 클래스 내에서만 사용가능
		 	protected : 동일패키지 또는 상속관계
		 	아무것도 붙이지 않은 경우: 동일패키지
		 */
		assertThat(car.getColor(), is("검정"));
		// 일반적으로 상태를 나타내는 필드는 private로
		// 외부노출을 막고 필요한 경우 메소드를 통해
		// 필드 값 변경을 허용하는 방식을 사용한다. 
		
	}
	
	@Test
	public void instanceTest() {
		// 다형성
		Car car1 = new Car();
		Car car2 = new Car();
		
		car1.setSpeed(100);
		car2.setSpeed(200);
		
		assertThat(car1.getSpeed(), is(100));
		assertThat(car2.getSpeed(), is(200));
	}
	
	@Test
	public void instanceTest2() {
		
		Car car1 = new Car("그랜져2", "진주");
		assertThat(car1.getColor(), is("진주"));
		
		Car car2 = new Car();
		assertThat(car2.getColor(), is("검정"));
	}
	
	@Test
	public void staticTest() {
		Car car1 = new Car();
		assertThat(car1.company, is("HYUNDAI"));
		
		assertThat(Car.madeBy, is("KOREA"));
		// madeBy  필드는 static 키워드를 붙여줬기때문에
		// new 연산자를 사용하지 않고도 접근가능하다. 
		
		Car.madeBy = "JAPAN";
		assertThat(Car.madeBy, is("JAPAN"));
		
		Car.madeBy = "CHINA";
		assertThat(Car.madeBy, is("CHINA"));
		
		assertThat(Car.exportTo, is("USA"));
		//Car.exportTo = "CHINA";
		// 이렇게는 쓸수없다. exportTo가 final이기때문이다.
		// final 키워드가 붙으면 값을 변경할 수 없다.
		
		
		
	}
	
	

}










