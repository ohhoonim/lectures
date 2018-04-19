package api.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileTest {
	public static void main(String[] args) throws Exception {
		String dirPath = "D:\\Temp\\";
		String distPath = "D:\\Temp2\\";
		File dir  = new File(dirPath);
		String[] files = dir.list();
		
		for (String path: files) {
			System.out.println(dirPath + path);
			File file = new File(dirPath + path);
			if(file.isFile()) {
				System.out.println("file¿‘¥œ¥Ÿ.");
				FileInputStream fis = new FileInputStream(file);
				BufferedInputStream bis = new BufferedInputStream(fis);
				
				FileOutputStream fos = new FileOutputStream(distPath + path);
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				
				int readData = 0;
				while((readData = bis.read()) != -1) {
					bos.write(readData);
				}
				
				bis.close();
				bos.close();
			}
		}
		
	}
}
