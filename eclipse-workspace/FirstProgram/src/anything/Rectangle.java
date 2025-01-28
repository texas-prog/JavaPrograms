package anything;

public class Rectangle {
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public double area() {
		return this.length * this.width;
	}
	
	public Rectangle doubleDimensions() {
		this.length *= 2;
		this.width *= 2;
		return this;
	}
	
	public double getlength() {
		return length;
	}
	
	public double getwidth() {
		return width;
	}
}
