package api.lang.string;

import java.util.Arrays;

public class StringTest4 {
	public static void main(String[] args) {
		// replace() : 일부 문자를 교체할 때
		String str = "start coding";
		System.out.println(str.replace("ar", "tttttt"));
		System.out.println(str.replace("t", "T"));
		System.out.println(str.replaceFirst("t", "T"));
		
		String str1 = "평창 동계올림픽";
		System.out.println(str1.replace("창", "양"));
		
		// split() : 구분자를 이용해서 문자열을 나누고 싶을  때
		String str2 = "start,coding,hello,world";
		
		String[] splitted = str2.split(",");
		
		for(int i = 0; i < splitted.length; i++) {
			System.out.println(splitted[i]);
		}		
		
		String str3 = "start,  coding   , hello,   world   ";
		String[] splitted2 = str3.split(",");
		System.out.println(Arrays.toString(splitted2));
		
		// substring() : 문자열에서 특정 구간만 꺼내올 때 
		String str4 = "start coding";
		System.out.println(str4.substring(3)); // "rt coding"
		System.out.println(str4.substring(2, 6)); // "art "
		// 첫번째 파라미터 이상 두번째 파라미터 미만
		// 가져올 자리수 계산 : 두번째 파라미터 - 첫번째 파라미터
		
		System.out.println(str4.length());
		System.out.println(str4.substring(2, str4.length()));
		
		int beginIndex = StringUtil.findIndexOf(str4, 't', 1) + 1;
		int endIndex = StringUtil.findIndexOf(str4, 't', 2);
		
		System.out.println(str4.substring(beginIndex, endIndex));
		
	}
}






