package collection.exam;

import java.util.ArrayList;
import java.util.List;

public class Quest1 {
	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<Book>();
		
		bookList.add(new Book("CNB000000788","������ ���� õ��","�ų������ [����]","", 2000,"675"));
		bookList.add(new Book("CNB000000954","Andrea Bocelli Sacred Arias","Andrea Bocelli �뷡 ;���Ϲ��� ���� [����]","", 1999,"673.313"));
		bookList.add(new Book("CNB000001031","(�����鼭 �����ϴ�)���丮","�뿵�� �丮","", 2001,"594.5"));
		bookList.add(new Book("CNB000001034","(������ ������)�ڵ��� �������!","������ ����","", 2001,"556.53"));
		bookList.add(new Book("CNB000000870","���߿�","����Ŭ�� J. ������","", 1973,"688.20942"));
		bookList.add(new Book("CNB000000798","�г��� ����BACKDRAFT /","�� �Ͽ��� ����","", 2000,"688.20942"));
		bookList.add(new Book("CNB000005004","�����鼭 .2002 /","������û ��ȹ����� ����.��ȹ","�����鼭 ������", 2002,"359.1158"));
		
		for(Book book: bookList) {
			System.out.println(book.toString());
		}
		
	}
}
