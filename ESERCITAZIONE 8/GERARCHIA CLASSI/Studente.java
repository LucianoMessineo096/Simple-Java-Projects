public class Studente extends Persona
{
  private String data_iscrizione;
  private String matricola;
  private String corso_laurea;

  public Studente(String nome , String cognome , int eta , String data_iscrizione , String matricola , String corso_laurea)
  {
    super(nome , cognome , eta);
    setDataI(data_iscrizione);
    setMatricola(matricola);
    setCorso(corso_laurea);
  }

  public String toString()
  {
    return super.toString()+"data di iscrizione"+getDataI()+"\n"+"matricola"+getMatricola()+"\n"+"corso di laurea"+getCorso()+"\n";
  }

  //////////////////////////////////////////////////////////////////////////////

  public String setDataI(String data_iscrizione)
  {
    return this.data_iscrizione=data_iscrizione;
  }

  public String setMatricola(String matricola)
  {
    return this.matricola=matricola;
  }

  public String setCorso(String corso_laurea)
  {
    return this.corso_laurea=corso_laurea;
  }

  public String getDataI()
  {
    return data_iscrizione;
  }

  public String getMatricola()
  {
    return matricola;
  }

  public String getCorso()
  {
    return corso_laurea;
  }
}
