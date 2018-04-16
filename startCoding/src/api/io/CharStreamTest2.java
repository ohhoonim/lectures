package api.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CharStreamTest2 {
	public static void main(String[] args) throws Exception {
		
		// ���ڵ� ����� �ٸ� ��� Reader�� �ٷ� �о������
		// ���ڰ� ������ ������ �߻��� �� �ִ�. 
		
		String orgFilePath = "D:\\Temp\\korean_utf8.txt";
		String targetFilePath = "D:\\Temp\\korean_copy.txt";
		
		// 1. InputStream�� �̿��Ͽ� byte ���·� �д´�. 
		// 2. byte���·� ���� stream�� Ư�� ���ڵ��� �����Ͽ� Reader ���·� ��ȯ
		//        ==> InputStreamReader
		// 3. �ʿ��ϴٸ� BufferedReader ������Ʈ�� ���
		
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







