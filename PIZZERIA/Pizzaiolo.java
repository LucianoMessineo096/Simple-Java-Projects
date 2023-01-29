public class Pizzaiolo extends Pizza
{
  private String note_p;
  private boolean consegna =false;

  public Pizzaiolo(int tipo , String aggiunzioni , String note , String note_p , boolean consegna)
  {
    super(tipo , aggiunzioni , note);
    setNote_P(note_p);
    setConsegna(consegna);
  }

  public void setConsegna(boolean consegna)
  {
    this.consegna = consegna;
  }

  /////////////////////////////////////////////////////////////////////////////

  public void setNote_P(String note_p)
  {
    this.note_p = note_p;
  }

  public String getNote_P()
  {
    return note_p;
  }
}
