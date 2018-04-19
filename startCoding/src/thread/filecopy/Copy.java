package thread.filecopy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.concurrent.Callable;

public class Copy implements Callable<String>{

	private String orgDir;
	private String targetDir;
	private String file;
	
	public Copy(String orgDir, String targetDir, String file) {
		this.orgDir = orgDir;
		this.targetDir = targetDir;
		this.file = file;
	}
	
	@Override
	public String call() throws Exception {
		FileInputStream fis = new FileInputStream(orgDir + file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		FileOutputStream fos = new FileOutputStream(targetDir + file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int readData = 0;
		while((readData = bis.read()) != -1) {
			bos.write(readData);
		}
		
		bis.close();
		bos.close();
		
		return file + " 파일의 복사가 종료되었습니다.";
	}

}
