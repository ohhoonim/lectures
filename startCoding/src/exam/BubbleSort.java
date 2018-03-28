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
				// �ڸ��ٲ�
				if (arr[i] - arr[i+1] > 0 ) {
					int tmp = arr[i];
					arr[i] = arr[i+1];
					arr[i + 1] = tmp;
					// �ڸ��ٲ޿��� �÷��� = true�� ����
					isChanged = true;
				}
			}
			// ������ �ݺ����� �ڸ� �ٲ��� ���������� üũ�ϰ� ������ break;
			if (!isChanged ) {
				break;
			}
		}
		
		// ��� ���
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
}
