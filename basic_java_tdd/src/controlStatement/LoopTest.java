package controlStatement;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class LoopTest {

	@Test
	public void loopTest1() {
		// for문
		// for (초기값; 반복을 끝낼 조건; 증가값) {
		// 반복시 실행할 코드
		// }

		// 10번 반복하게 된다.
		for (int i = 0; i < 10; i++) {
			System.out.println("start coding");
		}
		System.out.println("====================");

		int[] arrNum = { 2, 32, 56, 30, 90, 56 };
		// arrNum 배열의 길이 만큼 반복하고 해당 인덱스의 값을 출력한다.
		for (int i = 0; i < arrNum.length; i++) {
			System.out.println(arrNum[i]);
		}
	}

	@Test
	public void loopTest2() {
		// for each
		System.out.println("-----for each---------");
		int[] arrNum = { 2, 32, 56, 30, 90, 56 };
		for (int val : arrNum) {
			System.out.println(val);
		}
	}

	@Test
	public void loopSumTest() {
		int[] arrNum = { 2, 32, 56, 30, 90, 56 };

		int resultsum = 0;
		for (int i = 0; i < arrNum.length; i++) {
			resultsum += arrNum[i]; // resultsum = resultsum + arrNum[i]
		}

		assertThat(resultsum, is(266));
		// System.out.println("arrNum배열의 총합: " + resultsum);
	}

	@Test
	public void loopBreakTest() {
		int[] arrNum = { 2, 32, 56, 30, 90, 56 };
		int resultsum = 0;
		for (int i = 0; i < arrNum.length; i++) {
			resultsum += arrNum[i];
			if (resultsum > 200) { // 총합이 200을 넘으면 반복문을 종료한다.
				break;
			}
		}
		assertThat(resultsum, is(210));
	}

	@Test
	public void loopContinueTest() {
		int[] arrNum = { 2, 32, 56, 30, 90, 56 };
		int resultsum = 0;
		for (int i = 0; i < arrNum.length; i++) {
			if (arrNum[i] > 50) { // 50보다 큰 값은 더해지지 않는다.
				continue;
			}
			resultsum += arrNum[i];
		}
		assertThat(resultsum, is(64));
	}

	@Test
	public void gugudanTest() {
		// 구구단을 출력하는 for문을 작성하라.
		for (int i = 2; i < 10; i++) {
			System.out.println(("\n" + i + "단"));
			for (int j = 1; j <= 9; ++j) {
				System.out.format("%2d *%2d = %2d\n", i, j, i*j);
			}
		}

	}
	@Test
	public void gugudanTest2() {
		// 구구단을 출력하는 for문을 작성하라. 2~5단, 6~9단 분리 출력
		for (int p = 0; p < 2; p++) {
			for (int times = 1; times < 10; times++) {
				String row = "";
				for (int dan = p * 4 + 2; dan < p * 4 + 6; dan++) {
					row += dan + " * " + times + " = " + (dan * times) + "\t";
				}
				System.out.println(row);
			}
			System.out.println();
		}
				
		for (int i = 2; i < 10; i++) {
			System.out.println(("\n" + i + "단"));
			for (int j = 1; j <= 9; ++j) {
				System.out.format("%2d *%2d = %2d\n", i, j, i*j);
			}
		}
		
	}
	
	@Test
	public void whileStmtTest() {
		// while 
		// 무한루프 돌리고 싶을 때 - 꺼지지 않는 프로그램을 제작할 때
		
		/*
		 	while (조건) {     
		 		// <= 조건이 만족되는 동안 계속 코드가 실행됨
		 	}
		int i = 0;
		while (true) {
			System.out.println(i++);
		}
		     // <== 무한 루프
		*/
		
		int i = 0;		
		while ( i < 100) {
			System.out.println(i++);
		}
	}
	
	@Test
	public void whileBreakTest() {
		int i = 0;
		while ( i < 1000) {
			if ( i == 73) {
				break;
			}
			System.out.println(i++);
		}
	}
	
	@Test
	public void whileContinueTest() {
		// 1부터 10 까지 숫자중에서 짝수의 합
		int i = 1;
		int result = 0;
		
		while ( i <= 10) {     // 2 + 4 + 6 + 8 + 10 = 30
			if ( i % 2 == 1) {
				i++;
				continue;
			}
			result += i++;  // result = result + i++;
		}
		
		assertThat(result, is (30));
	}
	
	@Test
	public void doWhileTest() {     // 11 * 5 = 55
		// do~ while 문은 while의 조건이 맞지 않더라도 
		// 최소 한번은 코드가 실행이 되도록 보장한다. 
		
		int i = 11;
		int result = 0;
		
		do {
			result += i++;
		} while (i <= 10);
		
		assertThat(result, is(11));  // 		
	}

}













