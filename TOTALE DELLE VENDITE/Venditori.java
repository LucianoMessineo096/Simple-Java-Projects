public class Venditori
{

  private String codice;
  private String nome;
  private String cognome;

  public Venditore(String codice , String nome , String cognome)
  {
    setCodice(codice);
    setNome(nome);
    setCognome(cognome);
  }

  public String toString()
  {
    return codice + " " + nome + " " + cognome;
  }

  /***************************************************************************/

  public String setCodice(String codice)
  {
    if(codice>=1 && codice<=4)
    {
      return this.codice=codice;
    }
    else
    {
      return System.out.println("errore: codice venditore non valido");
    }
  }

  public String setNome(String nome)
  {
    return this.nome=nome;
  }

  public String setCognome(String cognome)
  {
    return this.cognome=cognome;
  }




}
