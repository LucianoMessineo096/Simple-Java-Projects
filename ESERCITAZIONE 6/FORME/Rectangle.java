public class Rectangle extends Shape
{
  private double width;
  private double lenght;

  public Rectangle(String color , boolean filled , double width , double lenght)
  {
    super(color , filled);
    setWidth(width);
    setLenght(lenght);
  }

  public String toString()
  {
    return super.toString() +" "+ getWidth() +" "+ getLenght();
  }

  public double Area(double width , double lenght)
  {
    return width*lenght;
  }

  public double Perimentro(double width , double lenght)
  {
    return (width+lenght)*2;
  }

  /////////////////////////////////////////////////////////////////////////////

  public double setWidth(double width)
  {
    return this.width=width;
  }

  public double setLenght(double lenght)
  {
    return this.lenght=lenght;
  }

  public double getWidth()
  {
    return width;
  }

  public double getLenght()
  {
    return lenght;
  }
}
