package shape;

public class Rect extends shape implements Drawable{
	
	private int width;
	private int height;
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public void draw(){
		System.out.println("사각형");
	}

	@Override
	public double CalculateArea() {
		// TODO Auto-generated method stub
		return width * height;
	}
	
	
	
}
