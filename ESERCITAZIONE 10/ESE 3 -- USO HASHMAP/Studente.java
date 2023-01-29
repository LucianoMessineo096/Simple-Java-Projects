public class Studente
{
  private String nome;
  private String voto; //valore//
  private String matricola; //chiave//

  public Studente(String nome , String voto , String matricola)
  {
    setNome(nome);
    setVoto(voto);
    setMatricola(matricola);
  }

  public String toString()
  {
    return "nome"+getNome()+" "+"matricola"+getMatricola()+" "+"voto"+getVoto();
  }

  /////////////////////////////////////////////////////////////////////////////

  public String setNome(String nome)
  {
    return this.nome=nome;
  }

  public String setVoto(String voto)
  {
    return this.voto=voto;
  }

  public String setMatricola(String matricola)
  {
    return this.matricola=matricola;
  }

  public String getNome()
  {
    return nome;
  }

  public String getVoto()
  {
    return voto;
  }

  public String getMatricola()
  {
    return matricola;
  }
}
