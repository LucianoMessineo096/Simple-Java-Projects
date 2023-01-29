java.util.Scanner

public class Principale
{
  public static void main(String args[])
  {

    /* INSERIMENTO*/

    System.out.println("inserire ascissa e ordinata del Punto A");

    Scanner sc = new Scanner(System.in);
    double xa = sc.nextDouble();
    double ya = sc.nextDouble();

    Punto A =new Punto(xa,ya);

    System.out.println("inserire ascissa e ordinata del Punto B");

    Scanner sc = new Scanner(System.in);
    double xb = sc.nextDouble();
    double yb = sc.nextDouble();

    Punto B =new Punto(xb,yb);

    Sistem.out.println("punto (A)"+"("+ xa +")"+"("+ ya +")");
    Sistem.out.println("punto (B)"+"("+ xb +")"+"("+ yb +")");

    /*DISTANZA TRA DUE PUNTI*/

    double d_x= xb-xa;
    double d_y= yb-ya;

    double pd_x=Math.pow(d_x,double 1/2);
    double pd_y=Math.pow(d_y,double 1/2);

    double distance=Math.sqrt(((pd_x)+(pd_y)));

    System.out.println("la distanza tra i due punti e' " + distance);

    /*PUNTO MEDIO*/

    double xc= (d_x)/2;
    double yc= (d_y)/2;

    Punto C = new Punto(md_x,md_y);

    Sistem.out.println("punto medio (C)"+"("+ xc +")"+"("+ yc +")");

    /*Controllo sui punti uguali*/

    






  }
}
