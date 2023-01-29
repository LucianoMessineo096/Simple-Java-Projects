public class StudenteMagistrale extends Studente
{
  private int cfu;
  private String corso_triennale;

  public StudenteMagistrale(String nome , String cognome , int eta , String data_iscrizione , String matricola , String corso_laurea , int cfu , String corso_triennale)
  {
    super(nome , cognome , eta , data_iscrizione , matricola , corso_laurea);
    setCfu(cfu);
    setCorsoT(corso_triennale);
  }

  public String toString()
  {
    return super.toString()+"cfu conseguiti"+getCfu()+"\n"+"corso triennale di provenienza"+getCorsoT()+"\n";
  }

  //////////////////////////////////////////////////////////////////////////////

  public int setCfu(int cfu)
  {
    return this.cfu=cfu;
  }

  public String setCorsoT(String corso_triennale)
  {
    return this.corso_triennale=corso_triennale;
  }

  public int getCfu()
  {
    return cfu;
  }

  public String getCorsoT()
  {
    return corso_triennale;
  }
}
