public class TestMoneta
{
  public static void main(String args[])
  {
    Moneta m= new Moneta();

    int test;
    int Testa=0;
    int Croce=0;

    for(int i=0; i<50; i++)
    {
      test=m.lancia();

      if(test==1)
      {
        Croce++;
      }
      else
      {
        Testa++;
      }
    }

    System.out.println("Testa e' uscito"+ Testa+ "Croce e' uscito"+ Croce);
  }
}
