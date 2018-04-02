package relation.extend;

public class Rectangle extends Shape {
	private Point startPoint;
	private Point endPoint;
	
	public Rectangle(int shapeId, Point startPoint, Point endPoint) {
		super(shapeId);
		// 부모클래스에 디폴트 생성자가 아닌 생성자가 존재하는 경우
		// 자식클래스는 부모클래스의 생성자를 반드시 호출해주어야 한다. 
		// super 키워드를 사용하여 부모 생성자를 호출할 경우 
		// 반드시 제일 처음에 위치시켜야한다. 
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}
	@Override
	public void drawing() {
		System.out.println("====================");
		System.out.println("사각형을 그립니다.");
		System.out.println("시작점 : " + this.startPoint.getX() + ", " 
								+ this.startPoint.getY());
		System.out.println("끝   점 : " + this.endPoint.getX() + ", " 
								+ this.endPoint.getY());
		
		
	}
	
}
