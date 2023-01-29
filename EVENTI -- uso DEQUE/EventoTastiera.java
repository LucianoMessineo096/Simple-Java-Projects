public class EventoTastiera extends Evento
{
  private int tasto_premuto;
  private int stato_modificatori;

  /*costruttore*/

  public EventoTastiera(int identificativo , String descrizione_testuale , int tasto_premuto , int stato_modificatori)
  {
    super.setIdentificativo(identificativo);
    super.setTesto(descrizione_testuale);
    setTasto(tasto_premuto);
    setModificatori(stato_modificatori);
  }

  public String toString()
  {
    return super.toString() +" "+ "tasto"+ getTasto() +" "+ " modificatore"+ getModificatori();
  }

  //////////////////////////////////////////////////////////////////////////////

  public int setTasto(int tasto_premuto)
  {
    return this.tasto_premuto=tasto_premuto;
  }

  public int setModificatori(int stato_modificatori)
  {
    return this.stato_modificatori=stato_modificatori;
  }

  public int getTasto()
  {
    return stato_modificatori;
  }

  public int getModificatori()
  {
    return stato_modificatori;
  }
}
