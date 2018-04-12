package collection.exam;

import java.util.ArrayList;
import java.util.List;

public class Quest1 {
	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<Book>();
		
		bookList.add(new Book("CNB000000788","내안의 작은 천사","신나라뮤직 [제작]","", 2000,"675"));
		bookList.add(new Book("CNB000000954","Andrea Bocelli Sacred Arias","Andrea Bocelli 노래 ;유니버셜 뮤직 [제작]","", 1999,"673.313"));
		bookList.add(new Book("CNB000001031","(들으면서 따라하는)퀵요리","깅영숙 요리","", 2001,"594.5"));
		bookList.add(new Book("CNB000001034","(장형성 교수의)자동차 내맘대로!","장형성 직강","", 2001,"556.53"));
		bookList.add(new Book("CNB000000870","빠삐용","프랭클린 J. 샤프너","", 1973,"688.20942"));
		bookList.add(new Book("CNB000000798","분노의 역류BACKDRAFT /","론 하워드 감독","", 2000,"688.20942"));
		bookList.add(new Book("CNB000005004","시정백서 .2002 /","성남시청 기획예산과 편집.기획","시정백서 성남시", 2002,"359.1158"));
		
		for(Book book: bookList) {
			System.out.println(book.toString());
		}
		
	}
}
