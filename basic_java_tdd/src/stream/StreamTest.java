package stream;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;

import org.junit.Before;
import org.junit.Test;

public class StreamTest {

	List<Widget> list;
	
	@Before
	public void setUp() {
		list = Arrays.asList(
				new Widget("red",  20), new Widget("red",   34),
				new Widget("blue", 45), new Widget("sky",   76),
				new Widget("red",  34), new Widget("red",   10),
				new Widget("pink", 33), new Widget("red",   12),
				new Widget("red",  68), new Widget("green", 94)
				);
		// sum ==> red:178, blue:45, pink:33, green:94
	}
	
	@Test
	public void streamTest() {
		int resultSum = list.stream()
				.filter( w -> w.getColor().equals("red") )
				.mapToInt( w -> w.getWeight())
				.sum();
		
		assertThat(resultSum, is(178));
	}
	
	@Test
	public void collectionTest() {
		//////////////////////////////// raw 데이터<== 수집 
		
		// filter    <== 정제
		List<Widget> filteredList = new ArrayList<Widget>();
		for(Widget w: list) {
			if (w.getColor().equals("red")) {
				filteredList.add(w);
			}
		}
		
		// mapToInt  <== 가공:map(ping):정제된 데이터를 목적에 맞는 
		// 데이터를 추출하고 새로운 집합을 만드는 과정
		List<Integer> mappedList = new ArrayList<Integer>();
		for(Widget w: filteredList) {
			mappedList.add(w.getWeight());
		}
		
		// sum       <== 가공:reduce: 추출된 데이터를 집계하는 과정
		int resultSum = 0;
		for(int weight: mappedList) {
			resultSum += weight;
		}
		
		// print     <== 시각화 : 가공된 데이터를 출력하는 과정
		System.out.println(resultSum);
		
		assertThat(resultSum, is(178));
		
	}

}






