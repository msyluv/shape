package shape;

public class Circ extends shape implements Drawable{
	
	private int radius;
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
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

	@Override
	public boolean visible() {
		// TODO Auto-generated method stub
		return false;
	}
}
