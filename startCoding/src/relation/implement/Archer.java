package relation.implement;

public class Archer extends Unit implements Attack, Flight{
	public Archer(int hp, int mana) {
		super(hp, mana);
	}
	
	public void attack() {
		System.out.println("�ü� ����");
	}
	
	public void fly() {
		System.out.println("���ƶ� ȭ���");
	}
}
