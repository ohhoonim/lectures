package relation.extend;

public class ShapeTest {
	public static void main(String[] args) {
		/*
		Shape shape = new Shape(100);
		shape.drawing();
		
		Rectangle rec = new Rectangle(200, 1, 1, 5, 5);
		rec.drawing();
		
		Circle circle = new Circle(300, 0, 0, 5);
		circle.drawing();
		*/
		Shape[] arrShape = new Shape[7];
		arrShape[0] = new Shape(100);
		arrShape[1] = new Rectangle(200, new Point(1,1), new Point(2,2));
		arrShape[2] = new Circle(300, new Point(2, 1), 5);
		arrShape[3] = new Circle(400, new Point(5, 0), 5);
		arrShape[4] = new Rectangle(500, new Point(8,1), new Point(2,7));
		arrShape[5] = new Circle(600, new Point(0, 0), 5);
		arrShape[6] = new Rectangle(700, new Point(3,1), new Point(5,2));
		int arrSize = arrShape.length;
		for (int i = 0; i < arrSize; i++ ) {
			arrShape[i].drawing();
		}
	}
}









