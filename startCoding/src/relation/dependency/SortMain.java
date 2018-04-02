package relation.dependency;

public class SortMain {
	public static void main(String[] args) {
		Algorithm al = new Algorithm();
		Sort sort = new Sort(al);
		sort.runSort(null);
	}
}
