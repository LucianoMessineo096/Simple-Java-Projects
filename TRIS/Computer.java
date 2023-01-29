/*implementare la vittoria*/

import java.util.Random;

public class Computer extends Giocatore
{
  public Computer()
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

      }

      System.out.println("\n");
    }
  }

  public void gioca2()
  {

    String s[][] = new int[3][3];

    /* funzioni randomiche per selezionare righe e colonne da parte del pc nel tris*/

    int rand_r = random.nextInt(3);
    int rand_c = random.nextInt(3);

    for(int i=1 ;i<=rand_r ; i++)
    {
      for(int j=1 ; j<=rand_c ; j++)
      {

        if(i==rand_r && j==rand_c)
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
  }

}
