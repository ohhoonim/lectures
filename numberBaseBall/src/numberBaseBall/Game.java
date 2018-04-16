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
	
	// ���ڸ��� ��ġ���ʴ� ���� 3�ڸ� ����
	public static int[] create() {
		int [] result = new int[10];
		//�迭 �ʱ�ȭ
		for(int i = 0; i < 10; i++) {
			result[i] = i;
		}
		// �ڸ��ٲٱ� - �������� �ε����θ� Ȱ��
		// 3�ڸ��� ������ ���̹Ƿ� 3���� ����
		for(int i = 0; i < 3; i++) {
			int ranNum = (int)(Math.random() * (10 - i) );
			int temp = result[ranNum];
			if (i == 2 && temp == 0) { // ù°�ڸ��� 0�� ���� �ȵ�.
				i = 1;
				continue;
			}
			result[ranNum] = result[9 - i];
			result[9 - i] = temp;
		}
		// �ڸ��ٲ��� �� 3�ڸ��� ������.
		return Arrays.copyOfRange(result, 7, 10);
	}
	
	// �ƿ�ī��Ʈ ����ϱ�
	// ���ڰ� ���� �ڸ��� ������ : strike
	// ���ڴ� ������ �ڸ��� �ٸ��� : ball
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
			throw new NotSavedException("������ ������� �ʾҽ��ϴ�." + e.getMessage());
		} finally {
			if (bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
					throw new NotSavedException("������ ������� �ʾҽ��ϴ�2.");
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
			throw new NotSavedException("save���� ���� : " + e.getMessage());
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					throw new NotSavedException("save���� ���� : " + e.getMessage());
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
