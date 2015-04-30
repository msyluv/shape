package shape;

public class Point implements Drawable{
	
	private int x;
	private int y;
	
	public Point(int x, int y){
		this.x=x;
		this.y=y;
	}
	public Point(){
		System.out.println("call Point()");
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void show(boolean visible){
		if(visible==true){
			show();
		} else {
			System.out.println("좌표[x="+x+",y="+y+"]에 점을 지웠습니다..");
		}
	}
		
	public void show(){
		System.out.println("좌표[x="+x+",y="+y+"]에 점을 그렸습니다.");
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("좌표[x="+x+",y="+y+"]에 점을 그렸습니다.");
	}
	
}
