package variable;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class VariableTypeTest {
 
	@Test
	public void booleanTypeTest() {
		boolean isMember = false;
		assertFalse(isMember);
		
		isMember = true;
		assertTrue(isMember);
		
		// boolean 타입은 조건문에서 많이 사용된다. 
		if (isMember) {
			System.out.println("회원입니다."); // 현재 isMember가 true인 상태이므로
		}
		
		// 복합 조건의 예
		boolean isManager = false;
		isMember = false;		
		assertFalse( isManager && isMember); // &&(AND)는 양쪽다 true 이어야 true 이다. 
		
		isManager = true;
		isMember = true;
		assertTrue( isManager && isMember);
		
		isManager = false;
		isMember = true;
		assertTrue( isManager || isMember); // ||(OR)는 한쪽만 true여도 true이다. 		
	}
	
	
	@Test
	public void charTypeTest() {
		char c = 'A'; // char 타입은 '' 로 묶어준다.
		//assertTrue('A' == "A"); // 타입이 다르므로 비교불가
		// c = 'CC';  //  문자 한개만 표현할 수 있다. 
		char[] cStr = new char[5];
		cStr[0] = 'A';
		cStr[1] = 'B';
		cStr[2] = '1';
		cStr[3] = '^';
		cStr[4] = '(';
		
		assertTrue( cStr[4] == '(');
		
		for (int i = 0; i < cStr.length; i++) {
			System.out.print(cStr[i]);
		}
		System.out.println("");
		// java에서 "" (큰따옴표) 로 묶인 문자열은 char 타입으로 배열처리한것이다.
		// 이를 구현한 클래스가 java.lang.String 클래스이며
		// new 연산자를 사용하지 않고 인스턴스화(메모리에 올리는것)할 수 있는
		// 유일한 클래스이다. 
		// "start coding" <== 문자열은 String 클래스이다. 
	}
	
	@Test
	public void byteTypeTest() {
		byte ip = 127;
		System.out.println(ip);		
		// ascii 코드 -> 127 개 
		// utf-8 =>  한글이 3byte
		// ip => 4byte, 6byte      ip4v, ip6v
		byte[] ipv = new byte[4];   // <== byte 는 자리를 배열로 표현하는 경우가 많다.
		
		// [byte] [byte] [byte] [byte]  => 192.168.0.190
		
		// 3,459 byte 의 파일이 있을 때 1kbyte 씩 읽어서 처리하고 싶다면
		// byte[] readFile = new byte[1024]; 선언하고 이를 반복문으로 읽은 바이트
		// 만큼씩 처리해준다. 
	}
	
	
	@Test
	public void numberTypeTest() {
		assertTrue( 1 == 1 ) ;
		assertTrue( 1 == 1.0 ) ;
		assertTrue( 1 == 1.0f ) ; // float형은 1.0f 와 같이 f를 끝에 부여줘도 된다.
		
		int num1 = 1;
		assertTrue( num1 == 1) ;
		// num1 = 1.0f;  // type이 다르면 변수를 할당할 수 없다. 
		int num2 = 1;
		assertTrue(num1 == num2);
		
		float num3 = 1.0f;
		assertTrue(num1 == num3);
		
		// javascript에서는 1 == "1" <==  같은 것으로 인식
		String strNum1 = "1";
		//assertTrue(num1 == strNum1);
		// 타입이 다르면 비교자체가 되지 않는다. 
		
		num1 = 2134567890; // int 형에 저장할 수 있는 최대 크기값은 21억정도..
		/*
		 * 최대 자리수
		 * short : 16 bit
		 * 
		 * int : 32 bit
		 * long : 64 bit
		 * 
		 * float : 32 bit
		 * double : 64 bit
		 */
		
	}

}










