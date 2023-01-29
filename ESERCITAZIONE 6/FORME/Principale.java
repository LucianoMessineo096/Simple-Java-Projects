/*Costruire una gerarchia di classi che consenta di rappresentare le seguenti entità: Shape, Circle,
Rectangle, Square.
Shape è caratterizzato da una stringa rappresentante un colore (color) e da una variabile boolean che
indica se è una figura piena o no (filled).
Circle è caratterizzato da un raggio (radius). Rectangle è caratterizzato da width e length. Square è un
caso particolare di Rectangle in cui base e altezza sono uguali.
In ogni classe, prevedere opportuni metodi per l'incapsulamento dei dati e metodi per determinare area e
perimetro (nel caso di un Circle il perimetro sarà la circonferenza). Prevedere anche i metodi toString().*/
////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;


public class Principale
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);


    System.out.println("**FORME**");

    while(true)
    {
      System.out.println("1.RETTANGOLO");
      System.out.println("2.CERCHIO");

      int i=sc.nextInt();

      switch(i)
      {
        case 1: /*rectangle*/

        System.out.println("\n");
        System.out.println("inserire altezza");
        double w = sc.nextDouble();
        System.out.println("inserire lunghezza");
        double l = sc.nextDouble();
        System.out.println("inserire colore");
        String c =sc.next();

        if(w==l)
        {

          System.out.println("!base e altezza uguali , si creerà un quadrato");


          System.out.println("inserire 1 se pieno o 2 se vuoto");
          int full = sc.nextInt();

          if(full==1)
          {
            Square Q = new Square(c , true , w , l);
            System.out.println("creato quadrato pieno:" +" "+ Q.toString());

            System.out.println("Area:" +" "+ Q.Area(w ,l) +" "+ "Perimetro:" +" "+ Q.Perimetro(w));
          }
          else if(full==2)
          {
            Square Q = new Square(c , false , w , l);
            System.out.println("creato quadrato vuoto:" +" "+ Q.toString());

            System.out.println("Area:" +" "+ Q.Area(w ,l) +" "+ "Perimetro:" +" "+ Q.Perimetro(w));
          }
          else
          {
            System.out.println("errore");
          }

         }
         else
         {
           System.out.println("inserire 1 se pieno o 2 se vuoto");
           int full = sc.nextInt();

           if(full==1)
           {
             Rectangle R = new Rectangle(c , true , w , l);
             System.out.println("creato rettangolo pieno:" +" "+ R.toString());

             System.out.println("Area:" +" "+ R.Area(w ,l) +" "+ "Perimetro:" +" "+ R.Perimetro(w ,l));
           }
           else if(full==2)
           {
             Rectangle R = new Rectangle(c , false , w , l);
             System.out.println("creato rettangolo vuoto:" +" "+ R.toString());

             System.out.println("Area:" +" "+ R.Area(w ,l) +" "+ "Perimetro:" +" "+ R.Perimetro(w ,l));
           }
           else
           {
             System.out.println("errore");
           }

          }

          break;


        case 2: /*circle*/

        System.out.println("\n");
        System.out.println("inserire raggio");
        double r = sc.nextDouble();

        System.out.println("inserire colore");
        String col =sc.next();

        System.out.println("inserire 1 se pieno o 2 se vuoto");
        int full = sc.nextInt();

        if(full==1)
        {
          Circle C = new Circle(col , true , r);
          System.out.println("creato cerchio pieno:" +" "+ C.toString());

          System.out.println("Area:" +" "+ C.Area(r) +" "+ "Perimetro:" +" "+ C.Perimetro(r));
        }
        else if(full==2)
        {
          Circle C = new Circle(col , false , r);
          System.out.println("creato cerchio vuoto:" +" "+ C.toString());

          System.out.println("Area:" +" "+ C.Area(r) +" "+ "Perimetro:" +" "+ C.Perimetro(r));
        }
        else
        {
          System.out.println("errore");
        }



        default:

        System.out.println("errore");

      }
    }
  }
}
