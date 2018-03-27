package controlStatement;

public class ArrayTest {
	public static void main(String[] args) {
		// �迭 ����
		// �迭�� ������ ���� �ݵ�� �迭�� ����(���� ����)��
		// �������־�� �Ѵ�. 
		int[] a = new int[10];
		
		// �迭������ ���ȣ�� �ε���(index)��� �Ѵ�. 
		// index �� 0 ���� �����Ѵ�. 
		// ������ index ���� '�迭�� ���� - 1' �̴�.
		a[0] = 10; 
		int temp = a[0];
		System.out.println(temp);
		
		a[4] = 34;
		System.out.println(a[4]);
		 
		//a[11] = 23;
		//System.out.println(a[11]);
		// <== ������ ����.
		// ArrayIndexOutOfBoundsException
		
		// �迭�� ���̸� ��������
		System.out.println( a.length );
		
		System.out.println("----------------");
		
		boolean[] hasMoney = new boolean[5];
		
		hasMoney[0] = true;
		hasMoney[1] = false;
		hasMoney[2] = false;
		hasMoney[3] = true;
		hasMoney[4] = false;
		
		if (hasMoney[1] && hasMoney[3]) {
			System.out.println("�Ѵ� true");
		} else {
			System.out.println("�Ѵ� true�� �ƴϴ�.");
		}
		
		System.out.println("----------------");
		// �迭 ������ �ʱⰪ �־��ֱ�
		int[] arrNum = {12, 43, 56, 23, 67};
		System.out.println(arrNum.length);
		System.out.println(arrNum[3]); // 23
		
		arrNum[3] = 54;
		System.out.println(arrNum[3]); // 54
		// �迭�� �� �ε����� ����ִ� ���� ������ �� ������, 
		// �迭�� ���̴� �ѹ� �������� ������ �� ����. 
		System.out.println("----------------");
		// ����....
		// arrNum�� 1�� �ε����� 3�� �ε����� �ִ� ���� ��ȯ�Ͻÿ�.
		System.out.println(arrNum[1]); // <= 43
		System.out.println(arrNum[3]); // <= 54
		
		int tmp = arrNum[1];
		arrNum[1] = arrNum[3];
		arrNum[3] = tmp;
		
		System.out.println(arrNum[1]); // <= 54
		System.out.println(arrNum[3]); // <= 43
		
		// ������ �迭 - 2���� �迭  ������ ���캸�ڽ��ϴ�. 
		
		int[][] arr2d = {
				  {25, 65, 93, 15, 1}
				, {56, 35, 96}
				, {78, 45, 12, 23, 56}
				, {65, 98, 87, 54, 21}
		};
		
		System.out.println(arr2d[0][2]); // <== 93
		
		System.out.println(arr2d.length);    // <== 4
		System.out.println(arr2d[0].length); // <== 5
		
		System.out.println(arr2d[1].length); // <== 3
		// ������ 2�����迭 ���� �迭�� ���̸� �ٸ��� �����ϴ� ���� ������� �ʴ´�.
		// �ݺ����� ����� �� ArrayIndexOutOfBoundsException �� ��Ÿ��
		// ���ɼ��� ũ�� �����̴�. 
		
	}
}















