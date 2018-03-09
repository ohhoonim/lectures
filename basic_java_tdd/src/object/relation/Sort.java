package object.relation;

public class Sort {
	
	private Algorithm al; 
	
	public Sort(Algorithm al) {
		this.al = al;
	}

	public void print() {
		al.runSort();		
	}
	
	public void setAl(Algorithm al) {
		this.al = al;
	}
	
	
}
