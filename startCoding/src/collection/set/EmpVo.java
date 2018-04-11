package collection.set;

public class EmpVo {
	private String name;
	private int age;
	
	public EmpVo(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public EmpVo() {
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return this.age;
	}
	@Override
	public String toString() {
		return this.name + "|" + this.age;
	}
	
	@Override
	public int hashCode() {
		
		return this.name.hashCode() + this.age;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		
		if (obj instanceof EmpVo) {
			EmpVo empvo = (EmpVo)obj;
			// name 같고, age 같으면 true
			if (this.name.equals(empvo.getName()) && this.age == empvo.getAge()) {
				result = true;
			}
		}
		
		return result;
	}
	
	
	
	
	
	
	
	
	
}
