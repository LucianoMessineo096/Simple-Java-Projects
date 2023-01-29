import java.util.*;

public class Abbonato
{
  private String nome;
  private String cognome;
  private String cod;
  private ArrayList<Libro> libri = new ArrayList<>();

  public Abbonato(String nome , String cognome , String cod , Libro L)
  {
    setNome(nome);
    setCognome(cognome);
    setCod(cod);
    setLibro(L);
  }

  public String toString()
  {
    return "nome : "+getNome()+" "+"cognome : "+getCognome()+" "+"codice identificativo : "+getCod()+"\n"+"lista libri in prestito"+"\n"+libri;
  }

  public void removeLibro(String isbn)
  {
    for(Libro l : libri)
    {
      if(l.getIsbn().equals(isbn))
      {
        libri.remove(l);
      }
    }
  }



  /////////////////////////////////////////////////////////////////////////////

  public void setNome(String nome)
  {
     this.nome = nome ;
  }

  public void setCognome(String cognome)
  {
     this.cognome = cognome;
  }

  public void setCod(String cod)
  {
     this.cod = cod;
  }

  public void setLibro(Libro L)
  {
    this.libri.add(L);
  }

  public String getNome()
  {
    return nome ;
  }

  public String getCognome()
  {
    return cognome;
  }

  public String getCod()
  {
    return cod;
  }


}
