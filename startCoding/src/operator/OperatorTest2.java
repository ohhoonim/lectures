package operator;

public class OperatorTest2 {
	public static void main(String[] args) {
		// �� �����ڿ� �� �������� ���� ����� boolean���̴�.
		// ��, true �Ǵ� false ���� ����� ���´�.

		// �񱳿�����
		// >, <, >=, <=, ==, !=
		int a = 3;
		int b = 4;

		if (a > b) {
			System.out.print("a�� b���� ũ��");
		} else {
			System.out.println("a�� b���� ũ�� �ʴ�"); // <==
		}

		if (a < b) {
			System.out.println("a�� b���� �۴�"); // <==
		} else {
			System.out.println("a�� b���� �����ʴ�.");
		}

		if (a >= b) {
			System.out.println("a�� b���� ũ�ų� ����.");
		} else {
			System.out.println("a�� b���� ũ�� �ʰų� �����ʴ�."); // <==
		}

		if (a == b) {
			System.out.println("a�� b�� ����"); // <== ��¾ȵ�.
		}
		
		if (a != b) {
			System.out.println("a�� b�� �����ʴ�.");
		}
		
		// ��������
		// && <== and ~�̰�   		����
		/*	���� ��� true�� �� true�̴�.
		  	true  && true  ==> true
		  	true  && false ==> false
		  	false && true  ==> false
		  	false && false ==> false
		 */
				
		// || <== or  ~�Ǵ�		����
		/*	��� �����̶� true�̸� true�̴�. 
		  	true  || true  ==> true 
		  	true  || false ==> true
		  	false || true  ==> true
		  	false || false ==> false
		 */
		
		int e = 3;
		int f = 5;
		int g = 3;
		int h = 8;
		
		//e > f && g < h  // <== false
		// && ������ �� ��� ���׿� false �󵵰� ���� ������ ����Ǵ� ����
		// ��ġ��Ű�� ���α׷� ����ӵ� ������ ������ �� �� �ִ�. 
		
		//e > f || g < h  
		
		// ���� ������ 
		
		int i = 4;
		int j = 7;
		
		// i�� j ���� ũ�� ���ϱ⸦ �ϰ�, ũ��������(������) ���ϱ⸦ �� ����� ������ ������ ����
		
		int result = (i > j) ? i + j : i * j ;
		
		System.out.println(result);
		
	}
}










