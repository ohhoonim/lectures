package relation.dependency;

public class Sort {
	private Algorithm al;
	
	public Sort(Algorithm al) {
		this.al = al;
	}
	
	public void runSort(int[] arrNums) {
		
		al.algo();
		System.out.println("소트실행...");
	}
}
