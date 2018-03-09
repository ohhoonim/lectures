package api;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import static org.hamcrest.CoreMatchers.*;

import org.junit.Ignore;
import org.junit.Test;

public class LangPackageTest {
	
	@Test
	public void mathClassTest() {
		System.out.println("랜덤값 : " + Math.random()); // 0 ~ 1
		// 0.3423423423, 0.236235
		for(int i = 0; i < 20; i++) {
			System.out.println( (int)(Math.random() * 6) + 1 ); // 주사위숫자 1~6
		}
	}
	
	@Test
	public void classClassTest() {
		assertThat(this.getClass().getName(), is("api.LangPackageTest"));
	}
	
	
	
	@Ignore
	@Test
	public void systemClassTest() {
		// 시스템 정보 출력하기
		Map<String, String> env = System.getenv();
		Set<String> keys = env.keySet();
		Iterator<String> iter = keys.iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			System.out.println(key + " : " + env.get(key));
		}
		System.out.println();
		System.out.println(System.getProperties());
		
		System.out.println(System.nanoTime());          // 현재 시각을 나노초까지 표시
		System.out.println(System.currentTimeMillis()); // 현재 시각을 밀리세컨드까지 표시 
		
		/*
		System.out.println("start coding");
		
		Scanner scanner = new Scanner(System.in);
		String inputStr = scanner.next();
		System.out.println("콘솔에 입력한 값: " + inputStr);
		*/
	}

}
