public class Veicoli
{

  private String casa_prod;
  private String cod_modello;
  private int  cilindrata;
  private String colore;

  public Veicoli(String casa_prod , String cod_modello , int cilindrata , String colore)
  {
    setCasa_Prod(casa_prod);
    setCod_Modello(cod_modello);
    setCilindrata(cilindrata);
    setColore(colore);
  }

  public String toString()
  {
    return getCasa_prod() +" "+ getCod_Modello() +" "+ getCilindrata() +" "+ getColore();
  }

  /////////////////////////////////////////////////////////////////////////////
  /*incapsulamento*/

  public String setCasa_Prod(String casa_prod)
  {
    return this.casa_prod = casa_prod;
  }

  public String setCod_Modello(String cod_modello)
  {
    return this.cod_modello = cod_modello;
  }

  public int setCilindrata(int cilindrata)
  {
    return this.cilindrata = cilindrata;
  }

  public String setColore(String colore)
  {
    return this.colore = colore;
  }

  public String getCasa_prod()
  {
    return casa_prod;
  }

  public String getCod_Modello()
  {
    return cod_modello;
  }

  public int getCilindrata()
  {
    return cilindrata;
  }

  public String getColore()
  {
    return colore;
  }

}
