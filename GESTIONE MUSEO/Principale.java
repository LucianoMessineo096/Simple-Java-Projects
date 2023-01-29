/*Scrivete le classi necessarie per la gestione delle opere d’arte dei musei. Un oggetto della classe Museo
conterrà nome, indirizzo e l’elenco delle opere d’arte presenti nel museo.
Scrivete una gerarchia per rappresentare i seguenti oggetti: OperaDArte, Scultura, Dipinto. Tutti gli oggetti
devono avere un titolo, un autore (String) e la dataDiCreazione (per semplicità un oggetto della classe String)
inizializzati dal costruttore. Ogni Scultura ha in aggiunta il materiale e l’altezza mentre ogni Dipinto ha la
tecnica (olio, tempera, litografia, serigrafia, china) e le dimensioni. Tutti i membri devono essere incapsulati.
La classe Museo deve avere un metodo per stampare la lista delle opere contenute e metodi per l’inserimento
e la cancellazione di opere d'arte.
Utilizzate le vostre classi in un programma che crea un oggetto Museo e mostra un menù interattivo testuale
in cui si dà all’utente la possibilità di aggiungere nuovi elementi da tastiera, stampare i dettagli di tutti gli oggetti
presenti nel museo, eliminare un elemento individuato in base al titolo, stampare i dettagli di un'opera
individuata attraverso il titolo.*/
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;


public class Principale
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);

    System.out.println("**GESTIONE MUSEO**");

    System.out.println("inserire nome museo");
    String nome = sc.next();
    System.out.println("inserire indirizzo museo");
    String indirizzo = sc.next();

    Museo m = new Museo(nome , indirizzo);


    while(true)
    {
      System.out.println("quale operazione si desidera effettuare?");
      System.out.println("1.inserire opera");
      System.out.println("2.eliminare opera");
      System.out.println("3.stampa dettagli opera");
      System.out.println("4.esci");

      int scelta = sc.nextInt();

      switch(scelta)
      {
        case 1: /*inserimento*/

        m.inserimentoOpera();
        break;

        case 2: /*eliminazione elemento in base al titolo*/

        m.cancellazioneOpera();
        break;

        case 3: /*stampa dettagli opera individuata attraverso titolo*/

        m.stampaDettagliOpera();

        case 4: /*esci*/

        break;

        default:

          System.out.println("inserimento non valido");




      }
    }
  }
}
