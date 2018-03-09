package interfaces.unit;

import interfaces.skill.Attack;

public class Knight extends Unit implements Attack {
	@Override
	public void active() {
		attack();
	}

	@Override
	public void attack() {
		System.out.println("기사가 공격을 했습니다");
		
	}
}
