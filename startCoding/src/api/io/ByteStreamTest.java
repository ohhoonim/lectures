package api.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteStreamTest {
	public static void main(String[] args) {
		
		String filePath = "D:\\Temp\\test.jpg";
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(filePath);
			int readData = 0;
			while((readData = fis.read()) != -1 ) {
				System.out.println(readData);
			}
			
		} catch(FileNotFoundException fnf) { 
			System.out.println(fnf.getMessage());
		} catch(IOException ioe) { 
			System.out.println(ioe.getMessage());
		} finally {
			try {
				if (fis != null) {
					fis.close();
				}
			} catch (IOException ioe) {
				System.out.println(ioe.getMessage());
			}
		}
		
	}
}
