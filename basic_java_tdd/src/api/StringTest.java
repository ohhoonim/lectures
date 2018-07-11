package api;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class StringTest {

	@Test
	public void charAtTest() {
		String str = "start coding";
		assertThat(str.charAt(2), is('a'));
	}
	
	@Test
	public void indexOfTest() {
		String str = "start coding";
		assertThat(str.indexOf("a"), is(2));
		assertThat(str.indexOf("t"), is(1)); // 제일 처음 발견된 글자의 인덱스를 가져옴.
		assertThat(str.indexOf("t", 3), is(4)); // 3 index부터 시작하여 처음 발견된 글자의 인덱스를 가져옴.
	}
	
	@Test
	public void changeTypeCharToStringTest() {
		// 문자열 "a"와 char형 'a'는 같지 않다.
		assertFalse( "a".equals('a'));
		
		// char형을 String형으로 변환하는 방법
		assertTrue("a".equals('a'+"")); // 뒤에다 ""(emptyp blank)를 붙여준다.
		assertTrue("a".equals(String.valueOf('a'))); // valueOf() 메소드 사용
		
	}
	
	@Test
	public void equalsTest() {
		String str1 = "start coding";
		String str2 = new String("start coding");
		
		assertThat(str1, is("start coding"));
		assertThat(str2, is("start coding"));
		
		assertFalse(str1 == str2); 
		// 담고있는 값은 동일한 내용이지만 객체가 다르기 때문에 같지 않다고 인식한다.
		// 객체가 담고있는 값만 같은지 여부를 알고싶을 때에는 equals() 메소드를 사용한다. 
		assertTrue(str1.equals(str2));
	}
	
	@Test
	public void concatTest() {
		String str = "start";
		assertThat(str.concat(" coding"), is("start coding"));
		assertThat(str + " coding",       is("start coding"));
	}
	
	@Test
	public void containsTest() {
		String str = "start coding";
		assertTrue(str.contains("start"));
		assertFalse(str.contains("srt"));  // srt 라는 글자는 포함하고 있지 않다. 
	}
	
	@Test
	public void endsWithTest() {
		String fileName = "startCoding.txt";
		assertTrue(fileName.endsWith(".txt"));
	}
	
	@Test
	public void formatTest() {
		String formatedStr = String.format("%4s 년 %2s 월 %2s 일", "2018", "2", "28");
		assertThat(formatedStr, is("2018 년  2 월 28 일"));
		/*
		 %s : 문자열 치환
		 %d : 숫자 치환
		 
		 %2s <== 문자열을 치환할 때 2자리를 확보함
		 %4d <== 숫자를 치환할 때 4자리를 확보함		 
		 */
	}
	
	@Test
	public void isEmptyTest() {
		String str = "";
		assertTrue(str.isEmpty());
		
		if (str.length() == 0) {
			//System.out.println("문자열이 비었습니다.");
		}
		
		str = null;
//		assertTrue(str.isEmpty());  // <== 이렇게는 쓸수없다. str 자체가 null이므로 
	}
	
	@Test
	public void joinTest() {
		String[] arrStr = {"start","coding","hello","world"};
		assertThat(String.join(",", arrStr), is("start,coding,hello,world"));
	}
	
	@Test
	public void toCaseTest() {
		String str = "ABC";
		assertThat(str.toLowerCase(), is("abc"));
		
		str = "abc";
		assertThat(str.toUpperCase(), is("ABC"));
	}
	
	@Test
	public void trimTest() {
		String str = "       start   coding       ";
		assertThat(str.trim(), is("start   coding"));
	}
	
	@Test
	public void replaceTest() {
		String str = "start coding";
		
		String afterReplaced = str.replace("ar", "tt");
		assertThat(afterReplaced, is("stttt coding"));
		assertThat(str,           is("start coding"));
		
		String afterReplaced2 = str.replace("t", "T");
		assertThat(afterReplaced2, is("sTarT coding"));
		
		str = "대한민국 평창 동계올림픽";
		assertThat(str.replace("평창", "평양"), is("대한민국 평양 동계올림픽"));
		
		str = "start coding";
		assertThat(str.replaceAll("t", "T")   , is("sTarT coding"));
		assertThat(str.replaceFirst("t",  "T"), is("sTart coding"));
			
		// 문자열에서 일부 영역을 다른 문자로 대치하기
		
	}
	
	@Test
	public void substringTest() {
		String str = "start coding";
		           // 0123456789
		assertThat(str.substring(6), is("coding"));
		assertThat(str.substring(3, 8), is("rt co"));  
		// 시작인덱스 이상 끝인덱스 미만
		
		assertThat(str.substring(str.indexOf("a")), is("art coding"));
		
	}
	
	@Test
	public void splitTest() {
		String str = "coding start";
		String[] arrStr = str.split(" ");
		
		assertThat(arrStr[0], is("coding"));
		assertThat(arrStr[1], is("start"));
		
		
		str = "coding,start,hello,world";
		String[] arrStr2 = str.split(",");
		
		assertThat(arrStr2[0], is("coding"));
		assertThat(arrStr2[3], is("world"));
	}
	
	@Test
	public void StringAppend() {
		String str = "";
		for (int i = 0; i < 10000; i++) {
			str += i + "\t";
		}
		// 이렇게 사용하게 되면 String 객체가 10000개
		// 생성되므로 메모리가 비효율적으로 관리된다. 
	}
	
	@Test
	public void appendTest() {
		// String str = "start coding";  // <== immutable string
		StringBuffer sb = new StringBuffer("start coding");  // <== mutable string
		
		assertThat(sb.append(" first").toString(), is("start coding first"));
		
		String str = "start coding";
		str += " first"; 
		// ==> "start coding", " first", "start coding first" 3개의 객체가 메모리에 남아있다.		
		// ==> sb.append를 이용하면 "start coding" 자체가 "start coding first" 로 변경된 것이다.
		
		// 코딩할 때 주의할 점.
		// 1. append 후에는 반드시 다시 변수에 저장해 주어야한다. 
		sb = sb.append(" test");
		// 2. append 할 때 파라미터안에서 '+' 연산자를 사용하면 안된다. 
		sb = sb.append("test" + "second");  //<== String 연산을 한 것과 동일하게 된다.
		// ==> 아래와 같이 분리해준다. 
		sb = sb.append("test");
		sb = sb.append("second");
	}
	
	@Test
	public void insertTest() {
		String str = "start coding";
		StringBuffer sb = new StringBuffer(str);
		
		assertThat(sb.insert(3, "TTT").toString(), is("staTTTrt coding"));
		
		
	}
	@Test
	public void sbReplaceTest() {
		String str = "start coding";
		StringBuffer sb = new StringBuffer(str);
		
		assertThat(sb.replace(7, 10, "AAAAAAA").toString(), is("start cAAAAAAAng"));
		
	}
	
	
	@Test
	public void strPlusOperTest() {
		int a = 1;
		int b = 2;
		int c = 4;
		
		assertThat(a + b + c, is(7));
		assertThat("총점" + a + b + c, is("총점124"));
		assertThat("총점" + (a + b + c), is("총점7"));
		assertThat( a + b + "-" +  c + "총점", is("3-4총점"));
	}

	/** git commit test */
}



















