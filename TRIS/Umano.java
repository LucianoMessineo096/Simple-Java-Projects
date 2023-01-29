public class Umano extends Giocatore
{

  /*costruttore*/

  public Umano()
  {

  }

  /*metodi*/

  public void gioca1(int r , int c)
  {
    String s[][] = new int[3][3];

    for(int i=1;i<=r;i++)
    {
      for(int j=1;j<=c;j++)
      {

        if(i==r && j==c)
        {
          s[i][j]='X';
          System.out.println("X");
        }
        else
        {
          System.out.println(" ");
        }

        /*parte decisionale per la vittoria*/



      

      }

      System.out.println("\n");
    }

  }

  public void gioca2(int row , int col)
  {

    String s[][] = new int[3][3];

    for(int i=1;i<=row;i++)
    {
      for(int j=1;j<=col;j++)
      {

        if(i==row && j==col)
        {
          s[i][j]='O';
          System.out.println("O");
        }
        else
        {
          System.out.println(" ");
        }

      }

      System.out.println("\n");
    }


    /*implementare la vittoria*/
  }







}
