import java.util.*;

public class Articolo
{
  /* variabili di istanza*/

  private String codice;
  private String descrizione;
  private int costo;

  /*costruttore*/

  public Articolo(String codice, String descrizione , int costo)
  {
    setCodice(codice);
    setDescrizione(descrizione);
    setCosto(costo);
  }

  /*metodi*/

  public String toString()
  {
    return getCodice()+" "+getDescrizione()+" "+getCosto()+" ";
  }


  /*********************************************************************/
  /*INCAPSULAMENTO*/
  /********************************************************************/

  public String setCodice(String codice)
  {
    return this.codice=codice;
  }

  public String setDescrizione(String descrizione)
  {
    return this.descrizione=descrizione;
  }

  public int setCosto(int costo)
  {
    return this.costo=costo;
  }

  public String getCodice()
  {
    return codice;
  }

  public String getDescrizione()
  {
    return descrizione;
  }

  public String getCosto()
  {
    return costo;
  }
}
