public class Professore extends Persona
{
  private String data_assunzione;
  private String ruolo;
  private String dipartimento;

  public Professore(String nome , String cognome , int eta , String data_assunzione , String ruolo , String dipartimento)
  {
    super(nome , cognome , eta);
    setData(data_assunzione);
    setRuolo(ruolo);
    setDipartimento(dipartimento);
  }

  public String toString()
  {
    return super.toString()+"data di assunzione"+getData()+"\n"+"ruolo"+getRuolo()+"\n"+"dipartimento"+getDipartimento()+"\n";
  }

  /////////////////////////////////////////////////////////////////////////////

  public String setData(String data_assunzione)
  {
    return this.data_assunzione=data_assunzione;
  }

  public String setRuolo(String ruolo)
  {
    return this.ruolo=ruolo;
  }

  public String setDipartimento(String dipartimento)
  {
    return this.dipartimento=dipartimento;
  }

  public String getData()
  {
    return data_assunzione;
  }

  public String getRuolo()
  {
    return ruolo;
  }

  public String getDipartimento()
  {
    return dipartimento;
  }
}
