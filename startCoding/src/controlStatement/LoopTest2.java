package controlStatement;

public class LoopTest2 {
	public static void main(String[] args) {
		
		// while �ݺ���
		// ���ѷ����� �����Ű�� ���� ��
		
		/*
		while (true) {
			System.out.println("test...");
			// ������ �ڵ�
		}
		*/
		/*
		int i = 0;
		while( i < 100) {
			System.out.println(i++);
		}
		
		for (int j = 0; j < 100; j++) {
			System.out.println(j);
		}
		*/
		
		int i = 0;
		while (i < 50) {
			System.out.println(i++);
			if ( i == 23) {
				break;
			}
		}
		System.out.println("==============");
		// continue
		i = 1;
		int result = 0; 
		
		while ( i <= 10 ) { // 2 + 4 + 6 + 8 + 10 = 30 
			if ( i % 2 == 1 ) {  // 2�� ���� �������� 1�̸� Ȧ�� 
				i++;
				continue;
			}
			result += i++;
		}
		System.out.println(result);
		
		// do ~ while
		// while������ false���� �ּ� �ѹ��� �ڵ尡 ����ǰԲ� �� �� ���
		i = 11;
		result = 0;
		
		do {
			result += i++;
		} while (i < 10);
		
		System.out.println(result);
	}
}












