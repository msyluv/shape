package shape;

public class ShapeApp {
	public static void main(String[] args) {

//		Point point1 = new Point();
//		point1.setX(2);
//		point1.setY(5);

//		Point point2 = new Point();
//		point2.setX(10);
//		point2.setY(23);

//		Point point3 = new Point(50, 50);
		
		ColourPoint point5 = new ColourPoint(10,50,"RED");
		point5.show();

//		ColourPoint point4 = new ColourPoint();
//		point4.setColour("red");
//		point4.setX(10);
//		point4.setY(50);
//		point4.show();

		/*point1.show();
		point2.show();
		point3.show();
		point3.show(false);
		point3.show();*/
		
		shape s=new shape();
		s.draw();

		shape rect = new Rect();
		shape circ = new Circ();

		rect.draw();
		circ.draw();

	}
}
