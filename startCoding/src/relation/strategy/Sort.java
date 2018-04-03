package relation.strategy;

public class Sort {
	private Algorithm algo;
	
	public Sort(Algorithm algo) {
		this.algo = algo;
	}
	
	public void print() {
		algo.runSort();
	}
}
