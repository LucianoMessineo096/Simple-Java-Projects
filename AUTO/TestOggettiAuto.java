import java.util.Scanner;

public class TestOggettiAuto
{
  public static void main(String args[])
  {
    Auto1 a= new Auto1();

    System.out.println("inserire quantita' di carburante da immettere");

     Scanner sc = new Scanner(System.in);
     int i = sc.nextInt();

     a.setCarburante(i);

     System.out.println("carburante immesso" + a.getCarburante());




  }
}
