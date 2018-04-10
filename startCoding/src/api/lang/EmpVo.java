package api.lang;

public class EmpVo implements Comparable<EmpVo>{
	private String empNo;
	private String empName;
	private int empAge;
	
	@Override
	public int compareTo(EmpVo o) {
		return this.empAge - o.getEmpAge() ;
	}
	
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}
	public String getEmpNo() {
		return this.empNo;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpName() {
		return this.empName;
	}
	
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	public int getEmpAge() {
		return this.empAge;
	}
	@Override
	public String toString() {
		return this.empNo  
				+ "|" + this.empName 
				+ "|" + this.empAge;
	}
	
}





