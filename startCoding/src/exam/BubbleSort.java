package exam;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {3, 4, 5, 2, 1};
		int arrSize = arr.length;
		boolean isChanged = false;
		while(true) {   // {3, 4, 5, 2, 1}
			isChanged = false;
			for (int i = 0; i < arrSize - 1 ; i++) {			
				// 자리바꿈
				if (arr[i] - arr[i+1] > 0 ) {
					int tmp = arr[i];
					arr[i] = arr[i+1];
					arr[i + 1] = tmp;
					// 자리바꿈여부 플래그 = true로 변경
					isChanged = true;
				}
			}
			// 마지막 반복에서 자리 바꿈이 없었는지를 체크하고 없으면 break;
			if (!isChanged ) {
				break;
			}
		}
		
		// 결과 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
}
