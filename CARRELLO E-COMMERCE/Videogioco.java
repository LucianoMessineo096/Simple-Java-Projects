import java.util.*;

public class Videogioco extends Articolo
{
  /* variabili di istanza*/

  private String piattaforma;


  /*costruttore*/

  public Videogioco(String codice, String descrizione , int costo, String piattaforma)
  {
    super(codice, descrizione, costo);
    setPiattaforma(piattaforma);
  }

  /*metodi*/

  public String toString()
  {
    return super.toString()+" "+getPiattaforma()+" ";
  }


  /*********************************************************************/
  /*INCAPSULAMENTO*/
  /********************************************************************/

  public String setPiattaforma(String piattaforma)
  {
    return this.piattaforma=piattaforma;
  }

  public String getPiattaforma()
  {
    return piattaforma;
  }


}
