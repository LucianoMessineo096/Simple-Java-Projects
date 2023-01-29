/*SIMULAZIONE PARTITA DI TENNIS
Il tennis è uno sport che vede opposti due giocatori (incontro singolare). Gli incontri hanno dei punteggi che si
suddividono in partite, in inglese set; in base ai tipi di torneo gli incontri sono al meglio dei 3 o 5 set; una partita
è costituita da 6 o più giochi, (games). Se i giocatori sono sul punteggio di 6-6 si continua finchè uno dei due
giocatori vince con due giochi di scarto.
Scrivete le classi necessarie per la simulazione di una partita di singolare di tennis al meglio dei 3 set (la partita
viene giocata da due giocatori e vince chi conquista 2 set su 3).
La classe Giocatore deve contenere la posizione in classifica del giocatore (int), nome e cognome (String).
La classe Incontro al suo interno contiene due oggetti della classe Giocatore, 3 oggetti della classe Set ed il
metodo per effettuare la simulazione (quindi per giocare i set finchè uno dei due giocatori ne ha vinti 3).
La classe Set conterrà la sequenza dei risultati parziali del set (ad esempio: 0-0, 1-0, 1-1, 2-1, 3-1, 3-2, 4-2,
4-3, 5-3, 6-3) ed il metodo per effettuare la simulazione. La simulazione di un set avviene mediante la
generazione di numeri casuali che stabiliscono se un gioco è stato vinto dal primo o dal secondo giocatore e
dalla verifica dell’avvenuta vittoria da parte di un giocatore.
Il programma in particolare deve avere le seguenti funzionalità:
1) creare due oggetti Giocatore
2) creare un oggetto Incontro con i due giocatori appena creati
3) avviare la simulazione dell’incontro
a. avviare la simulazione del primo set
b. avviare la simulazione del secondo set
c. se necessario avviare la simulazione del terzo set
4) stampare il risultato dettagliato di tutti i set giocati
5) stampare i dati del vincitore
Per esempio una esecuzione del programma potrebbe essere la seguente:
Inserisci dati giocatore 1: Mario Rossi 25
Inserisci dati giocatore 2: Luca Neri 32
Inizia la partita!
Simulazione set 1: vince Mario Rossi
Simulazione set 2: vince Luca Neri
Simulazione set 3: vince Luca Neri
Ha vinto la partita Luca Neri
Set 1: 0-0, 1-0, 2-0, 2-1, 3-1, 4-1, 5-1, 6-1
Set 2: 0-0, 1-0, 1-1, 1-2, 1-3, 2-3, 3-3, 3-4, 4-4, 5-4, 5-5, 5-6, 6-6, 6-7, 6-8
Set 3: 0-0, 0-1, 0-2, 0-3, 0-4, 1-4, 2-4, 2-5, 3-5, 3-6*/
///////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;


public class Principale
{
  public static void main(String args[])
  {
    System.out.println("**PARTITA DI TENNIS**");

    /*scanner*/

    Scanner sc = new Scanner(System.in);
    int i = sc.nextInt();





    /*incontro*/

    System.out.println("inserire:");
    System.out.println("1.disputa un incontro con 3 set 1 vs 1");
    System.out.println("2.disputa un torneo");

    switch(i)
    {
      case 1: /*incontro*/

      /*inserimento giocatori*/

      System.out.println("inserire dati giocatore 1");

      System.out.println("Nome");
      String nomeA = sc.next();

      System.out.println("Cognome");
      String cognomeA = sc.next();

      System.out.println("Eta");
      int etàA = sc.nextInt();

      System.out.println("Posizione in classifica");
      int pos_classA = sc.nextInt();

      Giocatore A = new Giocatore(nomeA , cognomeA , etaA , pos_classA);

      System.out.println("inserire dati giocatore 2");

      System.out.println("Nome");
      String nomeB = sc.next();

      System.out.println("Cognome");
      String cognomeB = sc.next();

      System.out.println("Eta");
      int etàB = sc.nextInt();

      System.out.println("Posizione in classifica");
      int pos_classB = sc.nextInt();

      Giocatore B = new Giocatore(nomeB , cognomeB , etaB , pos_classB);




    }
  }
}
