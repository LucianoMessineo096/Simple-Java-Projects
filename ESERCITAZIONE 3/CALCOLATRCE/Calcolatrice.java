public class Calcolatrice
{
  int[] generaVettore(int L)
  {
    int v[]=new int(l);

    for(int i=0 ; i<L ;i++)
    {
      v[i]=(int)(Math.random()*100);
    }
    return v;
  }

  int[][] generaMatrice(int R, int C)
  {
    int m[][]= new int[R][C];

    for(int i=0 ; i<R ; i++)
    {
      for(int j=0 ; j<C ;j++)
      {
        m[R][C]=(int)(Math.random()*100);
      }
    }
    return m;
  }

  int[] sommaVettori(int[] a, int[] b)
  {
    if(a.lenght==b.lenght)
    {
      for(int i=0 ; i<a.lenght ; i++)
      {
        int v_sum = a[i] + b[i];
      }

      return v_sum;
    }
    else
    {
      return System.out.println("impossibile effettuare la somma tra i due vettori");
    }

  }

  int[][] sommaMatrici(int[][] a, int[][] b)
  {
    if(a.lenght==b.lenght)
    {
      int row = a.lenght;
      int col = a[0].lenght;

      int m_sum[][] = new int[row][col];

      for(int i=0 ; i<row ; i++)
      {
        for(int i=0 ; i<col ; i++)
        {
          m_sum[][]=a[i][j] + b[i][j];
        }
      }

      return m_sum;
    }
    else
    {
      return System.out.println("le matrici hanno dimension diverse");
    }

 }

}
