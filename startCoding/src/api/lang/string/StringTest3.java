package api.lang.string;

public class StringTest3 {
	public static void main(String[] args) {
		// concat() : 문자열을 합칠 때
		// String	concat​(String str)	
		String str1 = "start coding";
		String str1Result = str1.concat(" hello ");
		System.out.println(str1Result);
		
		String str2 = " hello world";
		String str3 = " korea";
		str1.concat(str2).concat(str3); 
		// ==> str1 + str2 + str3 
		
		// contains() : 문자(열)이 포함되어있는지 검사할 때
		// boolean	contains​(CharSequence s)
		String str4 = "start coding";
		boolean containsResult = str4.contains("start");
		System.out.println(containsResult);
		
		// endsWith() : 끝나는 문자열을 검사할 때
		// boolean	endsWith​(String suffix)
		String str5 = "jdk-1.1.2.txt";
		System.out.println(str5.endsWith(".txt"));
		if (str5.endsWith(".txt")) {
			System.out.println("텍스트 파일입니다.");
		}
		
		//////// String.valueOf(    );
		String resultStr1 = String.valueOf(str5.endsWith(".txt"));
		System.out.println(resultStr1);
		
		// format()
		String formattedStr = String.format("%4s년 %2s월 %2s일", "2017", "07", "29");
		System.out.println(formattedStr);
		System.out.println(String.format("%4s년 %2s월 %2s일", "109", "7", "3"));
		System.out.println(String.format("%4d년 %2d월 %2d일", 109, 7, 3));
		
		/*
		 	%s : 문자열 치환
		 	%d : 숫자 치환
		 	
		 	%2s : 문자열을 치환할 때 2자리를 확보함.
		 	%3d : 숫자를 치환할 때 3자리를 확보함.
		 */
		
		// isEmpty() : 문자열의 길이가 0인지를 검사
		String str6 = "";  // <== null 이 아님, 문자열 길이가 0인상태를 의미<== empty blank
		boolean lengthResult = str6.isEmpty();
		if (lengthResult) {
			System.out.println("문자열 길이가 0입니다.");
		}
		if (str6.length() == 0) {
			System.out.println("문자열 길이가 0입니다.");
		}
		
		// join()
		String[] arrStr = {"start", "coding", "hello", "world"};
		String a1 = arrStr[0].concat(arrStr[1]).concat(arrStr[2]).concat(arrStr[3]);
		System.out.println(a1);
		
		String a2 = String.join(",", arrStr);
		System.out.println(a2);
		
		String joinStr = "";
		int arrStrSize = arrStr.length;
		for (int i = 0; i < arrStrSize; i++) {
			if ( i == arrStrSize - 1) {
				joinStr += arrStr[i];
			} else {
				joinStr += arrStr[i] + ",";
			}
		}		
		System.out.println(joinStr);
		
		joinStr = "";
		for (int i = 0; i < arrStrSize; i++ ) {
			if ( i == arrStrSize - 1) {
				joinStr = joinStr.concat(arrStr[i]);
			} else {
				joinStr = joinStr.concat(arrStr[i]).concat(",");
			}			
		}
				
		// toLowerCase() : 소문자로
		String str7 = "TEXT";
		System.out.println(str7.toLowerCase()); // ==> text
		System.out.println("TEXT".toLowerCase());
		
		// toUpperCase() : 대문자로
		String str8 = "text";
		System.out.println(str8.toUpperCase()); // ==> TEXT
		
		// trim() : 공백제거
		String str9  = "   text"; // 왼쪽 공백
		String str10 = "text   "; // 오른쪽 공백
		String str11 = "  text "; // 양쪽 공백
		String str12 = " te xt "; // 가운데 공백
		
		System.out.println("W" + str9.trim()  + "W");
		System.out.println("W" + str10.trim() + "W");
		System.out.println("W" + str11.trim() + "W");
		System.out.println("W" + str12.trim() + "W");
		
		
	}
}
