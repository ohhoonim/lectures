package collection.set;

import java.util.HashSet;
import java.util.Set;

public class SetTest2 {
	public static void main(String[] args) {
		
		Set<EmpVo> empSet = new HashSet<EmpVo>();
		EmpVo emp1 = new EmpVo("kim", 22);
		empSet.add(emp1);
		empSet.add(new EmpVo("choi", 41));
		empSet.add(new EmpVo("park", 28));
		empSet.add(new EmpVo("moon", 62));

		EmpVo emp2 = new EmpVo("kim", 22);
		empSet.add(emp2);
		
		System.out.println(empSet.size()); // <- 5
		
		System.out.println("emp1 hashcode : " + emp1.hashCode());
		System.out.println("emp2 hashcode : " + emp2.hashCode());
		System.out.println("emp1.equals(emp2) : " + emp1.equals(emp2));
		
		// java에서의 중복의 기준은?
		// 1. hashCode 값이 같아야한다. 
		// 2. equals의 결과가 true이어야 한다. 
		
		// String 의 예
		
		String str1 = "start";
//		String str2 = "start";
		String str2 = new String("start");
		
		System.out.println("str1 hashcode : " + str1.hashCode());
		System.out.println("str2 hashcode : " + str2.hashCode());
		System.out.println("str1.equals(str2) : " + str1.equals(str2));
		
//		System.out.println(str1 == str2);
		

		
		
		
		
		
	}
}





