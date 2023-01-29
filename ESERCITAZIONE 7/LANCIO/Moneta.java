public class Moneta
{
  private int testa ;
  private int croce ;

  public Moneta()
  {
    setTesta();
    setCroce();

  }

  public void lancia()
  {

  }

  /////////////////////////////////////////////////////////////////////////////

  public int setTesta()
  {
    return this.testa=0;
  }

  public int setCroce()
  {
    return this.croce=1;
  }

  public int getTesta()
  {
    return testa;
  }

  public int getCroce()
  {
    return croce;
  }

}
