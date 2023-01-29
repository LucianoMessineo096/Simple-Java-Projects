public class Shape
{
  private String color;
  private boolean filled;

  public Shape(String color , boolean filled)
  {
    setColor(color);
    setFilled(filled);

  }

  public String toString()
  {
    return getColor() +" "+ getFilled();
  }

  /////////////////////////////////////////////////////////////////////////////

  public String setColor(String color)
  {
    return this.color=color;
  }

  public boolean setFilled(boolean filled)
  {
    return this.filled=filled;
  }

  public String getColor()
  {
    return color;
  }

  public boolean getFilled()
  {
    return filled;
  }

}
