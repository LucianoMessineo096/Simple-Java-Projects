public class Persona
{
  private String nome;
  private String cognome;
  private String data_nascita;
  private String cod_fiscale;
  private String indirizzo;
  private String citta;
  private int cap;

  public Persona(String nome , String cognome , String data_nascita , String cod_fiscale , String indirizzo , String citta , int cap)
  {
    setNome(nome);
    setCognome(cognome);
    setData(data_nascita);
    setC_fiscale(cod_fiscale);
    setIndirizzo(indirizzo);
    setCitta(citta);
    setCap(cap);
  }

  public String toString()
  {
    return "nome:"+getNome()+"\n"+"cognome:"+getCognome()+"\n"+"data di nascita:"+getData()+"\n"+"codice fiscale:"+getC_fiscale()+"\n"+"indirizzo:"+getIndirizzo()+"\n"+"citta:"+getCitta()+"\n"+"cap:"+getCap()+"\n";
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

  public String setData(String data_nascita)
  {
    return this.data_nascita=data_nascita;
  }

  public String setC_fiscale(String cod_fiscale)
  {
    return this.cod_fiscale=cod_fiscale;
  }

  public String setIndirizzo(String indirizzo)
  {
    return this.indirizzo=indirizzo;
  }

  public String setCitta(String citta)
  {
    return this.citta=citta;
  }

  public int setCap(int cap)
  {
    return this.cap=cap;
  }

  public String getNome()
  {
    return nome;
  }

  public String getCognome()
  {
    return cognome;
  }

  public String getData()
  {
    return data_nascita;
  }

  public String getC_fiscale()
  {
    return cod_fiscale;
  }

  public String getIndirizzo()
  {
    return indirizzo;
  }

  public String getCitta()
  {
    return citta;
  }

  public int getCap()
  {
    return cap;
  }
}
