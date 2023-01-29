public class Utente
{
  private int numero;
  private String nome;
  private String cognome;
  private double c_residuo;


  public Utente(int numero , String nome , String cognome , double c_residuo , )
  {
    setNumero();
    setNome();
    setCognome();
    setC_residuo();
    setAddebiti();
  }

  public String toString()
  {
    return "numero:"+ getNumero()+" "+"nome:"+ getNome()+" "+"cognome:"+getCognome()+" "+"credito residuo:"+getC_residuo()+" "+"addebiti:"+getAddebiti();
  }


  /////////////////////////////////////////////////////////////////////////////

  public int setNumero(int numero)
  {
    return this.numero=numero;
  }

  public String setNome(String nome)
  {
    return this.nome=nome;
  }

  public String cognome(String cognome)
  {
    return this.cognome=cognome;
  }

  public double setC_residuo(double c_residuo)
  {
    return this.c_residuo=c_residuo;
  }

  public double setAddebiti(double addebito)
  {
    for(int i=0 ; i<50 ; i++)
    {
      if(addebiti[i]==0)
      {
        addebiti[i]=addebito;
      }
    }
  }

  public int getNumero()
  {
    return numero;
  }

  public String getNome()
  {
    return nome;
  }

  public String getCognome()
  {
    return cognome;
  }

  public double getC_residuo()
  {
    return c_residuo;
  }



}
