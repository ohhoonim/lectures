package controlStatement;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;
// 조건문
public class ConditionTest {
 
	@Test
	public void ifTest() {
		// if ( 조건 ) {
		//		 조건이 참일때 실행되는 코드
		// } else {
		//  	조건이 만족하지 않을때 실행되는 코드
		// }
		
		int a = 1;
		int b = 2;
		
		if (a == b) {
			System.out.println("a와 b가 같습니다.");
		} else {
			System.out.println("a와 b는 같지 않습니다.");
		}
		
		// if ~ else if
		/*
		 *    90이상 A
		 *    80이상 B
		 *    70이상 C
		 *    나머지 D
		 */
		int score = 97;
		if (score >= 90) {
			System.out.println("A 학점");
		} else if (score >= 80) {
			System.out.println("B 학점");
		} else if (score >= 70) {
			System.out.println("C 학점");
		} else  {
			System.out.println("D 학점");
		}
		////////////////////////////////
		System.out.println("----------------");
		if (score >= 90) {
			System.out.println("A 학점");
		}  
		if (score >= 80) {
			System.out.println("B 학점");
		} 
		if (score >= 70) {
			System.out.println("C 학점");
		} else  {
			System.out.println("D 학점");
		}		
	}
	
	@Test
	public void switchTest() {
		/*
		 	switch ( 검사할 값 ) {
			 	case 검가할 값의 케이스1 :
			 		실행될 코드;
			 		break;
			 	case 검가할 값의 케이스2 :
			 		실행될 코드;
			 		break;
			 	case 검가할 값의 케이스3 :
			 		실행될 코드;
			 		break;
			 	default :
			 		실행될 코드;
			 		break;
		 	} 
		 */
		/*
		 	1: 월
		 	2: 화
		 	3: 수
		 	4: 목
		 	5: 금
		 	6: 토
		 	7: 일		 
		 */
		System.out.println("---switch-----------------");
		int weekNum = 3;
		switch(weekNum) {
		case 1: 
			System.out.println("월");
			break;                   
			//  break 를 넣어주지 않으면 case 와 상관없이 이후 코드들이 전부 실행이 된다. 
		case 2: 
			System.out.println("화");
			break;
		case 3: 
			System.out.println("수");
			break;
		case 4: 
			System.out.println("목");
			break;
		case 5: 
			System.out.println("금");
			break;
		case 6: 
			System.out.println("토");
			break;
		case 7: 
			System.out.println("일");
			break;
		}
		
		
	}
}










