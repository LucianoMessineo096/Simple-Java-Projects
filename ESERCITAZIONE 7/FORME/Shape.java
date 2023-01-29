
public abstract class Shape implements Drawable{
	private static long count = 0;
	private long ID;
	private int posX, posY;
	private String color;
	public abstract double area();
	public abstract double perimeter();
	
	public Shape() {
		count++;
		this.ID = count;
		posX = posY = 0;
	}
	
	public void moveTo(int x, int y) {
		this.posX = x;
		this.posY = y;
	}
	
	public int getPosX() {
		return posX;
	}

	public int getPosY() {
		return posY;
	}
	
	public long getID() {
		return ID;
	}
	
	public void setX(int x) {
		this.posX = x;
	}

	public void setY(int y) {
		this.posY = y;
	}
	
	public String toString() {
		return this.ID + ":" + "(" + this.posX + ", " + this.posY + ")";
	}
}
