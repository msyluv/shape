package shape;

public class Circ extends shape implements Drawable{
	
	private double radius;
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public void draw(){
		System.out.println("원");
	}

	@Override
	public double CalculateArea() {
		return Math.PI*radius*radius;
	}
}
