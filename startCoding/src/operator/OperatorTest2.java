package operator;

public class OperatorTest2 {
	public static void main(String[] args) {
		// 비교 연산자와 논리 연산자의 연산 결과는 boolean형이다.
		// 즉, true 또는 false 값을 결과로 갖는다.

		// 비교연산자
		// >, <, >=, <=, ==, !=
		int a = 3;
		int b = 4;

		if (a > b) {
			System.out.print("a는 b보다 크다");
		} else {
			System.out.println("a는 b보다 크지 않다"); // <==
		}

		if (a < b) {
			System.out.println("a는 b보다 작다"); // <==
		} else {
			System.out.println("a는 b보다 작지않다.");
		}

		if (a >= b) {
			System.out.println("a는 b보다 크거나 같다.");
		} else {
			System.out.println("a는 b보다 크지 않거나 같지않다."); // <==
		}

		if (a == b) {
			System.out.println("a와 b는 같다"); // <== 출력안됨.
		}
		
		if (a != b) {
			System.out.println("a와 b는 같지않다.");
		}
		
		// 논리연산자
		// && <== and ~이고   		논리곱
		/*	양쪽 모두 true일 때 true이다.
		  	true  && true  ==> true
		  	true  && false ==> false
		  	false && true  ==> false
		  	false && false ==> false
		 */
				
		// || <== or  ~또는		논리합
		/*	어느 한쪽이라도 true이면 true이다. 
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
		// && 연산을 할 경우 좌항에 false 빈도가 많을 것으로 예상되는 것을
		// 배치시키면 프로그램 실행속도 개선에 영향을 줄 수 있다. 
		
		//e > f || g < h  
		
		// 삼항 연산자 
		
		int i = 4;
		int j = 7;
		
		// i가 j 보다 크면 더하기를 하고, 크지않으면(작으면) 곱하기를 한 결과를 별도의 변수에 저장
		
		int result = (i > j) ? i + j : i * j ;
		
		System.out.println(result);
		
	}
}










