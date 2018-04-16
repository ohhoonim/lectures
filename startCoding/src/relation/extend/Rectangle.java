package relation.extend;

public class Rectangle extends Shape {
	private Point startPoint;
	private Point endPoint;
	
	public Rectangle(int shapeId, Point startPoint, Point endPoint) {
		super(shapeId);
		// �θ�Ŭ������ ����Ʈ �����ڰ� �ƴ� �����ڰ� �����ϴ� ���
		// �ڽ�Ŭ������ �θ�Ŭ������ �����ڸ� �ݵ�� ȣ�����־�� �Ѵ�. 
		// super Ű���带 ����Ͽ� �θ� �����ڸ� ȣ���� ��� 
		// �ݵ�� ���� ó���� ��ġ���Ѿ��Ѵ�. 
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}
	@Override
	public void drawing() {
		System.out.println("====================");
		System.out.println("�簢���� �׸��ϴ�.");
		System.out.println("������ : " + this.startPoint.getX() + ", " 
								+ this.startPoint.getY());
		System.out.println("��   �� : " + this.endPoint.getX() + ", " 
								+ this.endPoint.getY());
		
		
	}
	
}
