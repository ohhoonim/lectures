package controlStatement;

public class LoopTest {
	public static void main(String[] args) {
		// �ݺ���
		// for (�ʱⰪ; �ݺ��� ���� ����; ������) {
		// 	�ݺ��� ������ �ڵ�
		// }
		for(int i = 0; i < 10; i++) {
			System.out.println("start coding");
		}
		// 1. �ʱⰪ
		// 2. ���� ��
		//     ���̸�, �ڵ����
		//     �����̸�, �ݺ����� ��������(�ݺ��� ����)
		// 3. 2��(���Ǻ�)���� ���̾��� ���
		//    ���� ���������ְ�, �ٽ� 2���׸����� �̵�

		int[] arrNum = {23, 34, 53, 34, 64, 34};
		//�迭�� ��� ���� ��ȸ�غ����� �迭�� ���� ��ŭ �ݺ����ָ� �ȴ�.
		
		int arrSize = arrNum.length; // 6		
		for (int i = 0; i < arrSize; i++ ) {
			System.out.println(arrNum[i]);
		}
		
		// �Ʒ��� ���� ���� �Ź� ���� �˻��� �� ���� �迭�� ���̸� ���ϰԵǹǷ�
		// �ӵ��� ������ �� �ִ�. 
		/*
		for (int i = 0; i < arrNum.length; i++ ) {
			System.out.println(arrNum[i]);
		}
		*/
		System.out.println("------------------");
		// for���� ���� �ι�° ��� : foreach
		for (int val : arrNum) {
			System.out.println(val);
		}
		System.out.println("--1���� 10���� �հ�----");
		
		// ���� 1: 1���� 10���� �հ� ���ϱ�
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			sum = sum + i; // sum += i
		}
		System.out.println(sum);
		
		// ���� 2: arrNum �迭�� �ִ� ��� ���� �հ豸�ϱ�
		System.out.println("--arrNum �迭�� �ִ� ��� ���� �հ�----");
		sum = 0;  // sum �� �ʱ�ȭ
		for (int i = 0; i < arrSize; i++) {
			sum += arrNum[i];
		}
		System.out.println(sum);
		
		// ���� 3 : 5 ���� 323������ ���� �� ¦���� �հ�
		sum = 0;
		for ( int i = 5; i < 324; i++ ) {
			if ( i % 2 == 0) {
				sum += i ;
			}
		}
		System.out.println(sum);
		
		// ���� 4 : 4�� 3���� int�� 2�����迭�� ����� �ʱⰪ�� ������ �� 
		//           3�� ���� �հ踦 ���Ͻÿ�.
		
		int[][] arr2d = {
				  {12 , 23 , 46 }
				, {3  , 21 , 45 }
				, {23 , 213, 12 }
				, {213,	421, 345}
		};
		//                   448
		System.out.println("---- 3�� �հ�");
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

















