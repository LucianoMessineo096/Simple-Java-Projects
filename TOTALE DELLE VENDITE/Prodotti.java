public class Prodotti
{

  private String codice;
  private String nome;


  public Venditore(String codice , String nome)
  {
    setCodice(codice);
    setNome(nome);
  }

  public String toString()
  {
    return codice + " " + nome;
  }

  /***************************************************************************/

  public String setCodice(String codice)
  {
    if(codice>=1 && codice<=5)
    {
      return this.codice=codice;
    }
    else
    {
      return System.out.println("errore: codice prodotto non valido");
    }
  }

  public String setNome(String nome)
  {
    return this.nome=nome;
  }

}
