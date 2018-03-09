package variable;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class OperatorTest {
 
	@Test
	public void opertatorTest1 () {
		// 산술연산자
		int a = 1;
		int b = 2;
		
		int c = a + b;
		assertThat(c, is(3));
		
		c = a - b;
		assertThat(c, is(-1));
		
		c = a * b;
		assertThat(c, is(2));
		
		c = a / b;  // 0.5가 나와야하나 타입이 int형이기
		            // 때문에 소숫점이 빠진 0이 된다. 
		assertThat(c, is(0));
		
		c = a % b; 
		assertThat(c, is(1));
		
		a++;    // a = a + 1
		assertThat(a, is(2));
		
		a--;
		assertThat(a, is(1));  // 위에서 ++ 해준상태에서 다시 --(1감소)를 했으므로
		
		++b;
		assertThat(b, is(3));
		
		--b;
		assertThat(b, is(2));
		
		a += a;    // a = a + a
		assertThat(a, is(2));
		
		b += b;     // b = b + b
		assertThat(b, is(4));
		
		b *= 5;     // b = b * 5
		assertThat(b, is(20));
		
	}
	
	@Test
	public void operatorTest2() {
		// 비교연산자
		int a = 5;
		int b = 7;
		
		assertFalse(a == b);
		assertTrue(a != b);
		
		assertFalse(a > b);
		assertTrue (a < b);
		
		assertFalse(a >= b);
		assertTrue(a <= b);
		
	}
	
	@Test
	public void operatorTest3() {
		// 논리연산자
		boolean a = true;
		boolean b = false;
		
		assertFalse (a && b);   // 논리곱. 양쪽이 모두 true여야 true가 된다. 		
		assertTrue  (a || b);    // 논리합. 어느 한쪽이라도 true가 있으면 true이다 .
		
		assertTrue  (!b );  // not은 true를 false로 false를 true로 만들어 준다. 
		assertFalse (!a );
		
		// 삼항 연산자
		int c = 4;
		int d = 7;
		           //  조건  ? 참일때 값: 거짓일때 값
		int result = (c == d) ? c + d   : c * d; 
		assertThat(result, is(28));
		
		
	}

}










