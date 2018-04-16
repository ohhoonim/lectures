package exam;

import java.util.Arrays;
import java.util.Scanner;

public class NumberBall {
	public static void main(String[] args) {
		// 겹치지 않는 세자리 숫자를 추출 <- throwBall
		int[] nums = {1,2,3,4,5,6,7,8,9};
		
		int arrSize = nums.length;
		for (int i = 0; i < 3; i++) { // 3번 추출할 것이므로..
			int ranNum = (int)(Math.random() * (arrSize - i)) ;			
			// ranNum을 nums의 인덱스로 활용하여 해당 인덱스에 있는
			// 값을 추출하고 마지막 인덱스(arrSize - i - 1)의 값과 교환한다. 
			if ( ranNum != (arrSize - i - 1)) {
				int tmp = nums[ranNum];
				nums[ranNum] = nums[arrSize - i - 1];
				nums[arrSize-i-1] = tmp;
			}
		}		
		// 변경된 배열에서 6, 7, 8 인덱스값이 랜덤으로 추출된 값이므로 이를 
		// 별도의 배열에 저장
		int[] throwBall = new int[3]; 
		for (int i = 6; i < nums.length; i++) {
			throwBall[i-6] = nums[i];
		}
		// throwBall에 저장된 값을 콘솔에 출력해보면
		System.out.println("====throwBall===" + Arrays.toString(throwBall));
		
		
		// 사용자가 겹치지 않는 세자리 숫자를 입력 <- hit
		// 숫자중에 0 이 포함되어있으면 안된다. 
		// (단, 문자로 입력한 것에 대한 에러처리는 하지 않는다.)
		
		int[] hit = new int[3];
		while(true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("3자리 숫자를 입력하세요: ");
			int hitNum = scanner.nextInt();
			// 1. hitNum을 한자리씩 추출 : 예) 153 => 1  5  3			
			int num1 = hitNum / 100;
			int num2 = (hitNum - num1*100) / 10;
			int num3 = hitNum - num1*100 - num2*10;
			//System.out.println(num1 + " " + num2 + " " + num3);
			// 2. num1, num2, num3 이 겹치지 않는지 체크
			// 겹치지 않으면 hit배열에 값을 세팅하고 break 겹치면 continue
			if (num1 - num2 != 0 && num2 - num3 != 0 
					&& num3 - num1 != 0 ) {
				hit[0] = num1;
				hit[1] = num2;
				hit[2] = num3;
				System.out.println("입력: " + Arrays.toString(hit));
				// 비교
				// 1. 자리가 같고 숫자가 같으면 : strike
				// 2. 숫자는 같은데 자리가 다르면 : ball
				// 3. 입력한 숫자와 추출된 두 숫자가 동일하면 : out
				
				//throwBall배열과 hit배열 두개를 비교한다. 
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
				
				// break 조건 : out (<== 3 strike)
				if (strike == 3) {
					System.out.println("out");
					break; // while문을 빠져나감.
				}
			} else {
				System.out.println("중복된 숫자가 있습니다. 다시입력하세요");
				continue;
			}
		} // while문 끝
		
		
 
		
	}
}
