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
		System.out.println("���� �׸��ϴ�.");
		System.out.println("�߽��� : " + this.point.getX() + ", " + this.point.getY());
		System.out.println("������ : " + this.r);
	}
	
}
