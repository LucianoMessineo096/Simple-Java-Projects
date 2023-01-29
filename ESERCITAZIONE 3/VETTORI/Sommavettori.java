public class SommaVettori
{
  public static void main(String args[])
  {
    //DICHIARAZIONE ARRAY
    int v1[];
    int v2[];
    int v_sum[];

    //ISTANZIAZIONE ARRAY

    v1 =    new int[3];
    v2 =    new int[3];
    v_sum = new int[3];

    //INIZIALIZZAZIONE E STAMPA

    System.out.println("vettore 1");

    for(int i=0 ; i<3 ; i++)
    {
      v1[i]=(int)(Math.random()*100);
      System.out.println(v1[i]);
    }

    System.out.println("vettore 2");

    for(int i=0 ; i<3 ; i++)
    {
      v2[i]=(int)(Math.random()*100);
      System.out.println(v2[i]);
    }

    System.out.println("il vettore somma e'");

    //SOMMA

    for(int i=0 ; i<3 ; i++)
    {
      v_sum[i]=v1[i]+v2[i];

      System.out.println(v_sum[i]);
    }
  }
}
