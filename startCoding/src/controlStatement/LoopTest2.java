package controlStatement;

public class LoopTest2 {
	public static void main(String[] args) {
		
		// while 반복문
		// 무한루프를 실행시키고 싶을 때
		
		/*
		while (true) {
			System.out.println("test...");
			// 실행할 코드
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
			if ( i % 2 == 1 ) {  // 2로 나눈 나머지가 1이면 홀수 
				i++;
				continue;
			}
			result += i++;
		}
		System.out.println(result);
		
		// do ~ while
		// while조건이 false더라도 최소 한번은 코드가 실행되게끔 할 때 사용
		i = 11;
		result = 0;
		
		do {
			result += i++;
		} while (i < 10);
		
		System.out.println(result);
	}
}












