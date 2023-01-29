public class Rettangolo
{
  private int base;
  private int altezza;

  public Quadrato()
  {
    this(0);
  }

  public Rettangolo(int base, int altezza)
  {
     set(base,altezza);
  }

  public int perimetro()
  {
    return 2*(base+altezza);
  }

  public int area()
  {
    return base*altezza;
  }

  public String toString()
  {
    return "Perimetro" + perimetro() + "-Area" + area();
  }

//////////////////////////////////////////
  private set(int base, int altezza)
  {
    if(base<0)
    {
      base=0;
    }

    if(altezza<0)
    {
      altezza=0;
    }

    this.base=base;
    this.altezza=altezza;
  }

}
