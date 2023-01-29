public class SommaMatrici
{
  public static void main(String args[])
  {

    //DICHIARAZIONE MATRICE

    int m1[][];
    int m2[][];
    int m_sum[][];

    //ISTANZIAZIONE MATRICE

    m1= new int[3][5];
    m2= new int[3][5];
    m_sum= new int[3][5];

    //INIZIALIZZAZIONE

    System.out.println("la matrice 1 e'");

    for(int i=0 ; i<3 ;i++)
    {
      for(int j=0 ; j<5 ;j++)
      {
        m1[i][j]=(int)(Math.random()*100);
        System.out.println(m1[i][j]);
      }
      System.out.println("\n");
    }

    System.out.println("la matrice 2 e'");

    for(int i=0 ; i<3 ;i++)
    {
      for(int j=0 ; j<5 ;j++)
      {
        m2[i][j]=(int)(Math.random()*100);
        System.out.println(m2[i][j]);

      }

    }

    //SOMMA

    System.out.println("la matrice somma e'");

    for(int i=0 ; i<3 ;i++)
    {
      for(int j=0 ; j<5 ;j++)
      {
        m_sum[i][j]= m1[i][j] + m2[i][j];
        System.out.println(m_sum[i][j]);
      }
      System.out.println("\n");
    }


  }
}
