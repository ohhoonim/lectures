package relation.implement;

public class Healer extends Unit implements Attack, Heal {
	public Healer(int hp, int mana) {
		super(hp, mana);
	}
	
	public void heal(int healCnt) {
		System.out.println("���� ��.." + healCnt);
	}
	
	public void attack() {
		System.out.println("���� ���� ");
	}
}
