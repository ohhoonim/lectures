package object.beans;

public class DeptVo {
	private String deptNo;  // 부서번호
	private String dName;   // 부서명
	private String loc;     // 부서위치
	
	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}
	public String getDeptNo() {
		return this.deptNo;
	}
	
	public void setDName(String dName) {
		this.dName = dName;
	}
	public String getDName() {
		return this.dName;
	}
	
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public String getLoc() {
		return this.loc;
	}
	
	@Override
	public String toString() {
		String resultStr = "";
		
		resultStr = this.deptNo + "_" + 
					this.dName + "_" + 
				    this.loc;
		
		return resultStr;
	}
	
}






