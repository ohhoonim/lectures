package operator;

public class OperatorTest {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		
		int r = a + b; 
		// sysout �̶�� Ÿ������ �� ctrl + space
		System.out.println("a+b=" + r); // a+b=3
		
		String strA = "A";
		String strB = "B";
		System.out.println(strA + strB);// AB
		
		System.out.println(strA + a);   // A1
		
		System.out.println(a + b + strA); // 3A
		System.out.println(strA + a + b); // A12
		System.out.println(strA + (a + b)); // A3
		
		System.out.println(a - b);  // ���� -1
		System.out.println(a * b);  // ���ϱ� 2
		System.out.println(a / b);  // Ư�� ������ ������� ���� ���Ҷ� ���� ���ȴ�.
		System.out.println(a % b);  // a�� b�� ���� ������ 
		
		System.out.println("----------------------");
		
		// ���� ������ : ++ , --  > 1�� ���� Ȥ�� 1�� ����
		
		int i = 0;
		System.out.println(i++);  // 0
		System.out.println(i);    // 1
		
		int j = 0;
		System.out.println(++j);  // 1
		System.out.println(j);    // 1 
		
		
		//    +=  -=   *=    /=    %= 
		int x = 2;
		x += 3;     // x = x + 3
		System.out.println(x);  // 5
		
		x -= 2;    // x = x - 2
		System.out.println(x);  // 3
	}
}












