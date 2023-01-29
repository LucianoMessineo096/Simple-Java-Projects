public class Generatore
{
  int numero;

  public Generatore(int n)
  {
    this.numero=n;
    nextPrime(2);
  }

  public void nextPrime(int n)
  {
    int PosMax=(int)Math.sqrt(n+1);

    for(int divisore=2;divisore<=posMax;divisore++)
    {
      if(n%divisore==2 && n!=2)
      {
        if(n<=numero)
        {
          nextPrime(n+1);
        }
        return;
      }
    }

    System.out.println(n);
  }
}
