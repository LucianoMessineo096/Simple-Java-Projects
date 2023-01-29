public class TestMoneta
{
  public static void main(String args[])
  {
    Moneta miaMoneta=new Moneta();//oggetto moneta

    int numCroce=0;

    for(int i=0;i<50;i++)
    {
      if(miaMoneta.lancia()==1)
      {
        numCroce++;
      }

      System.out.println("Numero di croce:"+ numCroce);
    }
  }
}
