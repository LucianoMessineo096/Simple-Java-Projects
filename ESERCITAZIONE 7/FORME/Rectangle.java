
public class Rectangle extends Shape implements Rotatable {
	private int width, height;
	private int angle;
	
	public double area() {
		return width*height;
	}
	
	public double perimeter() {
		return 2*(width+height);
	}
	
	public Rectangle() {
		this(10, 5);
	}
	
	public Rectangle(int width, int height) {
		setAngle(0);
		setWidth(width);
		setHeight(height);
	}
	
	public void setAngle(int angle) {
		this.angle = angle;
	}
	
	public int getAngle() {
		return angle;
	}
	
	public void setWidth(int width) {
		if(width > 0)
			this.width = width;
		else
			this.width = 0;
	}

	public void setHeight(int height) {
		if(height > 0)
			this.height = height;
		else
			this.height = 0;
	}
	
	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
	
	public String toString() {
		return super.toString() + " " + width + " - " + height + " (" + getAngle() + ")";
	}
	
	public void show() {
		System.out.println("Showing rectangle " + getID());
	}

	public void hide() {
		System.out.println("Hiding rectangle" + getID());
	}

	public void rotateCW(int degree) {
		setAngle(getAngle() - degree);
	}
	
	public void rotateCCW(int degree) {
		setAngle(getAngle() + degree);
	}

}
