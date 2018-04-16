package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {
	public static void main(String[] args) {
		
		// map ����
		Map<String, String> map = new HashMap<String, String>();
		
		// map�� ���� �ֱ�  : put ( [key], [value] )
		map.put("kim", "mark");
		map.put("par", "tal");
		map.put("cho", "kil");
		
		System.out.println(map.get("par"));  // <== tal
		
		System.out.println(map.size());  // <== 3
		
		// map���� key�� �ߺ��� ���� ������ �ߺ��� Ű�� �־��ָ� ���� �־��� ���� ������ �ȴ�. 
		map.put("par", "ttar");
		System.out.println(map.get("par"));  // <== tal or ttar ??? ==> ttar
		System.out.println(map.size());   
		
		/// ����Ÿ�� : 8���� int, short.... => 
		Map<String, Integer> map1 = new HashMap<String, Integer>();
		// int     -> Integer
		// dobuble -> Double
		// byte    -> Byte
		// boolean -> Boolean
		// ����Ÿ���� ��ü�ϴ� Ŭ�������� '����Ŭ����' ��� �Ѵ�. (wrapper)
		
		// map�� ����ִ� ��� ���� ����ϱ�
		// 1. keySet() �޼ҵ�� ��� Ű���� �����´�.
		// 2. ������ Ű���� Ÿ���� Set �̹Ƿ� Iterator�� �̿��ؼ� Ű���� ��ȯ�Ѵ�. 
		// 3. ���� Ű�� �̿��Ͽ� map���� ���� �����´�.
		System.out.println("---map���� ��ü�� ��������------");
		
		Set<String> keys = map.keySet();
		Iterator<String> iter = keys.iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			System.out.println(map.get(key));
		}
	}
}








