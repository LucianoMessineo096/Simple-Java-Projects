public class Quadrato
{
  private int lato;

  public Quadrato()
  {
    this(0);
  }

  public Quadrato(int lato)
  {

  }

  public int perimetro()
  {
    return lato*4;
  }

  public int area()
  {
    return lato*lato;
  }


  public void setLato(int lato)//metodo costruttore
  {
    if(lato>=0)
    {
      this.lato=lato;
    }
    else
    {
      this.lato=0;
    }
  }
}
