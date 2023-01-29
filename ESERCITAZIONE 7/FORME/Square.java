
public class Square extends Rectangle {
	public Square() {
		super(2, 2);
	}
	
	public Square(int l) {
		super(l, l);
	}
	
	public void setWidth(int l) {
		super.setWidth(l);
		super.setHeight(l);
	}

	public void setHeight(int l) {
		super.setWidth(l);
		super.setHeight(l);
	}
	
	public String toString() {
		return getID() + ":" + "(" + getPosX() + ", " + getPosY() + ")" + " " + getWidth();
	}

	public void show() {
		System.out.println("Showing square " + getID());
	}

	public void hide() {
		System.out.println("Hiding square" + getID());
	}

}
