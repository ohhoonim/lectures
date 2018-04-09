package api.lang.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberBall {
	public static void main(String[] args) {
		while(true) {
			try {
				Scanner scanner = new Scanner(System.in);
				System.out.println("숫자를 입력하세요");
				int num1 = scanner.nextInt();
				
				numLengthCheck(num1);
				
				System.out.println(num1);
			} catch(InputMismatchException ime) {
				System.out.println("숫자가 아닙니다.");
			} catch(MissLengthException mle) {
				System.out.println(mle.getMessage());
			}
			
		}
	}
	
	public static void numLengthCheck(int num1) throws MissLengthException {
		// num1은 세자리 숫자여야한다.
		if (num1 < 100 || num1 > 999) {
			// runtime exception은 try catch를 해주지 않아도 된다. 
//			throw new MissLengthRuntimeException("3자리 숫자가 아닙니다.");
			throw new MissLengthException("3자리 숫자가 아닙니다.");
		}
	}

	
}
