package api.lang;

public class EmpVoTest {
	public static void main(String[] args) {
		
		EmpVo vo = new EmpVo();
		vo.setEmpNo("0001");
		
		System.out.println(vo.getEmpNo());
		
		System.out.println(vo.toString());
	}
}
