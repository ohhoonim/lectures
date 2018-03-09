package collections;

public class Member {
	private String name;
	private int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
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
	public int hashCode() {
		// 일반적으로 자바에서는 hashCode를 메모리주소를
		// 이용해서 생성하나 여기서는 override를 통해
		// 객체가 가지고 있는 데이터를 기반으로
		// hashcode를 생성하고 있다. 
		// 즉, 가지고 있는 값이 같으면 hashcode가 같게끔
		// 커스터마이징 한 것이다. 
		return this.name.hashCode() + age;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean isEquals = false;
		if (obj instanceof Member) {
			Member member = (Member) obj;
			isEquals =  member.getName().equals(name)
						  && member.getAge() == age;
		} 
		return isEquals;   
	}
}




















