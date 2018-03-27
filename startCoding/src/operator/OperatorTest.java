package operator;

public class OperatorTest {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		
		int r = a + b; 
		// sysout 이라고 타이핑한 후 ctrl + space
		System.out.println("a+b=" + r); // a+b=3
		
		String strA = "A";
		String strB = "B";
		System.out.println(strA + strB);// AB
		
		System.out.println(strA + a);   // A1
		
		System.out.println(a + b + strA); // 3A
		System.out.println(strA + a + b); // A12
		System.out.println(strA + (a + b)); // A3
		
		System.out.println(a - b);  // 빼기 -1
		System.out.println(a * b);  // 곱하기 2
		System.out.println(a / b);  // 특히 정수형 나누기는 몫을 구할때 자주 사용된다.
		System.out.println(a % b);  // a를 b로 나눈 나머지 
		
		System.out.println("----------------------");
		
		// 증감 연산자 : ++ , --  > 1씩 증가 혹은 1씩 감소
		
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












