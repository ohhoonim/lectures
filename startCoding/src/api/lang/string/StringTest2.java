package api.lang.string;

public class StringTest2 {
	public static void main(String[] args) {
		// valueOf()
		/* �̷��Դ� ���� ����. 
		if("a" == 'a') {
			System.out.println("����");
		}
		*/
		if("a" == String.valueOf('a')) {
			System.out.println("����");
		} else {
			System.out.println("�����ʴ�");
		}
		
		if ("a" == "a") {
			System.out.println("����");
		} else {
			System.out.println("�����ʴ�");
		}
		
		if (String.valueOf('a') instanceof String) {
			System.out.println("String Ÿ���Դϴ�.");
		} else {
			System.out.println("String Ÿ���� �ƴմϴ�.");
		}
		
		String str1 = "start coding";
		String str2 = new String("start coding");
		
		if (str1 == str2) {
			System.out.println("�����ϴ�.");
		} else {
			System.out.println("�ٸ��ϴ�.");
		}
		
		// equals() 
		if (str1.equals(str2)) {
			System.out.println("�����ϴ�.");
		} else {
			System.out.println("�ٸ��ϴ�.");
		}
		
		// �迭�� ���̴�..
		String[] arrStr = {"start","coding","hello"};
		System.out.println(arrStr.length);
		
		// ���ڿ��� ���̴�..
		String str3 = "start coding";
		System.out.println(str3.length()); // 12
		
		String str4 = "�ڵ��� �����սô�.";
		System.out.println(str4.length()); // 10
		
		// �ڹٿ����� ���ڸ� �����ڵ�� ó���Ѵ�. ��, �����ϳ��ϳ��� �ڵ�
		// ������ ó���ϹǷ� length�� ���Ҷ� ���ٸ� ������ ������ �ʾƵ� �ȴ�.
		// (����) ����� �ַ� utf-8 ������ �����ڵ尡 ���� ���ǰ� �ִ�. 
		//       �������� euc-kr �� ���� ����ߴ�. 
		
		
		
		
	}
}







