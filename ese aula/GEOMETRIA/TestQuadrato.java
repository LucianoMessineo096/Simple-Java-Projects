public class TestQuadrato
{
  public static void main(String args)
  {
    Quadrato q= new Quadrato();//q e l'indirizzo di memoria dell'oggetto Quadrato

    System.out.println("Area:"+ q.area());
    System.out.println("Perimetro:"+ q.perimetro());

    q.setLato(5);
    System.out.println("Area:"+ q.area());
    System.out.println("Perimetro:"+ q.perimetro());//da sistemare con perimetro

    System.out.println("--------------------");

    Quadrato q2= new Quadrato(10);
    System.out.println("Area:"+ q2.area());
    System.out.println("Perimetro:"+ q2.perimetro());//da sistemare con perimetro

    System.out.println("-----------------------------------");

    Rettangolo r= new Rettangolo(5,3);
    System.out.println(r.toString());//passo il riferimento dell'oggetto a toString
  /*  System.out.println("Area:"+ r.area());
    System.out.println("Perimetro:"+ r.perimetro());//da sistemare con perimetro
*/
  }
}
