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
		assertThat(str.indexOf("t"), is(1)); // ���� ó�� �߰ߵ� ������ �ε����� ������.
		assertThat(str.indexOf("t", 3), is(4)); // 3 index���� �����Ͽ� ó�� �߰ߵ� ������ �ε����� ������.
	}
	
	@Test
	public void changeTypeCharToStringTest() {
		// ���ڿ� "a"�� char�� 'a'�� ���� �ʴ�.
		assertFalse( "a".equals('a'));
		
		// char���� String������ ��ȯ�ϴ� ���
		assertTrue("a".equals('a'+"")); // �ڿ��� ""(emptyp blank)�� �ٿ��ش�.
		assertTrue("a".equals(String.valueOf('a'))); // valueOf() �޼ҵ� ���
		
	}
	
	@Test
	public void equalsTest() {
		String str1 = "start coding";
		String str2 = new String("start coding");
		
		assertThat(str1, is("start coding"));
		assertThat(str2, is("start coding"));
		
		assertFalse(str1 == str2); 
		// ����ִ� ���� ������ ���������� ��ü�� �ٸ��� ������ ���� �ʴٰ� �ν��Ѵ�.
		// ��ü�� ����ִ� ���� ������ ���θ� �˰���� ������ equals() �޼ҵ带 ����Ѵ�. 
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
		assertFalse(str.contains("srt"));  // srt ��� ���ڴ� �����ϰ� ���� �ʴ�. 
	}
	
	@Test
	public void endsWithTest() {
		String fileName = "startCoding.txt";
		assertTrue(fileName.endsWith(".txt"));
	}
	
	@Test
	public void formatTest() {
		String formatedStr = String.format("%4s �� %2s �� %2s ��", "2018", "2", "28");
		assertThat(formatedStr, is("2018 ��  2 �� 28 ��"));
		/*
		 %s : ���ڿ� ġȯ
		 %d : ���� ġȯ
		 
		 %2s <== ���ڿ��� ġȯ�� �� 2�ڸ��� Ȯ����
		 %4d <== ���ڸ� ġȯ�� �� 4�ڸ��� Ȯ����		 
		 */
	}
	
	@Test
	public void isEmptyTest() {
		String str = "";
		assertTrue(str.isEmpty());
		
		if (str.length() == 0) {
			//System.out.println("���ڿ��� ������ϴ�.");
		}
		
		str = null;
//		assertTrue(str.isEmpty());  // <== �̷��Դ� ��������. str ��ü�� null�̹Ƿ� 
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
		
		str = "���ѹα� ��â ����ø���";
		assertThat(str.replace("��â", "���"), is("���ѹα� ��� ����ø���"));
		
		str = "start coding";
		assertThat(str.replaceAll("t", "T")   , is("sTarT coding"));
		assertThat(str.replaceFirst("t",  "T"), is("sTart coding"));
			
		// ���ڿ����� �Ϻ� ������ �ٸ� ���ڷ� ��ġ�ϱ�
		
	}
	
	@Test
	public void substringTest() {
		String str = "start coding";
		           // 0123456789
		assertThat(str.substring(6), is("coding"));
		assertThat(str.substring(3, 8), is("rt co"));  
		// �����ε��� �̻� ���ε��� �̸�
		
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
		// �̷��� ����ϰ� �Ǹ� String ��ü�� 10000��
		// �����ǹǷ� �޸𸮰� ��ȿ�������� �����ȴ�. 
	}
	
	@Test
	public void appendTest() {
		// String str = "start coding";  // <== immutable string
		StringBuffer sb = new StringBuffer("start coding");  // <== mutable string
		
		assertThat(sb.append(" first").toString(), is("start coding first"));
		
		String str = "start coding";
		str += " first"; 
		// ==> "start coding", " first", "start coding first" 3���� ��ü�� �޸𸮿� �����ִ�.		
		// ==> sb.append�� �̿��ϸ� "start coding" ��ü�� "start coding first" �� ����� ���̴�.
		
		// �ڵ��� �� ������ ��.
		// 1. append �Ŀ��� �ݵ�� �ٽ� ������ ������ �־���Ѵ�. 
		sb = sb.append(" test");
		// 2. append �� �� �Ķ���;ȿ��� '+' �����ڸ� ����ϸ� �ȵȴ�. 
		sb = sb.append("test" + "second");  //<== String ������ �� �Ͱ� �����ϰ� �ȴ�.
		// ==> �Ʒ��� ���� �и����ش�. 
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
		assertThat("����" + a + b + c, is("����124"));
		assertThat("����" + (a + b + c), is("����7"));
		assertThat( a + b + "-" +  c + "����", is("3-4����"));
	}

	/** git commit test 2*/ 
}



















