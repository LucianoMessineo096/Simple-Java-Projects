public class Candidati extends Studenti
{
  private String nome_lista;

  /*costruttore*/

  public Candidati(int matricola , long int codice , String nome , String cognome , String nome_lista)
  {
    super(matricola , codice , nome , cognome);
    setNome_Lista(nome_lista);
  }

  public Candidati()
  {

  }

  /*metodi*/

  public String toString()
  {
    return super.toString() +" "+ nome_lista;
  }

  /////////////////////////////////////////////////////////////////////////////

  public String setNome_Lista(String nome_lista)
  {
    return this.nome_lista=nome_lista;
  }
}
