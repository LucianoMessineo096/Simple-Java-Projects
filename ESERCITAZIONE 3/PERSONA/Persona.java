/*Scrivere un programma con i seguenti requisiti.
§ Utilizza una classe Persona che dichiara le variabili nome, cognome, eta (età). Si dichiari inoltre un
metodo toString() che restituisca in una stringa le informazioni sulla persona in questione.
Ricordarsi di utilizzare le convenzioni e le regole per i nomi di classi, metodi e variabili descritte a
lezione.
§ Utilizza una classe Principale che, nel metodo main(), istanzia due oggetti chiamati persona1 e
persona2 della classe Persona, inizializzando per ognuno di essi i relativi campi nome, cognome,
eta adoperando l’operatore dot.
§ Dichiarare un terzo reference (persona3) che punti persona1. Controllare che effettivamente
persona3 punti all’oggetto voluto, stampando i campi di persona3 sempre mediante l’operatore dot
e che modificando persona3 si modifica persona1.*/


public class Persona
{
  private String nome;
  private String cognome;
  private int età;

  //////////////COSTRUTTORE///////////////////

  public Persona(String nome,String cognome,int età)
  {
    setNome();
    setCognome();
    setEtà();
  }

  public Persona()
  {

  }

  ///////////INCAPSULAMENTO//////////////////

  public void setNome(String nome)
  {
    this.nome=nome;

  }

  public void setCognome(String cognome)
  {
    this.cognome=cognome;

  }

  public int setEtà(int età)
  {
    if(età<=0||eta>150)
    {
      this.età=0;
    }
    else
    {
      this.età=età;
    }

    return this;

  }



/////////////////////////////////
  public String toString()
  {
    return nome+""+cognome+""+"("+età")";

  }



}
