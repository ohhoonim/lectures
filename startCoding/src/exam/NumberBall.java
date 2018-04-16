package exam;

import java.util.Arrays;
import java.util.Scanner;

public class NumberBall {
	public static void main(String[] args) {
		// ��ġ�� �ʴ� ���ڸ� ���ڸ� ���� <- throwBall
		int[] nums = {1,2,3,4,5,6,7,8,9};
		
		int arrSize = nums.length;
		for (int i = 0; i < 3; i++) { // 3�� ������ ���̹Ƿ�..
			int ranNum = (int)(Math.random() * (arrSize - i)) ;			
			// ranNum�� nums�� �ε����� Ȱ���Ͽ� �ش� �ε����� �ִ�
			// ���� �����ϰ� ������ �ε���(arrSize - i - 1)�� ���� ��ȯ�Ѵ�. 
			if ( ranNum != (arrSize - i - 1)) {
				int tmp = nums[ranNum];
				nums[ranNum] = nums[arrSize - i - 1];
				nums[arrSize-i-1] = tmp;
			}
		}		
		// ����� �迭���� 6, 7, 8 �ε������� �������� ����� ���̹Ƿ� �̸� 
		// ������ �迭�� ����
		int[] throwBall = new int[3]; 
		for (int i = 6; i < nums.length; i++) {
			throwBall[i-6] = nums[i];
		}
		// throwBall�� ����� ���� �ֿܼ� ����غ���
		System.out.println("====throwBall===" + Arrays.toString(throwBall));
		
		
		// ����ڰ� ��ġ�� �ʴ� ���ڸ� ���ڸ� �Է� <- hit
		// �����߿� 0 �� ���ԵǾ������� �ȵȴ�. 
		// (��, ���ڷ� �Է��� �Ϳ� ���� ����ó���� ���� �ʴ´�.)
		
		int[] hit = new int[3];
		while(true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("3�ڸ� ���ڸ� �Է��ϼ���: ");
			int hitNum = scanner.nextInt();
			// 1. hitNum�� ���ڸ��� ���� : ��) 153 => 1  5  3			
			int num1 = hitNum / 100;
			int num2 = (hitNum - num1*100) / 10;
			int num3 = hitNum - num1*100 - num2*10;
			//System.out.println(num1 + " " + num2 + " " + num3);
			// 2. num1, num2, num3 �� ��ġ�� �ʴ��� üũ
			// ��ġ�� ������ hit�迭�� ���� �����ϰ� break ��ġ�� continue
			if (num1 - num2 != 0 && num2 - num3 != 0 
					&& num3 - num1 != 0 ) {
				hit[0] = num1;
				hit[1] = num2;
				hit[2] = num3;
				System.out.println("�Է�: " + Arrays.toString(hit));
				// ��
				// 1. �ڸ��� ���� ���ڰ� ������ : strike
				// 2. ���ڴ� ������ �ڸ��� �ٸ��� : ball
				// 3. �Է��� ���ڿ� ����� �� ���ڰ� �����ϸ� : out
				
				//throwBall�迭�� hit�迭 �ΰ��� ���Ѵ�. 
				int strike = 0;
				int ball = 0;
				for (int i = 0; i < 3; i++) {
					for(int j = 0; j < 3; j++) {
						if(throwBall[i] == hit[j]) {
							if ( i == j ) {
								strike++;
							} else {
								ball++;
							}
							break;
						} 
					}
				}
				System.out.println( ball + " b " + strike + " s");
				
				// break ���� : out (<== 3 strike)
				if (strike == 3) {
					System.out.println("out");
					break; // while���� ��������.
				}
			} else {
				System.out.println("�ߺ��� ���ڰ� �ֽ��ϴ�. �ٽ��Է��ϼ���");
				continue;
			}
		} // while�� ��
		
		
 
		
	}
}
