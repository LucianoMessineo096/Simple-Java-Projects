public class Studenti
{
  private int matricola;
  private long int codice;
  private String nome;
  private String cognome;

  /*costruttore*/

  public Studenti(int matricola , long int codice , String nome , String cognome)
  {
    setMatricola(matricola);
    setCodice(codice);
    setNome(nome);
    setCognome(cognome);
  }

  public Studenti()
  {

  }

  /*metodi*/

  public String toString()
  {
    return matricola +" "+ codice +" "+ nome +" "+ cognome;
  }

  //////////////////////////////////////////////////////////////////////////////

  public int setMatricola(int matricola)
  {
    return this.matricola=matricola;
  }

  public long int setCodice(long int codice)
  {
    return this.codice=codice;
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
