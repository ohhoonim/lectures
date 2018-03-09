package collections;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


import org.junit.Test;

public class SetTest {
	
	@Test
	public void setTest() {
		Set<String> set = new HashSet<String>();
		
		set.add("start");
		set.add("coding");
		set.add("hello");
		set.add("world");
		
		set.add("start");
		set.add("world");
		
		assertThat(set.size(), is(4));
		// ==> 중복된 값을 허용하지 않으므로 6개를 넣었지만
		// 사이즈는 4개만 출력이 된다. 		
	}
	
	@Test
	public void setTest2() {
		Set<EmpVo> empSet = new HashSet<EmpVo>();
		
		EmpVo vo1 = new EmpVo();
		vo1.setEmpNo("1002");
		vo1.setEName("kim");
		vo1.setSal(2000);

		EmpVo vo2 = new EmpVo();
		vo2.setEmpNo("1003");
		vo2.setEName("ahn");
		vo2.setSal(300);
		
		EmpVo vo3 = new EmpVo();
		vo3.setEmpNo("1004");
		vo3.setEName("moon");
		vo3.setSal(120);
		
		EmpVo vo4 = new EmpVo();  // vo1 과 동일한 값이 들어가 있다. 
		vo4.setEmpNo("1002");
		vo4.setEName("kim");
		vo4.setSal(2000);
		
		empSet.add(vo1);
		empSet.add(vo2);
		empSet.add(vo3);
		empSet.add(vo4);
		
		assertThat(empSet.size(), is(4));
		// vo1과 vo4에 동일한 값들이 들어있음에도 
		// 중복된 것으로 인식하지 않는다. 
		// 이러한 문제를 방지하려면 hashCode(), equals() 메소드를
		// override 해서 중복조건을 코딩해주어야 한다. 
		
	}
	
	@Test
	public void setTest3() {
		// Memeber 클래스에 hashCode(), equals() 메소드를 
		// override하여 중복조건을 코딩하고 그 결과 확인
		Set<Member> memberSet = new HashSet<Member>();
		
		Member member1 = new Member("kim", 33);			
		Member member2 = new Member("kim", 33);
		
		memberSet.add(member1);
		memberSet.add(member2);
		
		assertThat(memberSet.size(), is(1));
		// set에서 동일하다는 것은
		// hashcode가 같고, 
		// equals 메소드가 true인 것을 말한다.
		
	}
	
	@Test
	public void setIteratorTest() {
		Set<Member> memberSet = new HashSet<Member>();
		
		memberSet.add(new Member("kim", 23));
		memberSet.add(new Member("prk", 53));
		memberSet.add(new Member("jon", 13));
		memberSet.add(new Member("hey", 45));
		/*
			memberSet.add(new Member("hey", 45));
		 	<== 아래 코드를 한줄로 표현한 것.		 
			Member mem1 = new Member("hey", 45);
			memberSet.add(mem1);		 
		*/
		// set에 저장된 데이터를 꺼내오려면 iterator가 필요하다.
		Iterator<Member> iter = memberSet.iterator();
		System.out.println("=========set iterator");
		while(iter.hasNext()) {
			Member mem = iter.next();
			System.out.println(mem.getName() + " | " + mem.getAge());
		}
		// => set은 순서가 없으므로 꺼내올때 순서는 랜덤이다. 
	}
	
	
}





























