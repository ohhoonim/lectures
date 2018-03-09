package interfaces.unit;

import interfaces.skill.Attack;
import interfaces.skill.Flight;

public class Archer extends Unit implements Attack{
	@Override
	public void active() {
		attack();
		fly();
	}
	
	public void attack() {
		System.out.println("궁수가 공격을 했습니다.");
	}
	
	public void fly() {
		System.out.println("궁수가 하늘을 날았습니다");
	}
}
