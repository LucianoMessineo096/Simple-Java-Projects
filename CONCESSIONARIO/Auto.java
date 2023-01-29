public class Auto extends Veicoli
{
  /*variabili d'istanza*/

  private int porte;

  /*costruttore*/

  public Auto(String casa_prod , String cod_modello , int cilindrata , String colore , int porte)
  {
    super(casa_prod , cod_modello , cilindrata , colore);
    setPorte(porte);
  }



  /*metodi*/

  public String toString()
  {
    return super.toString() +" "+ getPorte();
  }




  //////////////////////////////////////////////////////////////////////////////
  /*incapsulamento*/

  /*setter*/

  public int setPorte(int porte)
  {
    return this.porte = porte;
  }

  /*getter*/



  public int getPorte()
  {
    return porte;
  }



























}
