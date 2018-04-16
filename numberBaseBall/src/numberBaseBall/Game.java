package numberBaseBall;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Game {
	public static int _BALL = 0;
	public static int _STRIKE = 1;
	
	// 각자리가 겹치지않는 랜덤 3자리 숫자
	public static int[] create() {
		int [] result = new int[10];
		//배열 초기화
		for(int i = 0; i < 10; i++) {
			result[i] = i;
		}
		// 자리바꾸기 - 랜덤값은 인덱스로만 활용
		// 3자리만 가져올 것이므로 3번만 실행
		for(int i = 0; i < 3; i++) {
			int ranNum = (int)(Math.random() * (10 - i) );
			int temp = result[ranNum];
			if (i == 2 && temp == 0) { // 첫째자리에 0이 오면 안됨.
				i = 1;
				continue;
			}
			result[ranNum] = result[9 - i];
			result[9 - i] = temp;
		}
		// 자리바꿈한 끝 3자리만 가져옴.
		return Arrays.copyOfRange(result, 7, 10);
	}
	
	// 아웃카운트 계산하기
	// 숫자가 같고 자리도 같으면 : strike
	// 숫자는 같으나 자리가 다르면 : ball
	// index 0 <== ball
	// index 1 <== strike
	public static int[] throwNums(int[] out, int[] throwBall) {
		int[] throwResult = new int[2]; 
		for (int i = 0; i < out.length; i++) {
			for(int j = 0; j < throwBall.length; j++) {
				if (i == j && out[i] == throwBall[j]) {
					throwResult[_STRIKE]++;
				} else if (out[i] == throwBall[j]) {
					throwResult[_BALL]++;
				}
			}
		}
		return throwResult;
	}
	
	public static String toStrNumber(int[] arr) {
		String result = "";
		for(int i = 0; i < arr.length; i++) {
			result = "" + result + "" + arr[i];
		}
		
		return result;
	}

	private static final String savePath = "D:\\dev\\java-workspace\\numberBaseBall\\src\\numberBaseBall\\save.txt";
	public static void save(String name, int count) throws NotSavedException  {
		FileOutputStream fos = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		
		try {
			ScoreVo vo = new ScoreVo();
			vo.setName(name);
			vo.setScore(count);
			
			List<ScoreVo> list = getScoreList();
			list.add(vo);
			
			Collections.sort(list);
			
			fos = new FileOutputStream(savePath);
			osw = new OutputStreamWriter(fos, "utf-8");
			bw = new BufferedWriter(osw);
			
			for(int i = 0; i < list.size() ; i++) {
				ScoreVo scoreVo = list.get(i);
				bw.write(scoreVo.getName() + "=" + scoreVo.getScore());
				bw.newLine();
			}
			
			bw.flush();
		} catch (Exception e) {
			throw new NotSavedException("파일이 저장되지 않았습니다." + e.getMessage());
		} finally {
			if (bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
					throw new NotSavedException("파일이 저장되지 않았습니다2.");
				}
			}
		}		
	}
	
	public static List<ScoreVo> getScoreList() throws NotSavedException  {
		List<ScoreVo> list = new ArrayList<ScoreVo>();

		FileInputStream fis = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		try {
			fis = new FileInputStream(savePath);
			isr = new InputStreamReader(fis, "utf-8");
			br = new BufferedReader(isr); 
			String line = "";
			int rankCnt = 0;
			while ((line = br.readLine()) != null && rankCnt < 10) {
				String[] scoreInfo = line.split("=");
				if ( scoreInfo != null && scoreInfo.length == 2) {
					ScoreVo vo = new ScoreVo();
					vo.setName(scoreInfo[0]);
					vo.setScore(Integer.valueOf(scoreInfo[1]));
					list.add(vo);
					rankCnt++;
				}
			}
			
		} catch (Exception e) {
			throw new NotSavedException("save파일 오류 : " + e.getMessage());
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					throw new NotSavedException("save파일 오류 : " + e.getMessage());
				}
			}
		}
		return list;
	}

	public static void printScore(String saveName, int throwCnt) throws NotSavedException {
		List<ScoreVo> list = getScoreList();
		
		int rank = 1;
		boolean rankFlag = false;
		for(ScoreVo vo : list) {
			if (saveName.equals(vo.getName()) && throwCnt == vo.getScore()) {
				System.out.format("you ==> %2d \t %16s \t %4d \n", rank++, vo.getName(), vo.getScore());
				rankFlag = true;
			} else {
				System.out.format("        %2d \t %16s \t %4d \n", rank++, vo.getName(), vo.getScore());
			}
			
		}
		if (!rankFlag) {
			System.out.format("you ==> xx \t %16s \t %4d \n",  saveName, throwCnt);
		}
		
	}
	

}
