public class Persona
{
  private String nome;
  private String cognome;
  private String sesso;
  private String data_nascita;
  private String email;
  private int cod_cliente;

  /*costruttore*/

  public Persona(String nome , String cognome , String sesso , String data_nascita , String email , int cod_cliente)
  {
    setNome(nome);
    setCognome(cognome);
    setSesso(sesso);
    setData_nascita(data_nascita);
    setEmail(email);
    setCod_cliente(cod_cliente);
  }

  public String toString()
  {
    return getNome()+" "+getCognome()+" "+getSesso()+" "+getData_nascita()+" "+getEmail()+" "+getCod_cliente();
  }


  /////////////////////////////////////////////////////////////////////////////

  public String setNome(String nome)
  {
    return this.nome=nome;
  }

  public String setCognome(String cognome)
  {
    return this.cognome=cognome;
  }

  public String setSesso(String sesso)
  {
    return this.sesso=sesso;
  }

  public String setData_nascita(String data_nascita)
  {
    return this.data_nascita=data_nascita;
  }

  public String setEmail(String email)
  {
    return this.email=email;
  }

  public int setCod_cliente(int cod_cliente)
  {
    return this.cod_cliente=cod_cliente;
  }

  public String getNome()
  {
    return nome;
  }

  public String getCognome()
  {
    return cognome;
  }

  public String getSesso()
  {
    return sesso;
  }

  public String getData_nascita()
  {
    return data_nascita;
  }

  public String getEmail()
  {
    return email;
  }

  public int getCod_cliente()
  {
    return cod_cliente;
  }
}
