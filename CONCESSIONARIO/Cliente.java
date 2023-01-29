public class Cliente
{
  private String nome;
  private String cognome;
  private int eta;
  private String cod_cliente;

  public Cliente(String nome , String cognome , int eta , String cod_cliente)
  {
    setNome(nome);
    setCognome(cognome);
    setEta(eta);
    setCod_Cliente(cod_cliente);
  }

  public String toString()
  {
    return getNome() +" "+ getCognome() +" "+ getEta() +" "+ getCod_Cliente();
  }

  /////////////////////////////////////////////////////////////////////////////

  public String setNome(String nome)
  {
    return this.nome = nome;
  }

  public String setCognome(String cognome)
  {
    return this.cognome = cognome;
  }

  public int setEta(int eta)
  {
    return this.eta = eta;
  }

  public String setCod_Cliente(String cod_cliente)
  {
    return this.cod_cliente = cod_cliente;
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

  public String getCod_Cliente()
  {
    return cod_cliente;
  }
}
