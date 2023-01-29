public class Abbonato extends Persona
{
  private int sconto;
  private int acquisto;

  public Abbonato(String nome , String cognome , String data_nascita , String cod_fiscale , String indirizzo , String citta , int cap , int sconto , int acquisto)
  {
    super(nome , cognome , data_nascita , cod_fiscale ,  indirizzo , citta , cap);
    setSconto(sconto);
    setAcquisto(acquisto);
  }

  public String toString()
  {
    return super.toString()+"sconto:"+getSconto()+"\n";
  }

  /////////////////////////////////////////////////////////////////////////////

  public int setSconto(int sconto)
  {
    return this.sconto=sconto;
  }

  public int setAcquisto(int acquisto)
  {
    return this.acquisto=acquisto;
  }

  public int  getSconto()
  {
    return sconto;
  }

  public int getAcquisto()
  {
    return acquisto;
  }
}
