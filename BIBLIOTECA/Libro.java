public class Libro
{
  private String titolo;
  private String autore;
  private String isbn;

  public Libro(String titolo , String autore , String isbn)
  {
    setTitolo(titolo);
    setAutore(autore);
    setIsbn(isbn);
  }

  public String toString()
  {
    return "titolo :"+getTitolo()+"\n"+"autore :"+getAutore()+"\n"+"isbn : "+getIsbn()+"\n";
  }

  /////////////////////////////////////////////////////////////////////////////

  public void setTitolo(String titolo)
  {
    this.titolo = titolo;
  }

  public void setAutore(String autore)
  {
    this.autore = autore;
  }

  public void setIsbn(String isbn)
  {
    this.isbn = isbn;
  }

  public String getTitolo()
  {
    return titolo;
  }

  public String getAutore()
  {
    return autore;
  }

  public String getIsbn()
  {
    return isbn;
  }
}
