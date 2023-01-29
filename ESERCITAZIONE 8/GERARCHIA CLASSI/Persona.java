public class Persona
{
  private String nome;
  private String cognome;
  private int eta;

  public Persona(String nome , String cognome , int eta)
  {
    setNome(nome);
    setCognome(cognome);
    setEta(eta);
  }

  public String toString()
  {
    return "nome"+getNome()+"\n"+"cognome"+getCognome()+"\n"+"età"+getEta()+"\n";
  }

  //////////////////////////////////////////////////////////////////////////////

  public String setNome(String nome)
  {
    return this.nome=nome;
  }

  public String setCognome(String cognome)
  {
    return this.cognome=cognome;
  }

  public int setEta(int eta)
  {
    return this.eta=eta;
  }

  public String getNome()
  {
    return nome;
  }

  public String getCognome()
  {
    return cognome;
  }

  public int getEta()
  {
    return eta;
  }
}
