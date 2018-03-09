package collections;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class QuestTest {

	// 위키에 업로드된 '성남시_도서관_도서목록.xls' 데이터를
	// collection 을 이용해서 데이터를 넣고 출력하는
	// 코드를 작성하시오. 
	
	// 힌트 : List<Map<String, String>>
	//        또는 List<Book> 
	//        또는 Map<String, Book>
	//        과 같은 형태로 작성 할 수 있다. 
	//        ==> List<Map<String, String>> 으로 우선 작업한후 
	//             두번째 방법으로도 작성해 볼 것.
	
	@Test
	public void questListMapTest() {
		
		List<Map<String, String>> bookList = new ArrayList<Map<String, String>>();
		
		Map<String, String> row1 = new HashMap<String, String>();
		Map<String, String> row2 = new HashMap<String, String>();
		Map<String, String> row3 = new HashMap<String, String>();
		Map<String, String> row4 = new HashMap<String, String>();
		Map<String, String> row5 = new HashMap<String, String>();
		Map<String, String> row6 = new HashMap<String, String>();
		Map<String, String> row7 = new HashMap<String, String>();
		
		row1.put("등록번호", "CNB000000788"); row1.put("도서명", "내안의 작은 천사"); row1.put("저자", "신나라뮤직 [제작]"); row1.put("키워드", ""); row1.put("발행년도", "2000"); row1.put("KDC분류기호", "675");
		row2.put("등록번호", "CNB000000798"); row2.put("도서명", "분노의 역류BACKDRAFT /"); row2.put("저자", "론 하워드 감독"); row2.put("키워드", ""); row2.put("발행년도", "2000"); row2.put("KDC분류기호", "688.20942");
		row3.put("등록번호", "CNB000000954"); row3.put("도서명", "Andrea Bocelli Sacred Arias"); row3.put("저자", "Andrea Bocelli 노래 ;유니버셜 뮤직 [제작]"); row3.put("키워드", ""); row3.put("발행년도", "1999"); row3.put("KDC분류기호", "673.313");
		row4.put("등록번호", "CNB000001031"); row4.put("도서명", "(들으면서 따라하는)퀵요리"); row4.put("저자", "깅영숙 요리"); row4.put("키워드", ""); row4.put("발행년도", "2001"); row4.put("KDC분류기호", "594.5");
		row5.put("등록번호", "CNB000001034"); row5.put("도서명", "(장형성 교수의)자동차 내맘대로!"); row5.put("저자", "장형성 직강"); row5.put("키워드", ""); row5.put("발행년도", "2001"); row5.put("KDC분류기호", "556.53");
		row6.put("등록번호", "CNB000000870"); row6.put("도서명", "빠삐용"); row6.put("저자", "프랭클린 J. 샤프너"); row6.put("키워드", ""); row6.put("발행년도", "1973"); row6.put("KDC분류기호", "688.20942");
		row7.put("등록번호", "CNB000005004"); row7.put("도서명", "시정백서 .2002 /"); row7.put("저자", "성남시청 기획예산과 편집.기획"); row7.put("키워드", "시정백서 성남시"); row7.put("발행년도", "2002"); row7.put("KDC분류기호", "359.1158");
		
		bookList.add(row1);
		bookList.add(row2);
		bookList.add(row3);
		bookList.add(row4);
		bookList.add(row5);
		bookList.add(row6);
		bookList.add(row7);
		
		
		
		System.out.println("================List<Map<String, String>>");
		System.out.format("%s, %s, %s, %s, %s, %s%n"
				,"등록번호" ,"도서명" ,"저자"
				,"키워드" ,"발행년도" ,"KDC분류기호"
				);
		
		for(Map<String, String> book: bookList) {
			System.out.format("%s, %s, %s, %s, %s, %s%n"
					,book.get("등록번호") ,book.get("도서명") ,book.get("저자")
					,book.get("키워드") ,book.get("발행년도") ,book.get("KDC분류기호")
					);
		}
	}
	
	@Test
	public void questListBookTest() {
		List<Book> bookList = makeBookList();
		
		System.out.println("=============List<Book>");
		for(Book book: bookList) {
			System.out.println(book.toString());
		}
	}
	
	private List<Book> makeBookList() {
		List<Book> bookList = new ArrayList<Book>();
		
		Book book1 = new Book("CNB000000788","내안의 작은 천사","신나라뮤직 [제작]","","2000","675");
		Book book2 = new Book("CNB000000954","Andrea Bocelli Sacred Arias","Andrea Bocelli 노래 ;유니버셜 뮤직 [제작]","","1999","673.313");
		Book book3 = new Book("CNB000001031","(들으면서 따라하는)퀵요리","깅영숙 요리","","2001","594.5");
		Book book4 = new Book("CNB000001034","(장형성 교수의)자동차 내맘대로!","장형성 직강","","2001","556.53");
		Book book5 = new Book("CNB000000870","빠삐용","프랭클린 J. 샤프너","","1973","688.20942");
		Book book6 = new Book("CNB000000798","분노의 역류BACKDRAFT /","론 하워드 감독","","2000","688.20942");
		Book book7 = new Book("CNB000005004","시정백서 .2002 /","성남시청 기획예산과 편집.기획","시정백서 성남시","2002","359.1158");
		
		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);
		bookList.add(book4);
		bookList.add(book5);
		bookList.add(book6);
		bookList.add(book7);
		
		return bookList;
	}
	
	@Test
	public void groupingTest() {
		List<Book> bookList = makeBookList();
		
		/*
		Map<String, List<Book>> groupedBook = new HashMap<String, List<Book>>();
		 */
		Map<String, List<Book>> groupedBook = new TreeMap<String, List<Book>>(new Comparator<String>() {

			@Override
			public int compare(String key1, String key2) {
				return Integer.parseInt(key2) - Integer.parseInt(key1);
			}
			
		});
		for(Book book: bookList) {
			String pubYear = book.get발행년도();
			if (groupedBook.containsKey(pubYear)) {
				List<Book> yearBook = groupedBook.get(pubYear);
				yearBook.add(book);
			} else {
				List<Book> yearBook = new ArrayList<Book>();
				yearBook.add(book);
				groupedBook.put(pubYear, yearBook);
			}
		}
		System.out.println("========== 발행년도별 그룹핑(TreeMap으로 소트)");
		// 출력
		for (Map.Entry<String, List<Book>> yearBook: groupedBook.entrySet()) {
			System.out.println("======== 발행년도 : " + yearBook.getKey() + "년");
			List<Book> yearBookList = yearBook.getValue();
			for (Book book: yearBookList) {
				System.out.println(book.toString());
			}
		}
	}
	
	@Test
	public void mapSortTest() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("2017", "kim");
		map.put("2008", "lee");
		map.put("2012", "park");
		map.put("1993", "choi");
		
		List<String> keyList = new ArrayList<String>();
		Set<String> keys = map.keySet();
		Iterator<String> iter = keys.iterator();
		while(iter.hasNext()) {
			keyList.add(iter.next());
		}
		
		Collections.sort(keyList, new Comparator<String>() {

			@Override
			public int compare(String year1, String year2) {
				
				return Integer.parseInt(year2) - Integer.parseInt(year1);
			}
			
		});
		System.out.println("===========key sort");
		for(String key: keyList) {
			System.out.println(key + " : " + map.get(key));
		}
	}
	
	@Test
	public void groupingLambdaTest() {
		List<Book> bookList = makeBookList();
		Map<String, List<Book>> groupedBook = bookList.stream().collect(
				Collectors.groupingBy(Book::get발행년도, Collectors.toList())
				);
		
		System.out.println("========== 발행년도별 그룹핑 (람다식 버전-소트없음)");
		// 출력
		for (Map.Entry<String, List<Book>> yearBook: groupedBook.entrySet()) {
			System.out.println("======== 발행년도 : " + yearBook.getKey() + "년");
			List<Book> yearBookList = yearBook.getValue();
			for (Book book: yearBookList) {
				System.out.println(book.toString());
			}
		}		
	}
}