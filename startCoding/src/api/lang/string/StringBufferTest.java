package api.lang.string;

public class StringBufferTest {
	public static void main(String[] args) {
		// StringBuffer
		// 문자열 조작시('+' 연산)에는 String 클래스보다는
		// StringBuffer 클래스를 사용하는 것을 권장한다.
		String[] arrStr = {"start", "coding", "hello", "world"};
		StringBuffer joinStr = new StringBuffer("");

		int arrStrSize = arrStr.length;
		for (int i = 0; i < arrStrSize; i++) {
			joinStr = joinStr.append(arrStr[i]).append(",");
		}		
		// String 클래스에서 제공해주는 대부분의 메소드들은 StringBuffer클래스에서도 지원해준다.
		String resultStr =  joinStr.substring(0, joinStr.length() - 1);
		
		System.out.println(resultStr);
		
	}
}
