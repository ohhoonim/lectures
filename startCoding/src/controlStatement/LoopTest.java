package controlStatement;

public class LoopTest {
	public static void main(String[] args) {
		// 반복문
		// for (초기값; 반복을 끝낼 조건; 증가값) {
		// 	반복시 실행할 코드
		// }
		for(int i = 0; i < 10; i++) {
			System.out.println("start coding");
		}
		// 1. 초기값
		// 2. 조건 비교
		//     참이면, 코드실행
		//     거짓이면, 반복문을 빠져나감(반복문 종료)
		// 3. 2번(조건비교)에서 참이었을 경우
		//    값을 증가시켜주고, 다시 2번항목으로 이동

		int[] arrNum = {23, 34, 53, 34, 64, 34};
		//배열의 모든 값을 조회해보려면 배열의 길이 만큼 반복해주면 된다.
		
		int arrSize = arrNum.length; // 6		
		for (int i = 0; i < arrSize; i++ ) {
			System.out.println(arrNum[i]);
		}
		
		// 아래와 같이 쓰면 매번 조건 검사할 때 마다 배열의 길이를 구하게되므로
		// 속도가 느려질 수 있다. 
		/*
		for (int i = 0; i < arrNum.length; i++ ) {
			System.out.println(arrNum[i]);
		}
		*/
		System.out.println("------------------");
		// for문을 쓰는 두번째 방법 : foreach
		for (int val : arrNum) {
			System.out.println(val);
		}
		System.out.println("--1부터 10까지 합계----");
		
		// 문제 1: 1부터 10까지 합계 구하기
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			sum = sum + i; // sum += i
		}
		System.out.println(sum);
		
		// 문제 2: arrNum 배열에 있는 모든 값의 합계구하기
		System.out.println("--arrNum 배열에 있는 모든 값의 합계----");
		sum = 0;  // sum 값 초기화
		for (int i = 0; i < arrSize; i++) {
			sum += arrNum[i];
		}
		System.out.println(sum);
		
		// 문제 3 : 5 부터 323사이의 숫자 중 짝수의 합계
		sum = 0;
		for ( int i = 5; i < 324; i++ ) {
			if ( i % 2 == 0) {
				sum += i ;
			}
		}
		System.out.println(sum);
		
		// 문제 4 : 4행 3열의 int형 2차원배열을 만들고 초기값을 세팅한 후 
		//           3열 값의 합계를 구하시오.
		
		int[][] arr2d = {
				  {12 , 23 , 46 }
				, {3  , 21 , 45 }
				, {23 , 213, 12 }
				, {213,	421, 345}
		};
		//                   448
		System.out.println("---- 3열 합계");
		sum = 0;
		for (int i = 0; i < 4; i++) {
			sum += arr2d[i][2];
		}
		System.out.println(sum);
		
		// break
		System.out.println("==========break====");
		int [] arrNumB = {2, 32, 56, 30, 90, 56};
		arrSize = arrNumB.length;
		sum = 0;
		for (int i = 0; i < arrSize; i++) {
			sum += arrNumB[i];
			if (sum > 200) {
				break;
			}
		}
		System.out.println(sum);
	}
}

















