/*Usate una pila per invertire le parole di una frase. Continuate a leggere parole, aggiungendole alla pila,
fin quando non trovate una parola che termina con un punto. A questo punto estraete tutte le parole dalla
pila e visualizzatele. Realizzate la pila tramite una Deque.*/
///////////////////////////////////////////////////////////////////////////////

/**
*
*  @author Luciano Messineo 0682968
*
**/

import java.util.*;
import java.lang.*;



public class Principale
{
  public static void main(String args[])
  {
    ////////////////////////////////////////////////////////

    Scanner sc = new Scanner(System.in);

    ArrayDeque<Parola> parola = new ArrayDeque<>();

   ////////////////////////////////////////////////////////

    System.out.println("**gestione pila**");

    while(true)
    {


        System.out.println("inserire parola");
        String word = sc.next();

        Parola P = new Parola(word);

        parola.addFirst(P);

        System.out.println("\n");
        System.out.println("parola aggiunta");

        Object[] EV;
        EV=parola.toArray(); //crea un array della pila permettendomi di poterlo ciclare//

        for(Object o : EV)
        {
          
        }



    }
  }
}
