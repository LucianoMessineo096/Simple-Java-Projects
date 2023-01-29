public class Giocatore
{
  /*variabili di istanza*/

  private int pos_class;
  private String nome;
  private String cognome;
  private int eta;

  /*costruttore*/

  public Giocatore(String nome , String cognome , int eta , int pos_class)
  {
    setNome(nome);
    setCognome(cognome);
    setEtà(eta);
    setPos_Class(pos_class);
  }

  public Giocatore()
  {
    /*costruttore vuoto*/
  }
///////////////////////////////////////////////////////////////////////////////
  /*metodi*/



  /////////////////////////////////////////////////////////////////////////////
/*incapsulamento*/
  public String setNome(String nome)
  {
    return this.nome=nome;
  }

  public String setCognome(String nome)
  {
    return this.cognome=cognome;
  }

  public int setEta(int eta)
  {
    return this.eta=eta;
  }

  public int setPos_Class(int pos_class)
  {
    return this.pos_class=pos_class;
  }
}
