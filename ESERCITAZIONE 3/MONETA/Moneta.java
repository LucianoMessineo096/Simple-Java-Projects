/*Creare una classe Moneta caratterizzata da due facce (Testa o Croce). Utilizzando la funzione di libreria
Math.random() (restituisce un double fra 0.0 e 1.0), creare il metodo lancia() che restituisca un numero
intero (0 per Testa e 1 per Croce)].
Creare una classe TestMoneta dotata del metodo main() in cui s’istanzia un oggetto della classe
Moneta. Simulare il lancio della moneta per 50 volte e stampare un messaggio con il numero delle volte
in cui è uscito Croce.*/

public class Moneta
{
  public int Testa;
  public int Croce;

  public int lancia()
  {
    if(Math.random()<0.5)
    {
      return 0;
    }
    else
    {
      return 1;
    }
  }
}
