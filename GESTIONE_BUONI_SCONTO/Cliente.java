public class Cliente extends Persona
{
  private int codice_sconto;

  /*costruttore*/

  public Cliente(String nome , String cognome , String sesso , String data_nascita , String email , int cod_cliente , int codice_sconto)
  {
    super(nome , cognome , sesso , data_nascita , email , cod_cliente);
    setCodice_sconto(codice_sconto);
  }

  public String toString()
  {
    return super.toString()+" "+getCodice_sconto()+"%";
  }

  /////////////////////////////////////////////////////////////////////////////

  public int setCodice_sconto(int codice_sconto)
  {
    return this.codice_sconto=codice_sconto;
  }

  public int getCodice_sconto()
  {
    return codice_sconto;
  }
}
