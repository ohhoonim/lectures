package controlStatement;

public class Gugudan {

	public static void main(String[] args) {
		// level 1 ������ ���
		/*
		for (int i = 2; i < 10; i++) {
			System.out.println(("\n" + i + "��"));
			for (int j = 1; j <= 9; ++j) {				
				System.out.println((i + " * " + j + " = " + i * j));
			}
		}
		*/
		// level 2 ������ ���. 2~5��, 6~9�� �� �и����
		/*
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
		 */
		/*
		Gugu gugu = new Gugu(3, 17);

		gugu.setWidth(6);
		gugu.print();
		*/
		// ���ﰢ��
		for (int i = 0; i < 8; i++) {
			for (int j = i; j < 8; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("====================");
		// �ﰢ��
		for (int i = 8; i > 0; i--) {
			for (int j = i; j < 8; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}

}
