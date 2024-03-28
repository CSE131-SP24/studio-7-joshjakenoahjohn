package studio7;

public class Rectangle {
	
	private int length;
	private int width;
	private int area;
	private int perimeter;
	
	// constructor 
	public Rectangle (int initLength, int initWidth) {
		length = initLength;
		width = initWidth;
		area = length * width;
		perimeter = (length * 2)+ (width *2);
	
	}
	
	public boolean Square() {
		if (width == length) {
			return true;
		}
		else {
			return false;
		}
	}
		
	public int area() {
		return area;
	}
	public boolean Compare(Rectangle r2) {
		if (this.area() < r2.area()) {
			return true;
		}
		else {
			return false;
		
	}
		
	}
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle (6, 6);
		System.out.println(r1.Square());
		Rectangle r2 = new Rectangle(7, 4);
		System.out.println(r1.Compare(r2));
		
		// TODO Auto-generated method stub

	}

}
