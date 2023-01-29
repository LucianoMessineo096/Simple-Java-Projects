import java.util.*;

public class Pizza
{
  private int tipo;
  private String aggiunzioni;
  private String note;


  int i=0;

  public Pizza(int tipo , String aggiunzioni , String note)
  {
    i++;
    setTipo(tipo);
    setAgg(aggiunzioni);
    setNote(note);

  }

  ////////////////////////////////////////////////////////////////////////////

  public void setTipo(int tipo)
  {
    this.tipo=tipo;
  }

  public void setAgg(String aggiunzioni)
  {
    this.aggiunzioni=aggiunzioni;
  }

  public void setNote(String note)
  {
    this.note=note;
  }

  public int getTipo()
  {
    return tipo;
  }

  public String getAgg()
  {
    return aggiunzioni;
  }

  public String getNote()
  {
    return note;
  }
}
