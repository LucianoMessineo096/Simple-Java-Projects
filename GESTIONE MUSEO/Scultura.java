public class Scultura extends OperaArte
{
  private String materiale;
  private double altezza;

  /*costruttori*/

  public Scultura(String titolo , String autore , String dataDICreazione , String materiale , double altezza)
  {
    super(titolo , autore , dataDiCreazione);
    setMateriale(materiale);
    setAltezza(altezza);
  }

  public Scultura()
  {

  }

  /*metodi*/

  public String toString()
  {
    return super.toString() + " " + materiale + " " + altezza;
  }

  //////////////////////////////////////////////////////////////////////////////

  public String setMateriale(String materiale)
  {
    return this.materiale=materiale;
  }

  public double setAltezza(double Altezza)
  {
    return this.altezza=altezza;
  }

}
