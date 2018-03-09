package io;

import static org.junit.Assert.*;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import static org.hamcrest.CoreMatchers.*;

import org.junit.Ignore;
import org.junit.Test;

public class ByteStreamTest {

	
	@Ignore
	@Test
	public void inputStreamTest() {
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(orgPath);
			
			int readData = 0;
			while((readData = fis.read()) != -1 ) {
				System.out.println(readData);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (fis != null) {
					fis.close();
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	String orgPath = "D:\\temp\\Downloads.zip";
	String targetPath = "D:\\temp\\Downloads_copy.zip";
	
	@Test
	public void outputStreamTest() {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			long start = System.nanoTime();
			fis = new FileInputStream(orgPath);
			fos = new FileOutputStream(targetPath);
			
			int readData = 0;
			while((readData = fis.read()) != -1 ) {
				fos.write(readData);
			}
			long end = System.nanoTime();
			System.out.println("=====보조스트림 미사용시");
			System.out.println("총소요시간: " + (end - start));
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (fis != null) {
					fis.close();
				}
				if (fos != null) {
					fos.close();
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	@Test
	public void fileCopyTest() {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;	
		
		try {
			long start = System.nanoTime();
			fis = new FileInputStream(orgPath);
			bis = new BufferedInputStream(fis);
			
			fos = new FileOutputStream(targetPath+".zip");
			bos = new BufferedOutputStream(fos);				
			
			int readData = 0;
			while((readData = bis.read()) != -1 ) {
				bos.write(readData);
			}
			long end = System.nanoTime();
			System.out.println("=====보조스트림 Buffered 사용시");
			System.out.println("총소요시간: " + (end - start));
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (bis != null) {
					bis.close();
				}
				if (bos != null) {
					bos.close();
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}





















