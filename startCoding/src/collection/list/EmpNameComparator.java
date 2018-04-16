package collection.list;

import java.util.Comparator;

import api.lang.EmpVo;

public class EmpNameComparator implements Comparator<EmpVo>{

	@Override
	public int compare(EmpVo o1, EmpVo o2) {
		String empName1 = o1.getEmpName();
		String empName2 = o2.getEmpName();
		
		return empName1.compareTo(empName2); 
	}

}
