public class Circle extends Shape
{
  private double radius;

  public Circle(String color , boolean filled , double radius)
  {
    super(color , filled);
    setRadius(radius);
  }

  public String toString()
  {
    return super.toString() +" "+ getRadius();
  }

  public double Area(double radius)
  {
    return 3.14*(radius*radius);
  }

  public double Perimetro(double radius)
  {
    return 2*3.14*radius;
  }

  /////////////////////////////////////////////////////////////////////////////

  public double setRadius(double radius)
  {
    return this.radius=radius;
  }

  public double getRadius()
  {
    return radius;
  }
}
