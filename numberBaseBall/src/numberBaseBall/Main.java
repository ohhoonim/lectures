package numberBaseBall;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		int [] out = Game.create();		
		System.out.println("--------------" + Game.toStrNumber(out));
		int throwCnt = 0;
		while (true) {
			Scanner scanner = new Scanner(System.in); 
			try {
				int inputNum = scanner.nextInt();
				int [] throwBall = new int[3]; 
				if (inputNum < 100 || inputNum > 999 ) {
					throw new MissLengthException("3자리숫자를 입력해주세요.");
				} else {
					throwBall[0] = inputNum / 100;
					throwBall[1] = (inputNum - (throwBall[0] * 100)) / 10 ;
					throwBall[2] = inputNum % 10 ;
				}
				int[] throwResult = Game.throwNums(out, throwBall);
				throwCnt++;
				if(throwResult[Game._STRIKE] == 3) {
					System.out.println("out!! game over");
					System.out.println("총 도전횟수 : " + throwCnt + "회");
					System.out.println("도전횟수를 저장할 이름을 적어주세요");
					String saveName = scanner.next();
					Game.save(saveName, throwCnt);
					Game.printScore(saveName, throwCnt);
					break;
				} else {
					System.out.println(Game.toStrNumber(throwBall) + "\t " + 
										throwResult[Game._BALL] + " ball, " +
							 			throwResult[Game._STRIKE] + " strike");
				}
			} catch (InputMismatchException ime) {
				System.out.println("숫자를 입력해주세요");
				continue;
			} catch (MissLengthException mle) {
				System.out.println(mle.getMessage());
				continue;
			} catch (NotSavedException e) {
				System.out.println(e.getMessage());
				continue;
			} finally {
				System.out.println("도전횟수 >> " + throwCnt + "회");
			}
		}

	}
}
