public class SommaVettori
{

  public static void main(String args[])
  {

//dichiarazione array
    int vettore1[];
    int vettore2[];
    int sommaVettori[];

//creazione array e istanzazione
    vettore1    = new int[3];
    vettore2    = new int[3];
    sommaVettori= new int[3];

//cicli inizializzazione array
    for(int i=0;i<3;i++)
    {
      vettore1=(int)(Math.random()*100);//cast
      vettore2=(int)(Math.random()*100);//cast
    }


//ciclo somma array
    for(int i=0;i<3;i++)
    {
      for(int j=0;j<3;j++)
      {
        sommaVettori=vettore1[i]+vettore2[j];
      }
    }

//stampa array sommaVettori
    for(int k=0;k<3;k++)
    {
      System.out.println(sommaVettori[k]);
    }


  }
}
