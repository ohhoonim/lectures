package controlStatement;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

// 배열
public class ArrayTest {

	@Test
	public void arrayTest1() {
		// 배열 선언
		int[] arrNum = new int[10]; // 배열을 만들때는 반드시 그 크기를 지정해줘야함.

		int a = 1;
		
		arrNum[0] = 1;
		arrNum[3] = 10;
		// arrNum[10] = 1;
		// <== ArrayIndexOutOfBoundException 이 발생한다. 지정된 방의 크기를 초과하였으므로
		// 최대 index 는 배열의 길이 - 1 이다.

		assertThat(arrNum[3], is(10));
		assertThat(arrNum.length, is(10)); // 배열의 길이
	}

	@Test
	public void arrayTest2() {
		boolean[] hasMoney = new boolean[5];

		hasMoney[0] = false;
		hasMoney[1] = false;
		hasMoney[2] = true;
		hasMoney[3] = false;
		hasMoney[4] = false;

		assertTrue(hasMoney[2]);
		assertFalse(hasMoney[4]);
	}

	@Test
	public void arrayTest3() {
		// 배열 생성시 초기값을 지정해주기
		int[] arrNum = { 12, 43, 56, 23, 67 };

		assertThat(arrNum.length, is(5)); // 초기값 갯수만큼만 방이 만들어진다.
		assertThat(arrNum[3], is(23));
	}

	@Test
	public void arrayTest4() {
		// 2차원 배열
		int[][] arrNums = new int[3][6]; // 3행 6열 과 같은 방식으로 이해해도 됨.

		arrNums[0][0] = 1;
		arrNums[0][1] = 23;
		arrNums[0][2] = 43;
		arrNums[0][3] = 3;
		arrNums[0][4] = 4;
		arrNums[0][5] = 5;
		
		arrNums[1][0] = 34;
		arrNums[1][1] = 3;
		arrNums[1][2] = 4;
		arrNums[1][3] = 5;
		arrNums[1][4] = 3;
		arrNums[1][5] = 4;
		
		arrNums[2][0] = 34;
		arrNums[2][1] = 34;
		arrNums[2][2] = 0;
		arrNums[2][3] = 5;
		arrNums[2][4] = 34;
		arrNums[2][5] = 2;
		
		// 인덱스 1 행의 값을 모두 더하기
		int rowSum =    arrNums[1][0] +
						arrNums[1][1] +  
						arrNums[1][2] +  
						arrNums[1][3] +  
						arrNums[1][4] +  
						arrNums[1][5] ;  
		
		assertThat(rowSum, is(53));
		
		// 인덱스 3 열의 값을 모두 더하기 
		int colSum =    arrNums[0][3] +
						arrNums[1][3] +  
						arrNums[2][3] ;  
		
		assertThat(colSum, is(13));
	}
	
	@Test
	public void arrayTest5() {
		// 2차원 배열을 1차원 배열로 표현하기
		int [][] arrNums = new int[3][6];
		
		arrNums[0][0] = 1;
		arrNums[0][1] = 23;
		arrNums[0][2] = 43;
		arrNums[0][3] = 3;
		arrNums[0][4] = 4;
		arrNums[0][5] = 5;
		
		arrNums[1][0] = 34;
		arrNums[1][1] = 3;
		arrNums[1][2] = 4;
		arrNums[1][3] = 5;
		arrNums[1][4] = 3;
		arrNums[1][5] = 4;
		
		arrNums[2][0] = 34;
		arrNums[2][1] = 34;
		arrNums[2][2] = 0;
		arrNums[2][3] = 5;
		arrNums[2][4] = 34;
		arrNums[2][5] = 2;
		
		Like2Dimension like2 = new Like2Dimension(arrNums);
		int rowIndex = 1;
		int rowSum = like2.rowSum(rowIndex);
		
		assertThat(rowSum, is(53));
	}

	@Test
	public void getCellValueTest() {
		int [][] arrNums = new int[3][6];
		
		arrNums[0][0] = 1;
		arrNums[0][1] = 23;
		arrNums[0][2] = 43;
		arrNums[0][3] = 3;
		arrNums[0][4] = 4;
		arrNums[0][5] = 5;
		
		arrNums[1][0] = 34;
		arrNums[1][1] = 3;
		arrNums[1][2] = 4;
		arrNums[1][3] = 5;
		arrNums[1][4] = 3;
		arrNums[1][5] = 4;
		
		arrNums[2][0] = 34;
		arrNums[2][1] = 34;
		arrNums[2][2] = 0;
		arrNums[2][3] = 5;
		arrNums[2][4] = 34;
		arrNums[2][5] = 2;
		
		Like2Dimension like2 = new Like2Dimension(arrNums);
		
		assertThat(like2.getCellValue(0,  3), is(3));
	}
	
	@Test
	public void forTwoVarTest() {
		for(int i = 0, j = 1; i < 10; i++, j++) {
			System.out.println( i + " | " + j);
		}
	}
}








