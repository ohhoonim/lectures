package api.lang.string;

public class StringBufferTest {
	public static void main(String[] args) {
		// StringBuffer
		// ���ڿ� ���۽�('+' ����)���� String Ŭ�������ٴ�
		// StringBuffer Ŭ������ ����ϴ� ���� �����Ѵ�.
		String[] arrStr = {"start", "coding", "hello", "world"};
		StringBuffer joinStr = new StringBuffer("");

		int arrStrSize = arrStr.length;
		for (int i = 0; i < arrStrSize; i++) {
			joinStr = joinStr.append(arrStr[i]).append(",");
		}		
		
		String resultStr =  joinStr.substring(0, joinStr.length() - 1);
		
		System.out.println(resultStr);
		
	}
}
