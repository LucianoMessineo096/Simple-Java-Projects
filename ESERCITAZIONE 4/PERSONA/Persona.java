public class Persona
{
  private String nome;
  private String cognome;
  private int età;

  /*COSTRUTTORE*/

  public Persona(String nome, String cognome , int età)
  {
    setNome(nome);
    setCognome(cognome);
    setEtà(età);
  }

  public Persona()
  {

  }

  /*INCAPSULAMENTO*/

  public String setNome(String nome)
  {
    this.nome=nome;

    return this;
  }

  public String setCognome(String cognome)
  {
    this.cognome=cognome;

    return this;
  }

  public int setEtà(int età)
  {
    if(età>=0 || età<=150)
    {
      this.età=età;
    }
    else
    {
      this.età=0;
    }

    return this;
  }

  public String getNome()
  {
    return nome;
  }

  public String getCognome()
  {
    return cognome;
  }

  public int getEtà()
  {
    return età;
  }



  /*METODI*/

  public String toString()
  {
    return nome + cognome+ età;
  }

  public void equals(String nome)
  {

  }

}
