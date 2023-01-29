public class Point2D
{
  private double x;
  private double y;

  public Point2D(double x , double y)
  {
    setX(x);
    setY(y);
  }

  public String toString()
  {
    return "("+"<"+ getX() +">"+")"+"("+"<"+ getY() +">"+")";
  }

  /////////////////////////////////////////////////////////////////////////////

  public double setX(double x)
  {
    return this.x=x;
  }

  public double setY(double y)
  {
    return this.y=y;
  }

  public double getX()
  {
    return x;
  }

  public double getY()
  {
    return y;
  }
}
