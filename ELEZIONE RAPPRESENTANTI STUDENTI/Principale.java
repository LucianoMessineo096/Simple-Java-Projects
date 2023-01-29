/*Scrivere le classi necessarie per la gestione di un seggio elettorale per le elezioni dei rappresentanti degli
studenti. Nel seggio possono votare gli studenti il cui elenco è noto. Ciascuno studente esprime la preferenza
di un candidato.
Potreste pensare di strutturare il programma con una classe Seggio, di cui istanzierete un’oggetto nel main(),
che al suo interno contiene un elenco di oggetti della classe Studente e un elenco di oggetti della classe
Candidato.
Gli studenti sono caratterizzati da matricola, codice di controllo (entrambi long), nome e cognome. I candidati,
che sono anche studenti, hanno anche il nome della lista a cui si appoggiano (una String).
Scrivete quindi un programma che all’avvio crea un’oggetto seggio e carica i dati di studenti e candidati
(prevedete semplicemente nel costruttore di default la creazione di tre candidati e una decina di studenti).
Dopo la creazione dell’oggetto il programma entra in un ciclo infinito in cui mostra una schermata che chiede
la matricola e il codice di controllo (che è stato dato all’elettore al posto della tradizionale scheda elettorale
cartacea), verifica che matricola e codice di controllo siano coerenti, stampa l’elenco dei candidati come elenco
numerato, permette all’elettore di esprimere la sua preferenza mediante il numero del candidato (uno 0 come
preferenza di candidato implica scheda bianca mentre un valore non valido verrà inteso come scheda nulla) e
archivia il voto espresso in forma anonima. Prevedete anche un meccanismo per cui uno studente che abbia
già votato non può votare nuovamente (definite voi le strutture dati più appropriate per farlo).
Scrivete infine un metodo (che verrà invocato dopo ciascun voto) per lo spoglio automatico delle schede in cui
il sistema stampa: il numero e le percentuali di votanti, il numero di schede bianche, il numero di schede nulle
e il numero di voti presi da ciascuna candidato.*/
////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;

public class Principale
{
  public static void main(String args[])
  {

    /*scannner*/
    Scanner sc = new Scanner(System.in);

    /*gestione*/

    System.out.println("**GESTIONE SEGGIO**");
    


  }
}
