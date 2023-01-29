/*Nei sistemi operativi con interfaccia grafica gli eventi generati dall’utente (col mouse o con la tastiera) vengono
trattati mediante una struttura dati di tipo coda, in cui gli elementi vengono inseriti in coda ed estratti dalla testa
(modalità FIFO).
Scrivere le classi necessarie per la gestione di una coda di eventi.
Gli eventi possono essere di due tipi, EventoTastiera ed EventoMouse che derivano dalla classe astratta
Evento. Ogni evento sarà caratterizzato da un identificativo (int) e da una descrizione testuale (String).
In aggiunta gli oggetti EventoTastiera avranno il codice del tasto premuto (int) e lo stato dei modificatori
(int) mentre gli oggetti EventoMouse avranno la posizione del mouse sullo schermo (due int) e lo stato di
pressione dei tasti del mouse (int). Implementate nelle classi Evento, EventoTastiera ed EventoMouse
tutti i metodi che ritenete utili.
Scrivete un programma che crea una coda di eventi e, all’interno di un menu testuale, permette di creare e
inserire un nuovo evento di tastiera, creare e inserire un nuovo evento del mouse e di prelevare e visualizzare
un evento.*/

////////////////////////////////////////////////////////////////////////////////

import java.util.*;


public class Principale
{

  public static void main(String args[])
  {

    Scanner sc = new Scanner(System.in);

    ArrayDeque<Evento> Evento = new ArrayDeque<>();


    System.out.println("**EVENTI**");

    while(true)
    {

      System.out.println("1.inserire evento tastiera alla coda");
      System.out.println("2.inserire evento mouse alla coda");
      System.out.println("3.visualizza evento");
      System.out.println("4.rimuovi dalla coda");

      int i= sc.nextInt();

      switch(i)
      {

        case 1: /*evento tastiera*/

        System.out.println("inserire identificativo");
        int id = sc.nextInt();
        System.out.println("\n");

        System.out.println("inserire descrizione");
        String descr = sc.next();
        System.out.println("\n");

        System.out.println("inserire numero tasto");
        int tasto = sc.nextInt();
        System.out.println("\n");

        System.out.println("inserire stato modificatore");
        int stato = sc.nextInt();
        System.out.println("\n");

        EventoTastiera ev = new EventoTastiera(id , descr , tasto , stato);

        Evento.addFirst(ev);

        System.out.println("evento aggiunto alla coda");

        break;

        case 2: /*evento mouse*/

        System.out.println("inserire identificativo");
        int Id = sc.nextInt();
        System.out.println("\n");

        System.out.println("inserire descrizione");
        String de = sc.next();
        System.out.println("\n");

        System.out.println("inserire posizione x");
        int x = sc.nextInt();
        System.out.println("\n");

        System.out.println("inserire posizione y");
        int y = sc.nextInt();
        System.out.println("\n");

        System.out.println("inserire stato pressione tasti");
        int statop = sc.nextInt();
        System.out.println("\n");

        EventoMouse evento = new EventoMouse(Id , de , x , y , statop);

        Evento.addFirst(evento);

        System.out.println("evento aggiunto alla coda");


        break;

        case 3: /*visualizza evento*/

        Object[] EV;
        EV=Evento.toArray();

        for(Object o : EV)
        {
          System.out.println(o.toString());
        }


        break;

        case 4: /*rimuovi */

        Evento.removeLast();

        System.out.println("evento rimosso");

        break;

        default:

        System.out.println("errore");

        break;
      }
    }
  }
}
