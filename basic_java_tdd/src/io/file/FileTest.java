package io.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Test;

public class FileTest {
	
	@Test
	public void folderCopyTest() throws Exception{
		
		Path orgin = Paths.get("D:\\temp\\origin\\");
		Path target = Paths.get("D:\\temp\\target\\");
		
	
		Files.list(orgin).forEach(path -> {
			try {
				Path targetFilePath = Paths.get(target.toAbsolutePath().toString() + 
											"\\" + path.getFileName().toString());
				Files.copy(path, targetFilePath);
			} catch (IOException e) {
				
			}
		});
		
	}
}
