package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {
	public static void main(String[] args) {
		
		// map 생성
		Map<String, String> map = new HashMap<String, String>();
		
		// map에 값을 넣기  : put ( [key], [value] )
		map.put("kim", "mark");
		map.put("par", "tal");
		map.put("cho", "kil");
		
		System.out.println(map.get("par"));  // <== tal
		
		System.out.println(map.size());  // <== 3
		
		// map에서 key는 중복이 되지 않지만 중복된 키를 넣어주면 새로 넣어준 값은 변경이 된다. 
		map.put("par", "ttar");
		System.out.println(map.get("par"));  // <== tal or ttar ??? ==> ttar
		System.out.println(map.size());   
		
		/// 원시타입 : 8가지 int, short.... => 
		Map<String, Integer> map1 = new HashMap<String, Integer>();
		// int     -> Integer
		// dobuble -> Double
		// byte    -> Byte
		// boolean -> Boolean
		// 원시타입을 대체하는 클래스들을 '래퍼클래스' 라고 한다. (wrapper)
		
		// map에 들어있는 모든 값을 출력하기
		// 1. keySet() 메소드로 모든 키들을 가져온다.
		// 2. 가져온 키들은 타입이 Set 이므로 Iterator를 이용해서 키들을 순환한다. 
		// 3. 꺼낸 키를 이용하여 map에서 값을 꺼내온다.
		System.out.println("---map에서 전체값 가져오기------");
		
		Set<String> keys = map.keySet();
		Iterator<String> iter = keys.iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			System.out.println(map.get(key));
		}
	}
}








