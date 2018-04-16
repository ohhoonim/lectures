package api.lang.string;

public class StringTest1 {
	public static void main(String[] args) {
		// charAt() : 파라미터로 받은 인덱스에 위치한 글자 하나를
		//            꺼내올 때 사용
		String str = "start coding";
		char c = str.charAt(5);
		System.out.println("--" + c + "--");

		String str2 = "start co\"ding";
		char c2 = str2.charAt(8);
		System.out.println("--" + c2 + "--");
		
		System.out.println("hello \nworld");
		System.out.println("hello \tworld");
		
		System.out.println("=========================");
		
		// indexOf()
		String str3 = "start coding";
		int indexOfA = str3.indexOf('a');
		System.out.println(indexOfA);
		indexOfA = str3.indexOf('t'); // 처음 발견된 t의 인덱스
		System.out.println(indexOfA);
		
		System.out.println(str3.indexOf('t', 2));
		
		indexOfA = str3.indexOf('t', str3.indexOf('t') + 1);
		System.out.println(indexOfA);
		
		System.out.println("=========================");
		String str4 = "start coding start coding";
		// 3번째에 위치한 t의 인덱스
		System.out.println(StringUtil.findIndexOf(str4, 't', 3)); // 14
		System.out.println(StringUtil.findIndexOf(str4, 't', 10)); // -1
		// indexOf메소드를 사용했을 때 값을 찾지 못하면 리턴값은 -1이다. 
		
		/*
		 	String str = "문자열에서 <span>특정 위치</span>에 있는 문자를 꺼낼때";
		  
		  
		 */
		
		
	}
}











