package api.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;

public class UrlInputStreamTest {
	public static void main(String[] args) {
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			URL url = new URL("http://osen.mt.co.kr/article/G1110881513");
			InputStream is = url.openStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			br = new BufferedReader(isr);
			
			FileOutputStream fos = new FileOutputStream("D:\\Temp\\main1.html");
			OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
			bw = new BufferedWriter(osw);
						
			String line = "";
			while((line = br.readLine()) != null) {
				bw.write(line);
				bw.newLine();
			}
			
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










