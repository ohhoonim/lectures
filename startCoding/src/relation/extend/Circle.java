package relation.extend;

public class Circle extends Shape {
	private Point point;
	private int r;
	
	public Circle (int shapeId, Point point, int r) {
		super(shapeId);
		this.point = point;
		this.r = r;
	}
	@Override
	public void drawing() {
		System.out.println("====================");
		System.out.println("원을 그립니다.");
		System.out.println("중심점 : " + this.point.getX() + ", " + this.point.getY());
		System.out.println("반지름 : " + this.r);
	}
	
}
