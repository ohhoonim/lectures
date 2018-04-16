package collection.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		// set�� ������ �߰��ϱ� : add() �޼ҵ� ���
		set.add("start");
		set.add("coding");
		set.add("hello");
		
		// set������ Ư������ �� ���� ������ �޼ҵ尡 �������� �ʴ´�.
		
		// size()
		System.out.println(set.size()); // ==> 3
		
		// set�� �ߺ��� ������� �ʴ´�. 
		set.add("hello");
		System.out.println(set.size()); 
		// ==> 4���� �Է������� "hello"�� ��ġ�Ƿ� size�� 3�̴�. 
		
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
		
		// set�� Ư�� �����͸� ������ ����� �����Ƿ�
		// iterator() �޼ҵ带 �̿��Ͽ� ������ ������ ��ȯ�ؼ� �����;� �Ѵ�. 
		
		Iterator<EmpVo> iter = empSet.iterator();
		System.out.println("======iterator�� �̿��Ͽ� ������");
		while (iter.hasNext()) {
			EmpVo empvo = iter.next();
			System.out.println(empvo.getName() + " | "
							+ empvo.getAge());
		}
		
		System.out.println(empSet.contains(emp1));
		
		// set�� �迭�� �����
		EmpVo[] arrEmp = empSet.toArray(new EmpVo[empSet.size()]);
		
		System.out.println(Arrays.toString(arrEmp));
	}
}





















