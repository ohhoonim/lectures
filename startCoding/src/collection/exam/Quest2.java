package collection.exam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Quest2 {
	public static void main(String[] args) {
		
		List<Map<String, String>> bookList = new ArrayList<Map<String, String>>();
		
		// Map의 key가 관리되어야한다.
		String[] keys = {"no", "name", "writer", "keyword", "year", "kdc"};
		
		Map<String, String> map1 = new HashMap<String, String>();
		Map<String, String> map2 = new HashMap<String, String>();
		Map<String, String> map3 = new HashMap<String, String>();
		Map<String, String> map4 = new HashMap<String, String>();
		Map<String, String> map5 = new HashMap<String, String>();
		Map<String, String> map6 = new HashMap<String, String>();
		Map<String, String> map7 = new HashMap<String, String>();
		
		// 줄 합치기 : ctrl + alt + j
		map1.put(keys[0], "CNB000000788"); map1.put(keys[1], "내안의 작은 천사"); map1.put(keys[2], "신나라뮤직 [제작]"); map1.put(keys[3], ""); map1.put(keys[4], "2000"); map1.put(keys[5], "675"); 
		map2.put(keys[0], "CNB000000954"); map2.put(keys[1], "Andrea Bocelli Sacred Arias"); map2.put(keys[2], "Andrea Bocelli 노래 ;유니버셜 뮤직 [제작]"); map2.put(keys[3], ""); map2.put(keys[4], "1999"); map2.put(keys[5], "673.313"); 
		map3.put(keys[0], "CNB000001031"); map3.put(keys[1], "(들으면서 따라하는)퀵요리"); map3.put(keys[2], "깅영숙 요리"); map3.put(keys[3], ""); map3.put(keys[4], "2001"); map3.put(keys[5], "594.5"); 
		map4.put(keys[0], "CNB000001034"); map4.put(keys[1], "(장형성 교수의)자동차 내맘대로!"); map4.put(keys[2], "장형성 직강"); map4.put(keys[3], ""); map4.put(keys[4], "2001"); map4.put(keys[5], "556.53"); 
		map5.put(keys[0], "CNB000000870"); map5.put(keys[1], "빠삐용"); map5.put(keys[2], "프랭클린 J. 샤프너"); map5.put(keys[3], ""); map5.put(keys[4], "1973"); map5.put(keys[5], "688.20942"); 
		map6.put(keys[0], "CNB000000798"); map6.put(keys[1], "분노의 역류BACKDRAFT /"); map6.put(keys[2], "론 하워드 감독"); map6.put(keys[3], ""); map6.put(keys[4], "2000"); map6.put(keys[5], "688.20942"); 
		map7.put(keys[0], "CNB000005004"); map7.put(keys[1], "시정백서 .2002 /"); map7.put(keys[2], "성남시청 기획예산과 편집.기획"); map7.put(keys[3], "시정백서 성남시"); map7.put(keys[4], "2002"); map7.put(keys[5], "359.1158"); 
		
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













