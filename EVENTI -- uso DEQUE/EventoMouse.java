public class EventoMouse extends Evento
{
  /*posizione mouse*/

  private int x;
  private int y;

  /**/

  private int stato_pressione_tasti;

  /*costruttore*/

  public EventoMouse(int identificativo , String descrizione_testuale , int x , int y , int stato_pressione_tasti)
  {
    super.setIdentificativo(identificativo);
    super.setTesto(descrizione_testuale);
    setX(x);
    setY(y);
    setPressione(stato_pressione_tasti);
  }

  public String toString()
  {
    return  super.toString() + " " + "posizione" +" "+ getX() +" "+ getY() +" "+ " pressione tasto"+  getPressione();
  }

  //////////////////////////////////////////////////////////////////////////////

  public int setX(int x)
  {
    return this.x=x;

  }

  public int setY(int y)
  {

    return this.y=y;

  }

  public int setPressione(int stato_pressione_tasti)
  {

    return this.stato_pressione_tasti=stato_pressione_tasti;

  }

  public int getX()
  {

    return x;

  }

  public int getY()
  {

    return y;

  }

  public int getPressione()
  {

    return stato_pressione_tasti;

  }


}
