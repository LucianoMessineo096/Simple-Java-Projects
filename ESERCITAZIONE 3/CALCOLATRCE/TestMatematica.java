public class TestMatematica
{
  public static void main(String args[])
  {
    Calcolatrice miaCalcolatrice = new Calcolatrice();

    int v1[] = miaCalcolatrice.generaVettore(3);
    int v2[] = miaCalcolatrice.generavettore(3);
    int v3[] = miaCalcolatrice.generavettore(5);

    int m1[][] = miaCalcolatrice.generaMatrice(3 , 5);
    int m2[][] = miaCalcolatrice.generaMatrice(3 , 5);
    int m3[][] = miaCalcolatrice.generaMatrice(3 , 4);

    int v1_sum = miaCalcolatrice.sommaVettori(v1[] , v2[]);
    int v2_sum = miaCalcolatrice.sommaVettori(v1[] , v3[]);

    int m1_sum = miaCalcolatrice.sommaMatrici(m1[][] , m2[][]);
    int m2_sum = miaCakcolatrice.sommaMatrici(m1[][] , m3[][]);

  }
}
