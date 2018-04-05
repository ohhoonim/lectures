package api.lang.string;

import java.util.Arrays;

public class StringTest4 {
	public static void main(String[] args) {
		// replace() : �Ϻ� ���ڸ� ��ü�� ��
		String str = "start coding";
		System.out.println(str.replace("ar", "tttttt"));
		System.out.println(str.replace("t", "T"));
		System.out.println(str.replaceFirst("t", "T"));
		
		String str1 = "��â ����ø���";
		System.out.println(str1.replace("â", "��"));
		
		// split() : �����ڸ� �̿��ؼ� ���ڿ��� ������ ����  ��
		String str2 = "start,coding,hello,world";
		
		String[] splitted = str2.split(",");
		
		for(int i = 0; i < splitted.length; i++) {
			System.out.println(splitted[i]);
		}		
		
		String str3 = "start,  coding   , hello,   world   ";
		String[] splitted2 = str3.split(",");
		System.out.println(Arrays.toString(splitted2));
		
		// substring() : ���ڿ����� Ư�� ������ ������ �� 
		String str4 = "start coding";
		System.out.println(str4.substring(3)); // "rt coding"
		System.out.println(str4.substring(2, 6)); // "art "
		// ù��° �Ķ���� �̻� �ι�° �Ķ���� �̸�
		// ������ �ڸ��� ��� : �ι�° �Ķ���� - ù��° �Ķ����
		
		System.out.println(str4.length());
		System.out.println(str4.substring(2, str4.length()));
		
		int beginIndex = StringUtil.findIndexOf(str4, 't', 1) + 1;
		int endIndex = StringUtil.findIndexOf(str4, 't', 2);
		
		System.out.println(str4.substring(beginIndex, endIndex));
		
	}
}






