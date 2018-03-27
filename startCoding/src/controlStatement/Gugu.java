package controlStatement;

public class Gugu {
	private int startDan ;
	private int endDan;
	private int width = 4;
	
	public Gugu(int startDan, int endDan) {
		this.startDan = startDan;
		this.endDan = endDan;
	}
	
	public void print() {
		
		int pSize = (( endDan - startDan ) / width) + 1;
		
		for (int p = 0; p < pSize; p++) {
			for (int times = 1; times < 10; times++) {
				String row = "";
				for (int dan = p * width + startDan; (dan < p * width + startDan + width) && (dan < endDan + 1); dan++) {
					row += dan + " * " + times + " = " + (dan * times) + "\t";
				}
				System.out.println(row);
			}
			System.out.println();
		}
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
}
