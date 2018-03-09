package interfaces;

import static org.junit.Assert.*;

import org.junit.Test;

import interfaces.unit.Archer;
import interfaces.unit.Healer;
import interfaces.unit.Knight;
import interfaces.unit.Unit;

public class IntefacesExam {

	@Test
	public void test() {
		// Unit u = new Unit();
		// ==> 이렇게 쓸수 없다. Unit 클래스는 추상클래스이므로

		Unit knight = new Knight();
		Unit healer = new Healer();
		Unit archer = new Archer();

		knight.active();
		System.out.println("----");
		healer.active();
		System.out.println("----");
		archer.active();
	}

}
