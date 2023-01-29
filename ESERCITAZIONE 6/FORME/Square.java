public class Square extends Rectangle
{
  public Square(String color , boolean filled , double width , double lenght)
  {
    super(color , filled , width , lenght);
  }

  public String toString()
  {

    return super.toString();

  }

  public double Area(double width , double lenght)
  {
    return width*lenght;
  }

  public double Perimetro(double width)
  {
    return width*4;
  }
}
