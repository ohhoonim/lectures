package thread.filecopy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FileCopy {
	public static void main(String[] args) throws Exception {
		
		String orgDir    = "D:\\Temp\\";
		String targetDir = "D:\\Temp2\\";

		File orgFolder = new File(orgDir);
		String[] orgFile = orgFolder.list();
		// ������� ó���� �۾��� ����Ʈ�� �����
		List<Callable<String>> fileList = new ArrayList<Callable<String>>();
		for(String file: orgFile) {
			fileList.add(new Copy(orgDir, targetDir, file));			
		}
		// ������ Ǯ ����
		ExecutorService executor = Executors.newFixedThreadPool(
					Runtime.getRuntime().availableProcessors());
		// ������ �ϰ� ȣ��
		List<Future<String>> futureList = executor.invokeAll(fileList);
		
		for (Future future: futureList) {
			System.out.println(future.get());
		}	
		
		executor.shutdown();
	}
	
	/*
	public static void copy (String orgDir, String targetDir, String file) throws Exception {
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
	}
	*/
	
}
