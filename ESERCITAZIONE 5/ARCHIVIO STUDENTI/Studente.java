public class Studente
{
  private String nome;
  private String cognome;
  private String matricola;


  public Studente(String nome , String cognome , String matricola)
  {
    setNome(nome);
    setCognome(cognome);
    setMatricola(matricola);
  }

  /*metodi*//*polimorfismo tra metodi equals*/

  public String toString()
  {
    return getNome()+" "+getCognome()+" "+getMatricola();
  }

  


  //////////////////////////////////////////////////////////////////////////////
  /*incapsulamento*/

  public String setNome(String nome)
  {
    return this.nome = nome;
  }

  public String setCognome(String cognome)
  {
    return this.cognome = cognome;
  }

  public String setMatricola(String matricola)
  {
    return this.matricola = matricola;
  }

  public String getNome()
  {
    return nome;
  }

  public String getCognome()
  {
    return cognome;
  }

  public String getMatricola()
  {
    return matricola;
  }


}
