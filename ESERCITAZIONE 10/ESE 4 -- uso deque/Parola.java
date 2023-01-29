public class Parola
{
  private String parola;

  public Parola(String parola)
  {
    setParola(parola);
  }

  public String toString()
  {
    return "parola inserita:"+getParola();
  }



  /////////////////////////////////////////////////////////////////////////////

  public String setParola(String parola)
  {
    return this.parola = parola;
  }

  public String getParola()
  {
    return parola;
  }
}
