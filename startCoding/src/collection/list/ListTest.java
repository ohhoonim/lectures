package collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import api.lang.EmpVo;

public class ListTest {
	public static void main(String[] args) {
		// ����Ʈ ����
		List list = new ArrayList();
		
		// list�� �� �߰��ϱ�
		// add�� ������� �ε����� �ο��ȴ�. 
		list.add(1);  // index : 0
		list.add("start coding");  // index : 1
		
		// list���� �� ��������
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
		int num1 = (int)list.get(0);
		String str1 = (String)list.get(1);
		
		// jdk 1.5�������� ���׸��̶�� ������ ���� ����Ʈ���� ������
		// Ÿ���� ������ �� �ְ� �Ǿ���. 
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
		
		// foreach ��, ���� for��.
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
		// �迭�� �̹� �����ϴ� ����Ʈ�� �߰��ϰ� ������
		String[] arrStr = {"korea","japan","china","german"};
		
		// List -> �迭
		Object[] arrList2 = list2.toArray();
		//String[] arrList22 = (String[])list2.toArray();		
		String[] arrList222 = list2.toArray(new String[list2.size()]); 
		// �迭�� ������ ���� �� ���̸� �˾ƾ� �ϹǷ�.
		
		// �迭 -> List 
		List<String> arrToList = Arrays.asList(arrStr);
		// Arrays.asList�� ��ȯ�� List�� �� ���̰� �����̹Ƿ� �����͸� �߰��ϰ��� �� ������
		// ArrayList �� ���� List���� Ŭ������ �̿��Ͽ� �ѹ��� �����־�� �Ѵ�. 
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
		
		// ����Ʈ���� emp�� ������  ���̸� ����
		
		
		// ���̼����� ��Ʈ�ϱ�
		
		
		// �̸� ������ ��Ʈ�ϱ�
		
		
	}
}
