/*Creare una classe Point2D per rappresentare punti geometrici in 2D. Point2D incapsula le coordinate x
e y. Oltre ai soliti metodi per l'incapsulamento, prevedere un metodo toString() che descriva il punto come
segue:"(<x>, <y>)".
Creare una classe Line che permetta di rappresentare una retta passante per due punti (Line memorizza
due punti in oggetti della classe Point2D).*/
///////////////////////////////////////////////////////////////////////////////


public class Principale
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);


    System.out.println("**POINT2D**");

    System.out.println("inserire ascissa del 1° punto");
    double x1 = sc.nextDouble();
    System.out.println("inserire ordinata del 1° punto");
    double y1 = sc.nextDouble();

    Point2D P1 = new Point2D(x1 , y1);

    System.out.println("inserire ascissa del 2° punto");
    double x2 = sc.nextDouble();
    System.out.println("inserire ordinata del 2° punto");
    double y2 = sc.nextDouble();

    Point2D P2 = new Point2D(x2 , y2);

    System.out.println("retta passante per i punti scelti");

    

  }
}
