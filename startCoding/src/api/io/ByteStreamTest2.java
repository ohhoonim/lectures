package api.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteStreamTest2 {
	public static void main(String[] args) {
		
		String orgPath = "D:\\Temp\\Temp.zip";
		String targetPath = "D:\\Temp\\Temp(1).zip";
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			System.out.println("파일카피 시작");
			fis = new FileInputStream(orgPath);
			fos = new FileOutputStream(targetPath);
			
			int readData =0;
			byte[] read  = new byte[1024*1024];
			while((readData = fis.read(read)) != -1) {
				fos.write(readData);
			}
			System.out.println("파일카피 종료");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (fis != null) {
					fis.close();
				}
				if (fos != null) {
					fos.close();
				}
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
	}
}









