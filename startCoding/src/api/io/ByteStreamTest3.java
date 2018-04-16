package api.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteStreamTest3 {
	public static void main(String[] args) {
		
		String orgPath = "D:\\Temp\\Temp.zip";
		String targetPath = "D:\\Temp\\Temp(1).zip";
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			System.out.println("카피 시작");
			fis = new FileInputStream(orgPath);
			bis = new BufferedInputStream(fis);

			fos = new FileOutputStream(targetPath);
			bos = new BufferedOutputStream(fos);
			
			int readData = 0;
			while((readData = bis.read()) != -1) {
				bos.write(readData);
			}
			System.out.println("카피 종료");
			
		} catch (Exception e) {
			
		} finally {
			try {
				if (bis != null) {
					bis.close();
				}
				if (bos != null) {
					bos.close();
				}
			} catch (Exception e) {
				
			}
		}
		
	}
}












