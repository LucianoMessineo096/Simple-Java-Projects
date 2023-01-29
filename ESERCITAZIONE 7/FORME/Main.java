
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle();
		Rectangle r1 = new Rectangle(4, 8);
		Square s1 = new Square(3);
		
		s1.setHeight(5);
		System.out.println(s1.getWidth() + ", " + s1.getHeight());
		
		
		c1.moveTo(25, 30);
		s1.moveTo(10, 15);
		
		r1.rotateCW(45);
		
		Rotatable r = s1;
		r.rotateCW(25);
		
		Drawable d = c1;
		d.show();
		
		System.out.println(c1);
		System.out.println(r1);
		System.out.println(s1);
		
	
	}
	
}
