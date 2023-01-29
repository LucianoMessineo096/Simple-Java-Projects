import java.util.Scanner;

public class TestQuadrato
{
  public static void main(String args[])
  {
    Quadrato A= new Quadrato();

    System.out.println("inserire lunghezza lato");
    Scanner sc = new Scanner(System.in);
    int i = sc.nextInt();

    A.setLato(i);
    
  }
}
