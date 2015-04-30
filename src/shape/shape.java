package shape;

public abstract class shape implements Visible{
	private String color;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void draw() {
		System.out.println("구체적인 도형을 그릴 수 없습니다. 상속해서 재정의하세요");
	}
	public abstract double CalculateArea();
}
