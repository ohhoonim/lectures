package collections;

public class EmpVo implements Comparable<EmpVo>{
	
	@Override
	public int compareTo(EmpVo otherVo) {
		return otherVo.getSal() - this.sal;
	}
	
	private String empNo;
	private String eName;
	private int sal;
	
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}
	public String getEmpNo() {
		return this.empNo;
	}
	
	public void setEName(String eName) {
		this.eName = eName;
	}
	public String getEName() {
		return this.eName;
	}
	
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getSal() {
		return this.sal;
	}
	
	
	
}
