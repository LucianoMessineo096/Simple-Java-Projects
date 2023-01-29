public class OperaArte
{
  private String titolo;
  private String autore;
  private String dataDiCreazione;

  public OperaArte(String titolo , String autore , String dataDiCreazione)
  {
    setTitolo(titolo);
    setAutore(autore);
    setdataDiCreazione(dataDiCreazione);
  }

  public OperaArte()
  {

  }

  /*metodi*/

  public String toString()
  {
    return titolo + " " + autore + " " + dataDiCreazione;
  }

  /////////////////////////////////////////////////////////////////////////////

  public String setTitolo(String titolo)
  {
    return this.titolo=titolo;
  }

  public String setAutore(String autore)
  {
    return this.autore=autore;
  }

  public String setdataDiCreazione(String dataDiCreazione)
  {
    return this.dataDiCreazione=dataDiCreazione;
  }


}
