package variable;

public class Variable {
	public static void main(String[] args) {
		
		// 변수란 ? 임시 저장 공간
		//        타입을 가지고 있다. 
		//    선언할 때는 '타입 변수명'과 같은 형태로 코딩해준다. 
		
		// 자바에서 제공하는 기본자료형(타입)
		
		// 불린형    : boolean  <== true/false(참/거짓)
		// 뭔가를 판단해야할 때...
		boolean isMember = true;  // c# => bool
		if (isMember) {
			System.out.println("회원입니다.");
		} else {
			System.out.println("회원이 아닙니다.");
		}
		
		// true and true : true
		// true and false : false
		// false and true : false
		// false and false : false
		
		// java 에서는 and => && 로 표현한다. 
		boolean isCar = true;
		boolean isHuman = false;
		
		if (isCar && isHuman) {
			System.out.println("차안에 사람이 타고 있어요.");
		} else {
			System.out.println("아무것도 아닙니다.");
		}
		
		// true or true : true
		// true or false : true
		// false or true : true
		// false or false : false
		// java에서 or는 ||
		boolean a = true;
		boolean b = false;
		
		if (a || b) {
			System.out.println("참입니다.");
		} else {
			System.out.println("거짓입니다.");
		}
		// 하나의 변수명으로 두 번 (변수를) 선언할 수 없다. 
		a = false;
		if (a || b) {
			System.out.println("참입니다.");
		} else {
			System.out.println("거짓입니다."); // <== a, b 모두 false이므로
		}
		
		// 숫자형    : short, int, float, double, long  (정수형, 실수형)
		
		///    - 정수형
		// short : 16 bit  
		// int   : 32 bit  21억정도
		// long  : 64 bit
				
		///    - 실수형 <- 소숫점 있는 숫자
		// float  : 32 bit
		// double : 64 bit
		
		int num1 = 10;
		System.out.println(10);
		
		float num2 = 10.1f;  // <== float형은 뒤에 f를 붙여줘야한다. 
		
		num2 = 10.0f;
		
		if (num1 == num2) {  // '==' 는 같은지를 체크하는 연산자이다. 
			System.out.println("num1과 num2는 같습니다.");
		} else {
			System.out.println("num1과 num2는 다릅니다.");
		}
		// => 형변환 
		/*
		if (a == num1) {  // <== 이렇게는 안된다. 형(타입)이 아예 다르므로
			
		}*/
		/*
		if (1 == "1") {  // 1은 숫자, "1"은 문자열 ==> 타입이 다르므로 비교할 수 없다.
			             // 문자열 String 타입이라고 한다. 
		}*/
		
			
		// 바이트형 : byte
		// 1byte == 8bit
		
		// 바이트형은 파일의 크기를 표현할 때 자주사용이 됩니다. 
		// I/O 라고 하는 file을 다루는 부분을 공부할 때 살펴보겠습니다. 
		// I/O 관련 코딩을 할 때 아래와 같이 코딩을 하는 경우가 많은데
		byte[] readFile = new byte[1024 * 1024]; 
		// <== 파일을 읽을 때 1kbyte 씩 읽겠다라는 뜻임.
		
		/*
			192.168.0.190 <= 1byte.1byte.1byte.1byte		  	  
		 */
		
		// 문자형    : char  <= 문자하나, 'a'  <==> 문자열 "aaaa"
		char chrA = 'A';
		System.out.println(chrA);
		
		// chrA = 'Ab';  //<== 이렇게 쓸 수 없다. 문자는 단 하나만을 저장할 수 있다.
		chrA = '한';
		System.out.println(chrA);
		
		char 변수 = 'a';
		System.out.println(변수);
		
		// 동일한 타입을 여러개 관리하고자할 때 배열 이란것을 이용한다. 
		// 'a' 라는 char형을 여러개의 방에 저장한다면,
		char[] arrA = new char[4];  // char형의 방을 4개 만들어준다.
		arrA[0] = 'a';
		arrA[1] = 'b';
		arrA[2] = 'c';
		arrA[3] = 'd'; 
		// 문자열 "aaaa" 는 자바 내부적으로 위와 같이 배열로 처리가 되고 있다. 
		
		System.out.println(arrA[0]);
		System.out.println(arrA[1]);
		System.out.println(arrA[2]);
		System.out.println(arrA[3]);
		System.out.println("====================");
		// 반복문 
		for (int i = 0; i < 4; i++ ) {
			System.out.println(arrA[i]);
		}
		
		// 배열은 반복문과 같이 쓰이는 경우가 많다. 
		
		
		
		
		// 객체 지향 공부할때 진행할 예정..==> 참조형 => class, object,,,,, 
	}
}
