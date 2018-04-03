package relation.implement;

public class Archer extends Unit implements Attack, Flight{
	public Archer(int hp, int mana) {
		super(hp, mana);
	}
	
	public void attack() {
		System.out.println("궁수 공격");
	}
	
	public void fly() {
		System.out.println("날아라 화살아");
	}
}
