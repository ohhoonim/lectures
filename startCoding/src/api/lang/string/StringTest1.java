package api.lang.string;

public class StringTest1 {
	public static void main(String[] args) {
		// charAt() : �Ķ���ͷ� ���� �ε����� ��ġ�� ���� �ϳ���
		//            ������ �� ���
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
		indexOfA = str3.indexOf('t'); // ó�� �߰ߵ� t�� �ε���
		System.out.println(indexOfA);
		
		System.out.println(str3.indexOf('t', 2));
		
		indexOfA = str3.indexOf('t', str3.indexOf('t') + 1);
		System.out.println(indexOfA);
		
		System.out.println("=========================");
		String str4 = "start coding start coding";
		// 3��°�� ��ġ�� t�� �ε���
		System.out.println(StringUtil.findIndexOf(str4, 't', 3)); // 14
		System.out.println(StringUtil.findIndexOf(str4, 't', 10)); // -1
		// indexOf�޼ҵ带 ������� �� ���� ã�� ���ϸ� ���ϰ��� -1�̴�. 
		
		/*
		 	String str = "���ڿ����� <span>Ư�� ��ġ</span>�� �ִ� ���ڸ� ������";
		  
		  
		 */
		
		
	}
}











