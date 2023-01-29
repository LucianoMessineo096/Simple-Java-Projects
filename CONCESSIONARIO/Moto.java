public class Moto extends Veicoli
{

  /*variabili di istanza*/

  private String sella;

  /*costruttore*/

  public Moto(String casa_prod , String cod_modello , int cilindrata , String colore , String sella)
  {
    super(casa_prod , cod_modello , cilindrata , colore);
    setSella(sella);

  }

  

  /*metodi*/

  public String toString()
  {
    return super.toString() +" "+ getSella();
  }

  public Boolean equals()
  {
    return true;
  }


  //////////////////////////////////////////////////////////////////////////////
  /*incapsulamento*/

  /*setter*/

  public String setSella(String sella)
  {
    return this.sella = sella;
  }



  /*getter*/



  public String getSella()
  {
    return sella;
  }



}
