package sds.icto55.oop.example;

public class Ex4_overridingTest {
	public static void main(String[] args) {
		Ex4_overriding e = new Ex4_overriding();
		Ex4_overriding2 ex = new Ex4_overriding2();
		
		e.draw();
		System.out.println("오버라이딩 후");
		ex.draw();
	}
}
