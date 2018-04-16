package relation.implement;

public class Knight extends Unit implements Attack {
	public Knight (int hp, int mana) {
		super(hp, mana);
	}
	
	public void attack() {
		System.out.println("기사 공격");
	}
	
}
