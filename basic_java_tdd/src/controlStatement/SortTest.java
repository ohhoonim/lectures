package controlStatement;

import static org.junit.Assert.*;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;


public class SortTest {
	
	@Test
	public void bubbleSortTest() {
		// 버블소트: 인접한 값과 크기를 비교하여 교환해나가는 방식
		int [] arr = {3, 4, 5, 2, 1};
		int temp = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j= 1 ; j < arr.length-i; j++) {
				if(arr[j] < arr[j-1]) {
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	@Test
	public void treeTest() {
		// 다음의 2차원배열을 트리형태로 출력하시오.
		// 두번째 값은 부모 값을 표현한다. 즉, 
		// {1001, 1000} 는 1001의 부모가 1000임을 나타냄.
		/* 
	 		int [][] tree = {
	 							{0000, 0000}
	 							, {1000, 0000}
	 							, {1001, 1000}
	 							, {2000, 0000}
	 							, {2001, 2000}
	 							, {2002, 2000}
	 							, {3000, 2001}
	 							, {3001, 2001}
	 							, {3002, 1000}
	 							, {3003, 0000}
	 						};
	 		==>
	 		0000
	 			1000
	 				1001
	 				3002
	 			2000
	 				2001
	 					3000
	 					3001
	 				2002
	 			3003

		 *
		 */
		
	}
	
}








