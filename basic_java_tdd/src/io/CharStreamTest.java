package io;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;

import org.junit.Ignore;
import org.junit.Test;

public class CharStreamTest {
	String orgFilePath = "D:\\temp\\korean.txt";
	String targetFilePath = "D:\\temp\\korean_copy.txt";
	
	@Ignore
	@Test
	public void encodingTest() {
		
		FileInputStream fr = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		FileOutputStream fw = null;
		OutputStreamWriter osr = null;
		BufferedWriter bw = null;
		
		try {
			//1. 파일을 읽어온다.
			fr = new FileInputStream(orgFilePath);
			isr = new InputStreamReader(fr, "utf-8");
			br = new BufferedReader(isr);
			
			//1-1. 파일을 쓸 writer 객체를 만들어 준다.
			fw = new FileOutputStream(targetFilePath);
			osr = new OutputStreamWriter(fw, "utf-8");
			bw = new BufferedWriter(osr);
			
			String line = "";
			//2. 파일을 한줄 씩 읽어온다.
			while ((line = br.readLine()) != null) {
				//2-1. 한 줄 씩 읽을 텍스트를 writer를 이용해 파일에 쓴다. 			
				bw.write(line); // <== 줄바꿈이 되지 않는다. 
				bw.newLine();
			}
			
			bw.flush();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			//3. reader/writer를 close 한다 
			try {
				if (br != null ) {
					br.close();
				}
				if (bw != null) {
					bw.close();
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		
	}
	
	
	@Ignore
	@Test
	public void textFileCopyTest() {
		
		FileReader fr = null;
		BufferedReader br = null;
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			//1. 파일을 읽어온다.
			fr = new FileReader(orgFilePath);
			br = new BufferedReader(fr);
			
			//1-1. 파일을 쓸 writer 객체를 만들어 준다.
			fw = new FileWriter(targetFilePath);
			bw = new BufferedWriter(fw);
			
			String line = "";
			//2. 파일을 한줄 씩 읽어온다.
			while ((line = br.readLine()) != null) {
				//2-1. 한 줄 씩 읽을 텍스트를 writer를 이용해 파일에 쓴다. 			
				bw.write(line); // <== 줄바꿈이 되지 않는다. 
				bw.newLine();
			}
			
			bw.flush();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			//3. reader/writer를 close 한다 
			try {
				if (br != null ) {
					br.close();
				}
				if (bw != null) {
					bw.close();
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	@Test
	public void urlInputStreamTest() {
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			
			URL url = new URL("http://ohhoonim.blogspot.kr");
			InputStream is = url.openStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			br = new BufferedReader(isr);
			
			FileOutputStream fos = new FileOutputStream("D:\\temp\\naver_main.html");
			OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
			bw = new BufferedWriter(osw);
			
			String line = "";
			while((line = br.readLine()) != null) {
				bw.write(line);
				bw.newLine();
			}
			
			bw.flush();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (br != null) {
					br.close();
				}
				if (bw != null) {
					bw.close();
				}
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
