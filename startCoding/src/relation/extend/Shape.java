package relation.extend;

public class Shape {
	private int shapeId;
	
	public Shape(int shapeId) {
		this.shapeId = shapeId;
	}
	
	public void drawing() {
		System.out.println("������ �׸��ϴ�.");
	}
	
	public int getShapeId() {
		return this.shapeId;
	}
}
