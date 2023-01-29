public class Vettore2D
{
  private double x;
  private double y;
  private double velocita;
  private double accelerazione;

  public Vettore2D(double x , double y , double velocita , double accelerazione)
  {
    setX(x);
    setY(y);
    setVelocita(velocita);
    setAccelerazione(accelerazione);
  }

  public String toString()
  {
    return "posizione x:"+getX()+"posizione y"+getY();
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

  public double setVelocita(double velocita)
  {
    return this.velocita=velocita;
  }

  public double setAccelerazione(double accelerazione)
  {
    return this.accelerazione=accelerazione;
  }

  public double getX()
  {
    return x;
  }

  public double getY()
  {
    return y;
  }

  public double getVelocita()
  {
    return velocita;
  }

  public double getAccelerazione()
  {
    return accelerazione;
  }
}
