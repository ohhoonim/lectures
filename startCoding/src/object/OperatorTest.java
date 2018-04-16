package object;

public class OperatorTest {
	public static void main(String[] args) {
		Operator oper = new Operator();
		
		int result = oper.minus(6, 3);
		System.out.println(result);
		
		result = oper.plus(45,  8);
		System.out.println(result);
	}
}
