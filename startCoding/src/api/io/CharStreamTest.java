package api.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class CharStreamTest {
	public static void main(String[] args) {
		
//		String orgFilePath = "D:\\Temp\\korean.txt";
		String orgFilePath = "D:\\Temp\\korean_utf8.txt";
		String targetFilePath = "D:\\Temp\\korean_copy.txt";
		
		FileReader fr = null;
		BufferedReader br = null;
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fr = new FileReader(orgFilePath);
			br = new BufferedReader(fr);
			
			fw = new FileWriter(targetFilePath);
			bw = new BufferedWriter(fw);
			
			String line = "";
			while( (line = br.readLine()) != null) {
				bw.write(line);
				bw.newLine();				
			}
			
		} catch(Exception e) {
			
		} finally {
			try {
				if (br != null ) {
					br.close();
				}
				if (br != null) {
					bw.close();
				}
			} catch(Exception e) {
				
			}
		}
		
	}
}
