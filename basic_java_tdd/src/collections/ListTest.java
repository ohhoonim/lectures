package collections;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

import collections.scoreComparator.MathComparator;
import collections.scoreComparator.ScienceComparator;
import collections.scoreComparator.TotalComparator;

public class ListTest {
	
	@Test
	public void addTest() {

		List list = new ArrayList();
		//ArrayList list = new ArrayList();
		list.add(100);
		list.add("start coding"); 
		// Generic을 사용하지 않으면 어떤 타입이든 리스트에 추가하는
		// 것이 가능하다. 
		// 배열에서는 불가능. 

		Object item1 = list.get(0);
		/*
		 <== 100이라는 값이 들어있다. 하지만, 꺼낼때는 
		 Object로만 꺼낼수 있다. 즉, 꺼낸다음 형변환이 필요하다. 
		 */
		//int item1 = list.get(0); // 이렇게는 안된다. 
		//int item1_1 = (int)list.get(0); // 형변환이 필요하다. 
		
		// Generic <== 강력한 타입 체크가 필요
	}
	
	@Test
	public void genericTest() {
		// list에 generic 적용하기
		List<String> list = new ArrayList();
		//list.add(100); // 이렇게는 안된다. generic으로 String만 받기로 했으므로
		list.add("start coding");
		
		// 제네릭은 1.5부터 지원되기 시작했고, 버전업 되면서 문법이 
		// 조금씩 추가되었다. 
		List<String> list1 = new ArrayList<String>(); // 앞뒤 모두 명시하는 형태 : 최초
		List<String> list2 = new ArrayList<>();       // 앞에만 명시하는 형태:<>는 있어야함.
		List<String> list3 = new ArrayList();         // 앞에만 명시하는 형태
		
		// 여기서는 앞뒤 모두 형시하는 형태로 코딩할 예정.
	}
	
	@Test
	public void getTest() {
		List<String> list = new ArrayList<String>();
		
		list.add("start");   // index : 0
		list.add("coding");  // index : 1
		list.add("hello");   // index : 2
		
		// 데이터를 추가하게 되면 add한 순서대로 인덱스가 부여된다. 
		assertThat(list.get(0), is("start"));
		assertThat(list.get(1), is("coding"));
		assertThat(list.get(2), is("hello"));
	}
	
	@Test
	public void listLoopTest1() {
		// for 문
		List<String> list = new ArrayList<String>();
		list.add("start");
		list.add("coding");
		list.add("hello");
		list.add("world");
		
		// case 1
		System.out.println("=========== list loop");
		int listSize = list.size();
		for (int i = 0; i < listSize; i++) {
			// loop 로직
			String item = list.get(i);
			System.out.println(item);
		}
		
		/*
		// case 2
		for (int i = 0; i < list.size(); i++) {
			// loop 로직 
		}
		*/
		// case2와 같이 for문을 사용하면 loop가 돌때마다 size() 계산을
		// 하게되므로 성능 저하의 원인이 될 수 있다. 
	}
	
	@Test
	public void listLoopTest2() {
		List<String> list = new ArrayList<String>();
		list.add("start");
		list.add("coding");
		list.add("hello");
		list.add("world");
		System.out.println("======== loop test 2: foreach");
		for(String item: list) {
			System.out.println(item);
		}
	}
	
	@Test
	public void listSortTest() {
		List<EmpVo> list = new ArrayList<EmpVo>();
		
		EmpVo vo1 = new EmpVo();
		vo1.setEmpNo("1001");
		vo1.setEName("start");
		vo1.setSal(200);
		
		list.add(vo1);
		
		EmpVo vo2 = new EmpVo();
		vo2.setEmpNo("1002");
		vo2.setEName("coding");
		vo2.setSal(400);
		
		list.add(vo2);
		
		EmpVo vo3 = new EmpVo();
		vo3.setEmpNo("1003");
		vo3.setEName("hello");
		vo3.setSal(700);
		
		list.add(vo3);
		System.out.println("====== EMP list");
		
		Collections.sort(list);
		
		for(EmpVo vo: list) {
			System.out.print(vo.getEmpNo() + "\t" );
			System.out.print(vo.getEName() + "\t" );
			System.out.print(vo.getSal());
			System.out.println();
		}
		
	}
	
	@Test
	public void anonymousTest() {
		// 익명 객체 구현..
		List<String> list = new List<String> () {
			
			private String[] arrStr = new String[100];
			private int curIndex = 0;
			
			@Override
			public boolean add(String str) {
				arrStr[curIndex] = str;
				curIndex++;
				
				return true;
			}
			
			@Override
			public String get(int index) {				
				return arrStr[index];
			}
			
			@Override
			public int size() {				
				return arrStr.length;
			}
			
			
			@Override
			public void add(int arg0, String arg1) {
				// TODO Auto-generated method stub
				
			}
			

			@Override
			public boolean addAll(Collection<? extends String> arg0) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean addAll(int arg0, Collection<? extends String> arg1) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void clear() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public boolean contains(Object arg0) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean containsAll(Collection<?> arg0) {
				// TODO Auto-generated method stub
				return false;
			}

			

			@Override
			public int indexOf(Object arg0) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public boolean isEmpty() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Iterator<String> iterator() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int lastIndexOf(Object arg0) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public ListIterator<String> listIterator() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public ListIterator<String> listIterator(int arg0) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean remove(Object arg0) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public String remove(int arg0) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean removeAll(Collection<?> arg0) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean retainAll(Collection<?> arg0) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public String set(int arg0, String arg1) {
				// TODO Auto-generated method stub
				return null;
			}

			

			@Override
			public List<String> subList(int arg0, int arg1) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Object[] toArray() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public <T> T[] toArray(T[] arg0) {
				// TODO Auto-generated method stub
				return null;
			}
		};
		
		
		list.add("start");
		list.add("coding");
		list.add("hello");
		list.add("world");
		
		assertThat(list.get(0), is("start"));
		assertThat(list.get(1), is("coding"));
		assertThat(list.get(2), is("hello"));
		assertThat(list.get(3), is("world"));
		
		
	}
	
	@Test
	public void comparatorTest() {
		
		// Score 정보를 관리하는 클래스(bean)을 하나 만들고
		// ScoreVo 
		// 		studuentName 학생이름
		// 		language     언어점수
		// 		math         수학점수
		//		science      과학점수
		// 리스트에 다수의 데이터를 추가한 후
		// 정렬을 수행한 후 화면에 출력
		// 정렬은 총점 기준.
		
		// 위 문제를 다 해결하신분은 Comparable 인터페이스가아닌
		// Comparator 인터페이스를 이용한 방식으로 변경해보세요.
		
		List<ScoreVo> list = new ArrayList<ScoreVo>();
		
		ScoreVo vo1 = new ScoreVo();
		vo1.setStudentName("kim");
		vo1.setLanguage(34);
		vo1.setMath(23);
		vo1.setScience(76);
		
		list.add(vo1);

		ScoreVo vo2 = new ScoreVo();
		vo2.setStudentName("ahn");
		vo2.setLanguage(65);
		vo2.setMath(34);
		vo2.setScience(98);
		
		list.add(vo2);
		
		ScoreVo vo3 = new ScoreVo();
		vo3.setStudentName("moon");
		vo3.setLanguage(34);
		vo3.setMath(56);
		vo3.setScience(87);
		
		list.add(vo3);
		
		ScoreVo vo4 = new ScoreVo();
		vo4.setStudentName("hong");
		vo4.setLanguage(97);
		vo4.setMath(78);
		vo4.setScience(58);
		
		list.add(vo4);
		/*
		 * jdk 1.7 이하 버전에서는 Collections.sort() 메소드를 써야함.
		Collections.sort(list, new Comparator<ScoreVo>() {

			@Override
			public int compare(ScoreVo vo1, ScoreVo vo2) {
				int vo1Total = vo1.getLanguage() + vo1.getMath() + vo1.getScience();
				int vo2Total = vo2.getLanguage() + vo2.getMath() + vo2.getScience();
				return vo2Total - vo1Total;
			}
		} );
		*/
		// 총점으로 정렬 (익명클래스 사용)
		/*
		list.sort(new Comparator<ScoreVo>() {

			@Override
			public int compare(ScoreVo vo1, ScoreVo vo2) {
				int vo1Total = vo1.getLanguage() + vo1.getMath() + vo1.getScience();
				int vo2Total = vo2.getLanguage() + vo2.getMath() + vo2.getScience();
				return vo2Total - vo1Total;
			}
		})		;
		*/
		// ==> 아래와 같이 쓸수도 있다. 
		// Comparator인터페이스를 구현한 TotalComparator 클래스를 만든다면.
		list.sort(new TotalComparator());
		
		/*
		 	    la  ma  sc   total
		 kim	34	23	76	/172
		 ahn	65	34	98 	/197
		 moon	34	56	87	/177
		 hong	97	78	58	/233
		 */
		System.out.println("========총합 순위");
		for (ScoreVo vo: list) {
			System.out.println(vo.getStudentName());
		}
		
		// math 점수로 정렬 (람다식 사용)
		//list.sort( (v1, v2) ->  v2.getMath() - v1.getMath() );
		
		/*Comparator 타입을 두번째 파라미터로 넘겨줘야함. */
		Collections.sort(list, new MathComparator());
		//Collections.sort(list, new ScienceComparator());
		
		
		System.out.println("========math 순위");
		for (ScoreVo vo: list) {
			System.out.println(vo.getStudentName() + " : " + vo.getMath());
		}
	}
	
}





























