package shape;

public abstract class shape {
	public void draw() {
		System.out.println("구체적인 도형을 그릴 수 없습니다. 상속해서 재정의하세요");
	}
	public abstract double CalculateArea();
}
