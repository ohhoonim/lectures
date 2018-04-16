package collection.exam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Quest2 {
	public static void main(String[] args) {
		
		List<Map<String, String>> bookList = new ArrayList<Map<String, String>>();
		
		// Map�� key�� �����Ǿ���Ѵ�.
		String[] keys = {"no", "name", "writer", "keyword", "year", "kdc"};
		
		Map<String, String> map1 = new HashMap<String, String>();
		Map<String, String> map2 = new HashMap<String, String>();
		Map<String, String> map3 = new HashMap<String, String>();
		Map<String, String> map4 = new HashMap<String, String>();
		Map<String, String> map5 = new HashMap<String, String>();
		Map<String, String> map6 = new HashMap<String, String>();
		Map<String, String> map7 = new HashMap<String, String>();
		
		// �� ��ġ�� : ctrl + alt + j
		map1.put(keys[0], "CNB000000788"); map1.put(keys[1], "������ ���� õ��"); map1.put(keys[2], "�ų������ [����]"); map1.put(keys[3], ""); map1.put(keys[4], "2000"); map1.put(keys[5], "675"); 
		map2.put(keys[0], "CNB000000954"); map2.put(keys[1], "Andrea Bocelli Sacred Arias"); map2.put(keys[2], "Andrea Bocelli �뷡 ;���Ϲ��� ���� [����]"); map2.put(keys[3], ""); map2.put(keys[4], "1999"); map2.put(keys[5], "673.313"); 
		map3.put(keys[0], "CNB000001031"); map3.put(keys[1], "(�����鼭 �����ϴ�)���丮"); map3.put(keys[2], "�뿵�� �丮"); map3.put(keys[3], ""); map3.put(keys[4], "2001"); map3.put(keys[5], "594.5"); 
		map4.put(keys[0], "CNB000001034"); map4.put(keys[1], "(������ ������)�ڵ��� �������!"); map4.put(keys[2], "������ ����"); map4.put(keys[3], ""); map4.put(keys[4], "2001"); map4.put(keys[5], "556.53"); 
		map5.put(keys[0], "CNB000000870"); map5.put(keys[1], "���߿�"); map5.put(keys[2], "����Ŭ�� J. ������"); map5.put(keys[3], ""); map5.put(keys[4], "1973"); map5.put(keys[5], "688.20942"); 
		map6.put(keys[0], "CNB000000798"); map6.put(keys[1], "�г��� ����BACKDRAFT /"); map6.put(keys[2], "�� �Ͽ��� ����"); map6.put(keys[3], ""); map6.put(keys[4], "2000"); map6.put(keys[5], "688.20942"); 
		map7.put(keys[0], "CNB000005004"); map7.put(keys[1], "�����鼭 .2002 /"); map7.put(keys[2], "������û ��ȹ����� ����.��ȹ"); map7.put(keys[3], "�����鼭 ������"); map7.put(keys[4], "2002"); map7.put(keys[5], "359.1158"); 
		
		bookList.add(map1);
		bookList.add(map2);
		bookList.add(map3);
		bookList.add(map4);
		bookList.add(map5);
		bookList.add(map6);
		bookList.add(map7);
		
		int listSize = bookList.size();
		int keySize = keys.length;
		for (int i = 0; i < listSize; i++) {			
			Map<String, String> book = bookList.get(i);
			
			StringBuffer sb = new StringBuffer();
			for (int keyIndex = 0; keyIndex < keySize; keyIndex++) {
				sb = sb.append(book.get(keys[keyIndex])).append("|");
			}
			System.out.println(sb.toString());
		}
		
		
		
	}
}













