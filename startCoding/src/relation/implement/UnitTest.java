package relation.implement;

public class UnitTest {
	public static void main(String[] args) {
		Unit[] units = new Unit[5];
		units[0] = new Knight(10,  2);
		units[1] = new Healer(10, 20);
		units[2] = new Knight(11,  2);
		units[3] = new Knight( 8,  2);
		units[4] = new Archer( 7, 10);
		
		for (int i = 0; i < 5; i++) {
			Unit member = units[i];
			if (member instanceof Heal) {
				((Heal) member).heal(10);
			}
			if (member instanceof Attack) {
				((Attack) member).attack();
			}
			if (member instanceof Flight) {
				((Flight) member).fly();
			}
		}
	}
}








