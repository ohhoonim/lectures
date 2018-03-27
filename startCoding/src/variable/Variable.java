package variable;

public class Variable {
	public static void main(String[] args) {
		
		// ������ ? �ӽ� ���� ����
		//        Ÿ���� ������ �ִ�. 
		//    ������ ���� 'Ÿ�� ������'�� ���� ���·� �ڵ����ش�. 
		
		// �ڹٿ��� �����ϴ� �⺻�ڷ���(Ÿ��)
		
		// �Ҹ���    : boolean  <== true/false(��/����)
		// ������ �Ǵ��ؾ��� ��...
		boolean isMember = true;  // c# => bool
		if (isMember) {
			System.out.println("ȸ���Դϴ�.");
		} else {
			System.out.println("ȸ���� �ƴմϴ�.");
		}
		
		// true and true : true
		// true and false : false
		// false and true : false
		// false and false : false
		
		// java ������ and => && �� ǥ���Ѵ�. 
		boolean isCar = true;
		boolean isHuman = false;
		
		if (isCar && isHuman) {
			System.out.println("���ȿ� ����� Ÿ�� �־��.");
		} else {
			System.out.println("�ƹ��͵� �ƴմϴ�.");
		}
		
		// true or true : true
		// true or false : true
		// false or true : true
		// false or false : false
		// java���� or�� ||
		boolean a = true;
		boolean b = false;
		
		if (a || b) {
			System.out.println("���Դϴ�.");
		} else {
			System.out.println("�����Դϴ�.");
		}
		// �ϳ��� ���������� �� �� (������) ������ �� ����. 
		a = false;
		if (a || b) {
			System.out.println("���Դϴ�.");
		} else {
			System.out.println("�����Դϴ�."); // <== a, b ��� false�̹Ƿ�
		}
		
		// ������    : short, int, float, double, long  (������, �Ǽ���)
		
		///    - ������
		// short : 16 bit  
		// int   : 32 bit  21������
		// long  : 64 bit
				
		///    - �Ǽ��� <- �Ҽ��� �ִ� ����
		// float  : 32 bit
		// double : 64 bit
		
		int num1 = 10;
		System.out.println(10);
		
		float num2 = 10.1f;  // <== float���� �ڿ� f�� �ٿ�����Ѵ�. 
		
		num2 = 10.0f;
		
		if (num1 == num2) {  // '==' �� �������� üũ�ϴ� �������̴�. 
			System.out.println("num1�� num2�� �����ϴ�.");
		} else {
			System.out.println("num1�� num2�� �ٸ��ϴ�.");
		}
		// => ����ȯ 
		/*
		if (a == num1) {  // <== �̷��Դ� �ȵȴ�. ��(Ÿ��)�� �ƿ� �ٸ��Ƿ�
			
		}*/
		/*
		if (1 == "1") {  // 1�� ����, "1"�� ���ڿ� ==> Ÿ���� �ٸ��Ƿ� ���� �� ����.
			             // ���ڿ� String Ÿ���̶�� �Ѵ�. 
		}*/
		
			
		// ����Ʈ�� : byte
		// 1byte == 8bit
		
		// ����Ʈ���� ������ ũ�⸦ ǥ���� �� ���ֻ���� �˴ϴ�. 
		// I/O ��� �ϴ� file�� �ٷ�� �κ��� ������ �� ���캸�ڽ��ϴ�. 
		// I/O ���� �ڵ��� �� �� �Ʒ��� ���� �ڵ��� �ϴ� ��찡 ������
		byte[] readFile = new byte[1024 * 1024]; 
		// <== ������ ���� �� 1kbyte �� �аڴٶ�� ����.
		
		/*
			192.168.0.190 <= 1byte.1byte.1byte.1byte		  	  
		 */
		
		// ������    : char  <= �����ϳ�, 'a'  <==> ���ڿ� "aaaa"
		char chrA = 'A';
		System.out.println(chrA);
		
		// chrA = 'Ab';  //<== �̷��� �� �� ����. ���ڴ� �� �ϳ����� ������ �� �ִ�.
		chrA = '��';
		System.out.println(chrA);
		
		char ���� = 'a';
		System.out.println(����);
		
		// ������ Ÿ���� ������ �����ϰ����� �� �迭 �̶����� �̿��Ѵ�. 
		// 'a' ��� char���� �������� �濡 �����Ѵٸ�,
		char[] arrA = new char[4];  // char���� ���� 4�� ������ش�.
		arrA[0] = 'a';
		arrA[1] = 'b';
		arrA[2] = 'c';
		arrA[3] = 'd'; 
		// ���ڿ� "aaaa" �� �ڹ� ���������� ���� ���� �迭�� ó���� �ǰ� �ִ�. 
		
		System.out.println(arrA[0]);
		System.out.println(arrA[1]);
		System.out.println(arrA[2]);
		System.out.println(arrA[3]);
		System.out.println("====================");
		// �ݺ��� 
		for (int i = 0; i < 4; i++ ) {
			System.out.println(arrA[i]);
		}
		
		// �迭�� �ݺ����� ���� ���̴� ��찡 ����. 
		
		
		
		
		// ��ü ���� �����Ҷ� ������ ����..==> ������ => class, object,,,,, 
	}
}
