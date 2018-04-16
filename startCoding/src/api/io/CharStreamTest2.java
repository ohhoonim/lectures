package api.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CharStreamTest2 {
	public static void main(String[] args) throws Exception {
		
		// 인코딩 방식이 다를 경우 Reader로 바로 읽어버리면
		// 문자가 깨지는 현상이 발생할 수 있다. 
		
		String orgFilePath = "D:\\Temp\\korean_utf8.txt";
		String targetFilePath = "D:\\Temp\\korean_copy.txt";
		
		// 1. InputStream을 이용하여 byte 형태로 읽는다. 
		// 2. byte형태로 읽은 stream을 특정 인코딩을 지정하여 Reader 형태로 변환
		//        ==> InputStreamReader
		// 3. 필요하다면 BufferedReader 보조스트림 사용
		
		FileInputStream fis = new FileInputStream(orgFilePath);
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		
		FileOutputStream fos = new FileOutputStream(targetFilePath);
		OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);
		
		String line = "";
		while ( (line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
}







