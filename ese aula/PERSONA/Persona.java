public class Persona
{
  private String nome;
  private String cognome;
  private int eta;

  public Persona(String nome, String cognome, int eta)
  {
    setNome(nome);
  }

  public Persona()
  {
    this("nome sconosciuto","cognoe sconosciuto","-1");
    SYstem.out.println("costruttore persona");
  }

  public String toString()
  {
    return nome +""+ cognome +""+ "("+ eta +")";
  }

  public void setNome(String nome)
  {
    this.nome=nome;//this significa oggetto a cui punta
  }

  public void setCognome(String cognome)
  {
    this.cognome=cognome;
  }

  public void setEta(int eta)
  {
    if(eta<0 || eta>150)
    {
      this.eta=0;
    }
    else
    {
      this.eta=eta;
    }
  }
}
