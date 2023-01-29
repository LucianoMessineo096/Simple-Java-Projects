/*Dovete realizzare un elenco di cose da fare (to do list). A ciascun compito viene assegnata una priorità,
un numero intero da 1 a 9, e una descrizione. Quando l’utente digita il comando add priorità
descrizione il programma aggiunge una cosa da fare, mentre quando l’utente digita next il programma
elimina e visualizza la cosa da fare più urgentemente. Il comando quit termina il programma. Risolvete il
problema usando una PriorityQueue.*/
////////////////////////////////////////////////////////////////////////////////

/**
*
*  @author luciano messineo 0682968
*
**/

import java.util.*;

public class Principale
{
  public static void main(String args[])
  {

    /////////////////////////////////////////////////////////////////////

    Scanner sc = new Scanner(System.in);

    PriorityQueue<Elenco> elenco = new PriorityQueue<>();
    /////////////////////////////////////////////////////////////////////
    System.out.println("**elenco di cose da fare**");

    while(true)
    {
      System.out.pritnln("1.add priorita");
      System.out.println("2.next priorita");
      System.out.println("3.quit");

      int i =sc.nextInt();


      switch(i)
      {
        case 1: //add

        System.out.println("inserire livello priorita");
        int num = sc.nextInt();
        System.out.println("\n");
        System.out.println("inserire descrizione");
        String descr = sc.next();

        Elenco E = new Elenco(num , descr);

        elenco.add(E);

        System.out.println("priorita aggiunta in elenco");

        break;

        case 2: // next

        /*trova la cosa piu urgente */

        Object[] EV;
        EV = elenco.toArray();

        

        /*elimina tutte le altre*/

        break;

        case 3: //quit

        break;

        default :

        System.out.println("errore");

        break;
      }

    }


  }
}
