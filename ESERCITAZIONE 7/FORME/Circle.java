
public class Circle extends Shape {
	private double radius;
	
	public double area() {
		return Math.PI*radius*radius;
	}
	
	public double perimeter() {
		return 2.0*Math.PI*radius;
	}
	
	public Circle() {
		this(1.0);
	}
	
	public Circle(double radius) {
		setRadius(radius);
	}
	
	public void setRadius(double radius) {
		if(radius > 0.0)
			this.radius = radius;
		else
			this.radius = 0.0;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public String toString() {
		return super.toString() + " radius = " + radius;
	}
	
	public void show() {
		System.out.println("Showing circle " + getID());
	}

	public void hide() {
		System.out.println("Hiding circle " + getID());
	}
}
