package shape;

public class ColourPoint extends Point {
	private String colour;

	public ColourPoint(int x, int y, String colour){
		//setX(x);
		//setY(y);
		super(x,y);
		this.colour=colour;
	}
	
	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public void show(){
		System.out.println("좌표[x="+getX()+",y="+getY()+",colour="+colour+"]에 점을 그렸습니다..");
	}
}
