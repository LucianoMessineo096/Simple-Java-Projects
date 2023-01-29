public class Studente extends Persona
{
  private long matricola;
  private String corsoDiLaurea;

  public Studente(String nome,String cognome, int eta, long matricola)
  {
    this(nome,cognome,eta);
    setMatricola(matricola);
    System.out.println("costruttore Studente(string string int)");

  }

  public Studente()
  {
    this("sconosciuto","sconosciuto",0,-1);
    System.out.println("costruttore studente()");
  }

  public Studente(String nome, String cognome,int eta)
  {
    super(nome, cognome, eta);
    System.out.println("costruttore Studente(string string int)");
  }

  public void setMatricola(long matricola)
  {
    this.matricola=matricola;
  }

  public void Iscrivi(String corsoDiLaurea)
  {
    this.corsoDiLaurea=corsoDiLaurea;
  }

  publis String toString()
  {
    return matricola +""+ super.toString();
  }



}
