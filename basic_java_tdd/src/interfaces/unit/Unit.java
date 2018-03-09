package interfaces.unit;

public abstract class Unit {
	protected String unitName;
	protected int hp;       // 생명력
	protected int mana;     // 생명력
	protected int attack;   // 공격력
	protected int intelli;  // 지능
	protected int power;    // 힘
	
	public abstract void active() ;
}
