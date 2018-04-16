package collection.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		// set에 데이터 추가하기 : add() 메소드 사용
		set.add("start");
		set.add("coding");
		set.add("hello");
		
		// set에서는 특정값을 콕 집어 꺼내는 메소드가 존재하지 않는다.
		
		// size()
		System.out.println(set.size()); // ==> 3
		
		// set은 중복을 허용하지 않는다. 
		set.add("hello");
		System.out.println(set.size()); 
		// ==> 4번을 입력했지만 "hello"가 겹치므로 size는 3이다. 
		
		Set<EmpVo> empSet = new HashSet<EmpVo>();
		
		EmpVo emp1 = new EmpVo();
		emp1.setName("kim");
		emp1.setAge(22);
		
		empSet.add(emp1);
		
		EmpVo emp2 = new EmpVo();
		emp2.setName("park");
		emp2.setAge(31);
		
		empSet.add(emp2);

		EmpVo emp3 = new EmpVo();
		emp3.setName("choi");
		emp3.setAge(27);
		
		empSet.add(emp3);
		
		EmpVo emp4 = new EmpVo();
		emp4.setName("kim");
		emp4.setAge(22);
		
		empSet.add(emp4);
		
		System.out.println("empSet size: " + empSet.size());
		
		// set은 특정 데이터만 꺼내는 기능이 없으므로
		// iterator() 메소드를 이용하여 집합의 값들을 순환해서 가져와야 한다. 
		
		Iterator<EmpVo> iter = empSet.iterator();
		System.out.println("======iterator를 이용하여 꺼내기");
		while (iter.hasNext()) {
			EmpVo empvo = iter.next();
			System.out.println(empvo.getName() + " | "
							+ empvo.getAge());
		}
		
		System.out.println(empSet.contains(emp1));
		
		// set을 배열로 만들기
		EmpVo[] arrEmp = empSet.toArray(new EmpVo[empSet.size()]);
		
		System.out.println(Arrays.toString(arrEmp));
	}
}





















