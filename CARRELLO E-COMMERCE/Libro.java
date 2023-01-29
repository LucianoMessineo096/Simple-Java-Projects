import java.util.*;

public class Libro extends Articolo
{
  /* variabili di istanza*/

  private String titolo;
  private String autore;


  /*costruttore*/

  public Libro(String codice, String descrizione , int costo, String titolo, String autore)
  {
    super(codice, descrizione, costo);
    setTitolo(titolo);
    setAutore(autore);
  }

  /*metodi*/

  public String toString()
  {
    return super.toString()+" "+getTitolo()+" "+getAutore()+" ";
  }


  /*********************************************************************/
  /*INCAPSULAMENTO*/
  /********************************************************************/

  public String setTitolo(String titolo)
  {
    return this.titolo=titolo;
  }

  public String getTitolo()
  {
    return titolo;
  }

  public String setAutore(String autore)
  {
    return this.autore=autore;
  }

  public String getAutore()
  {
    return autore;
  }


}
