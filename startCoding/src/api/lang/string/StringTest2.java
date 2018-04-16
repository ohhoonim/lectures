package api.lang.string;

public class StringTest2 {
	public static void main(String[] args) {
		// valueOf()
		/* 이렇게는 쓸수 없다. 
		if("a" == 'a') {
			System.out.println("같다");
		}
		*/
		if("a" == String.valueOf('a')) {
			System.out.println("같다");
		} else {
			System.out.println("같지않다");
		}
		
		if ("a" == "a") {
			System.out.println("같다");
		} else {
			System.out.println("같지않다");
		}
		
		if (String.valueOf('a') instanceof String) {
			System.out.println("String 타입입니다.");
		} else {
			System.out.println("String 타입이 아닙니다.");
		}
		
		String str1 = "start coding";
		String str2 = new String("start coding");
		
		if (str1 == str2) {
			System.out.println("같습니다.");
		} else {
			System.out.println("다릅니다.");
		}
		
		// equals() 
		if (str1.equals(str2)) {
			System.out.println("같습니다.");
		} else {
			System.out.println("다릅니다.");
		}
		
		// 배열의 길이는..
		String[] arrStr = {"start","coding","hello"};
		System.out.println(arrStr.length);
		
		// 문자열의 길이는..
		String str3 = "start coding";
		System.out.println(str3.length()); // 12
		
		String str4 = "코딩을 시작합시다.";
		System.out.println(str4.length()); // 10
		
		// 자바에서는 문자를 유니코드로 처리한다. 즉, 문자하나하나의 코드
		// 단위로 처리하므로 length를 구할때 별다른 조작을 해주지 않아도 된다.
		// (참고) 현재는 주로 utf-8 형식의 유니코드가 많이 사용되고 있다. 
		//       예전에는 euc-kr 을 많이 사용했다. 
		
		
		
		
	}
}







