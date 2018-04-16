package api.lang.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberBall {
	public static void main(String[] args) {
		while(true) {
			try {
				Scanner scanner = new Scanner(System.in);
				System.out.println("���ڸ� �Է��ϼ���");
				int num1 = scanner.nextInt();
				
				numLengthCheck(num1);
				
				System.out.println(num1);
			} catch(InputMismatchException ime) {
				System.out.println("���ڰ� �ƴմϴ�.");
			} catch(MissLengthException mle) {
				System.out.println(mle.getMessage());
			}
			
		}
	}
	
	public static void numLengthCheck(int num1) throws MissLengthException {
		// num1�� ���ڸ� ���ڿ����Ѵ�.
		if (num1 < 100 || num1 > 999) {
			// runtime exception�� try catch�� ������ �ʾƵ� �ȴ�. 
//			throw new MissLengthRuntimeException("3�ڸ� ���ڰ� �ƴմϴ�.");
			throw new MissLengthException("3�ڸ� ���ڰ� �ƴմϴ�.");
		}
	}

	
}
