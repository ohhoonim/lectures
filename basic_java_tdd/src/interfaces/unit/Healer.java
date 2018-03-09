package interfaces.unit;

import interfaces.skill.Attack;
import interfaces.skill.Heal;

public class Healer extends Unit implements Attack, Heal{
	@Override
	public void active() {
		attack();
		heal();
	}
	
	public void attack() {
		System.out.println("힐러가 공격했습니다.");
	}
	
	public void heal() {
		System.out.println("힐러가 힐을 했습니다.");
	}
}
