public class Auto1
{
  private int carburante;

  ////INCAPSULAMENTO////

  public int setCarburante(int liv_carb)
  {
    if(liv_carb < 0)
    {
      System.out.println("livello di carburante basso");
      return carburante=0;
    }
    else if (liv_carb > 50)
    {
      System.out.println("livello di carburante eccedente");
      return carburante=50;
    }
    else
    {
      System.out.println("livello di carburante corretto");
      return carburante=liv_carb;
    }

  }

  public int getCarburante()
  {
    return carburante;
  }



}
