public class Cantante
{
  private int codice;

  public Cantante(int codice)
  {
    setCodice(codice);
  }

  /////////////////////////////////////////////////////////////////////////////

  public int setCodice(int codice)
  {
    return this.codice=codice;
  }

  public int getCodice()
  {
    return codice;
  }
}
