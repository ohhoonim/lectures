package relation.strategy;

public class SortTest {
	public static void main(String[] args) {
		Algorithm algo  = new Quick();
		Sort sort = new Sort(algo);
		sort.print();
		
		Algorithm algo2 = new Bubble();
		Sort sort2 = new Sort(algo2);
		sort2.print();
	}
}
