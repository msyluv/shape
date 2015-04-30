package shape;

public class Triangle extends shape implements Drawable{

	private int height;
	private int width;

	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	@Override
	public void draw(){
		System.out.println("삼각형");
	}
	@Override
	public double CalculateArea() {
		// TODO Auto-generated method stub
		return 0.5*height*width;
	}
	@Override
	public boolean visible() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
