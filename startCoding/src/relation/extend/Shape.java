package relation.extend;

public class Shape {
	private int shapeId;
	
	public Shape(int shapeId) {
		this.shapeId = shapeId;
	}
	
	public void drawing() {
		System.out.println("도형을 그립니다.");
	}
	
	public int getShapeId() {
		return this.shapeId;
	}
}
