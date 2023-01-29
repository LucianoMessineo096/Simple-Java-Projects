public class StudenteTriennale extends Studente
{
  private int cfu;
  private String scuola_superiore;

  public StudenteTriennale(String nome , String cognome , int eta , String data_iscrizione , String matricola , String corso_laurea , int cfu , String scuola_superiore)
  {
    super(nome , cognome , eta , data_iscrizione , matricola , corso_laurea );
    setCfu(cfu);
    setScuola(scuola_superiore);
  }

  public String toString()
  {
    return super.toString()+"cfu conseguiti"+getCfu()+"\n"+"scuola di provenienza"+getScuola()+"\n";
  }

  //////////////////////////////////////////////////////////////////////////////

  public int setCfu(int cfu)
  {
    return this.cfu=cfu;
  }

  public String setScuola(String scuola_superiore)
  {
    return this.scuola_superiore=scuola_superiore;
  }

  public int getCfu()
  {
    return cfu;
  }

  public String getScuola()
  {
    return scuola_superiore;
  }
}
