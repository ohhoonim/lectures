package collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import api.lang.EmpVo;

public class ListTest {
	public static void main(String[] args) {
		// 리스트 생성
		List list = new ArrayList();
		
		// list에 값 추가하기
		// add한 순서대로 인덱스가 부여된다. 
		list.add(1);  // index : 0
		list.add("start coding");  // index : 1
		
		// list에서 값 꺼내오기
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
		int num1 = (int)list.get(0);
		String str1 = (String)list.get(1);
		
		// jdk 1.5버전부터 제네릭이라는 문법을 통해 리스트에서 관리할
		// 타입을 강제할 수 있게 되었다. 
		List<String> list2 = new ArrayList<String>();
		
		list2.add("start");
		list2.add("coding");
		list2.add("hello");
		list2.add("world");
		list2.add("test");
		
		int listSize = list2.size();
		for (int i = 0; i < listSize; i++) {
			System.out.println(list2.get(i));
		}
		
		// foreach 문, 향상된 for문.
		for (String item : list2) {
			System.out.println(item);
		}
		
		List<String> subList = new ArrayList<String>();
		subList.add("test1");
		subList.add("test2");
		subList.add("test3");
		System.out.println("==================");
		list2.addAll(subList);
		for (String item : list2) {
			System.out.println(item);
		}
		///////////////////////////////
		// 배열을 이미 존재하는 리스트에 추가하고 싶을때
		String[] arrStr = {"korea","japan","china","german"};
		
		// List -> 배열
		Object[] arrList2 = list2.toArray();
		//String[] arrList22 = (String[])list2.toArray();		
		String[] arrList222 = list2.toArray(new String[list2.size()]); 
		// 배열을 생성할 때는 그 길이를 알아야 하므로.
		
		// 배열 -> List 
		List<String> arrToList = Arrays.asList(arrStr);
		// Arrays.asList로 변환된 List는 그 길이가 고정이므로 데이터를 추가하고자 할 때에는
		// ArrayList 와 같은 List구현 클래스를 이용하여 한번더 감싸주어야 한다. 
		ArrayList<String> arrayList = new ArrayList<String>(arrToList);
		
		///////////////////////////
		List<String> toList = new ArrayList<String>();
		int arrStrLength = arrStr.length;
		for (int i = 0; i < arrStrLength; i++) {
			toList.add(arrStr[i]);
		}
		
		/////////////////////////////
		List<EmpVo> empList = new ArrayList<EmpVo>();
		
		EmpVo emp1 = new EmpVo();
		emp1.setEmpNo("1001");
		emp1.setEmpName("kim");
		emp1.setEmpAge(21);
		
		empList.add(emp1);
		
		EmpVo emp2 = new EmpVo();
		emp2.setEmpNo("2001");
		emp2.setEmpName("choi");
		emp2.setEmpAge(32);
		
		empList.add(emp2);
		
		EmpVo emp3 = new EmpVo();
		emp3.setEmpNo("3001");
		emp3.setEmpName("park");
		emp3.setEmpAge(27);
		
		empList.add(emp3);
		
		System.out.println("=====empList=========");
		for(EmpVo emp: empList) {
			System.out.println(emp.toString());
		}
		
		// 리스트에서 emp를 꺼내고  나이를 변경
		
		
		// 나이순으로 소트하기
		
		
		// 이름 순으로 소트하기
		
		
	}
}
