package game.score;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Score {
	
	private static String scorePath = "D:\\eveningJava\\git\\lectures\\startCoding\\src\\game\\score\\score.txt";
	
	/**
	 * score.txt 파일을 읽어서 콘솔에 출력
	 * "이름=점수" 의 형태로 score 정보가 저장되어있다. 
	 */
	public static void list() {
		
		BufferedReader br = null;
		
		try {
			FileInputStream fis = new FileInputStream(scorePath);
			InputStreamReader isr = new InputStreamReader(fis, "utf-8");
			br = new BufferedReader(isr);
			
			List<ScoreVo> list = new ArrayList<ScoreVo>();
			String line = "";
			while( (line = br.readLine()) != null ) {
				String[] tmp = line.split("=");
				ScoreVo vo = new ScoreVo();
				vo.setName(tmp[0]);
				vo.setScore(Integer.parseInt(tmp[1]));
				list.add(vo);
			}
			Collections.sort(list);
			for (ScoreVo vo: list) {
				System.out.println(vo.toString());
			}
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
	}
	
	public static void add(String name, int score) {
		BufferedWriter bw = null;
		try {
			FileOutputStream fos = new FileOutputStream(scorePath, true);
			OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
			bw = new BufferedWriter(osw);
			
			bw.newLine();
			bw.append(name + "=" + score);
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (bw != null ) {
					bw.close();
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
	}
	
}








