/*
Una pizzeria ha necessità di digitalizzare il processo di preparazione delle pizze e necessita quindi di un
programma che gestisca le varie fasi del processo. Per ciascuna pizza da preparare vengono memorizzati il
tipo di pizza (codificato con un in), eventuali aggio-nzioni (String), eventuali note (String) e un numero
progressivo, generato dal sistema. Le informazioni vengono memorizzate in una coda FIFO.
II pizzaiolo, che accede allo stesso sistema, preleva un elemento dalla coda, aggiunge eventuali note di
lavoraz

.ione (ad esempio indisponibilità di aggiunzioni richieste) e salva le informazioni nella lista delle pizze
in lavorazione.
Non appena la pizza e pronta la mete in una scatola in cui scrive il numero progressivo della pizza.
L'addetto alle consegne, non appena vede arrivare una pizza pronta sul banco, legge il numero progressivo,
accede al sistema, cerca la pizza nella lista delle pizze in lavorazione e la marca come consegnata.
Scrivete quindi un programma che crea una coda FIFO deve memorizzare le pizze da preparare e una lista
deve memorizzare le pizze in lavorazione e, all'interno di un meno testuale, permette di 1) inserire da
tastiera una richiesta di preparazione pizza, 2) prelevare una richiesta di preparazione pizza dalla coda e
salvarla nella lista della pizze in lavorazione dopo avei inserito eventuali note e 3) cercare un elemento dalla
lista delle pizze in lavorazione in base al progressivo e marcarla come consegnata.

Funzionalità opzionali implementare la coda come coda con priorità che da precedenza alle pizze che
hanno come note il testo "SocialFood", calcolare e visualizzare il numero di pizze completate per ciascun
tipo, implementare la funzione per la serializzazione e salvataggio su file delle strutture dati.*/
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

    ///////////////////////////////////////////////////////////////

    ArrayDeque<Pizza> pizze = new ArrayDeque<>();
    ArrayList<Pizzaiolo> pizza_lavorazione = new ArrayList<>();

    Scanner sc = new Scanner(System.in);
    ///////////////////////////////////////////////////////////////

    while(true)
    {

      System.out.println("1.ordinazione");
      System.out.println("2.mettere in preparazione");
      System.out.println("3.consegna");

      int i = sc.nextInt();

      switch(i)
      {
        case 1: //aggiunzione

        try
       {
         System.out.println("inserire numero pizza");
         int tipo =sc.nextInt();
         System.out.println("\n");
         System.out.println("inserire aggiunzione");
         String agg = sc.next();
         System.out.println("\n");
         System.out.println("inserire note");
         String note  =sc.next();
         System.out.println("\n");

         Pizza p =new Pizza(tipo , agg , note);

         pizze.addFirst(p);

         System.out.println("pizza aggiunta");
       }
       catch(Exception x)
       {
         System.out.println("errore");
       }



        break;

        case 2: //prendere pizza dalla coda e metterla in lista di preparazione

        /*pizza_lavorazione.add(pizza.getLast());*/

        try
        {
          String notap = sc.nextLine();

          Pizzaiolo pz = new Pizzaiolo(pizze.getFirst().getTipo() , pizze.getFirst().getAgg() , pizze.getFirst().getNote() , notap , false);

          pizza_lavorazione.add(pz);

          System.out.println("pizza in lavorazione");
        }
        catch(InputMismatchException y)
        {
          System.out.println("errore");
        }



        break;

        case 3: //cerco pizza in lavorazione e consegno

        try
        {
          int Tipo = sc.nextInt();

          for(Pizzaiolo pi : pizza_lavorazione)
          {
            if(pi.getTipo() == Tipo)
            {
              boolean consegna = true;
              pi.setConsegna(consegna);

              System.out.println("pizza consegnata");
            }
          }
        }
        catch(InputMismatchException z)
        {
          System.out.println("errore");
        }



        break;

        default :

        System.out.println("errore");

        break;
      }
    }
  }
}
