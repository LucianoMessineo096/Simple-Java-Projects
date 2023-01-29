/*
Una biblioteca ha dato l’incarico di implementare un software per la gestione
dei prestiti di libri. Si costruiscano le seguenti classi:
- Data: serve per costruire l orologio virtuale. Implementare tre
variabili d’istanza e i metodi: int getDay(), int getMonth(), int
getYear(), void setDay(int aDay), void setMonth(int aMonth), void
setYear(int aYear), void nextYear(), Boolean isEqual(Data date).
- Abbonato: costruisce l’oggetto Utente. Essa ha due variabili
d’istanza e i seguenti metodi: String getCognome(), String
getNome(), void setCognome(String unCognome), void setNome(String
unNome)
- Archivio: essa implementa due arrayList, una contenente il numero di
abbonati alla biblioteca e l’altra dei libri presenti, oltre ad un
riferimento alla data, e i seguenti metodi: void nuovoLibro(Libro
l), Data scadenza(Data date), int presta(Libro l, Abbonato a), void
aggiorna() [si riferisce all’aggiornamento dell’ora], int
numLibri(Abbonato anAbb) [restituisce il numero di libri posseduti
da un dato utente]
*/
///////////////////////////////////////////////////////////////////////////////

/**
*
* @author luciano messineo 0682968
*
**/

import java.util.*;

public class Principale
{
  public static void main(String args[])
  {
    ///////////////////////////////////////////////////////////////////////
    Scanner sc = new Scanner(System.in);

    ArrayList<Abbonato> abbonati = new ArrayList<>();
    ArrayList<Libro> libri_in_prestito = new ArrayList<>();


    ///////////////////////////////////////////////////////////////////////

    while(true)
    {
      System.out.println("1.PRESTITO");
      System.out.println("2.CONSEGNA");
      System.out.println("3.STATO PRESTITI");

      int i = sc.nextInt();

      switch(i)
      {
        case 1: //aggiungere libro e abbonato che hanno preso preso i libri

        System.out.println("INSERIRE DATI ABBONATO");
        System.out.println("\n");
        System.out.println("inserire nome ");
        String nome = sc.next();
        System.out.println("\n");
        System.out.println("inserire cognome");
        String cognome = sc.next();
        System.out.println("inserire codice identificativo");
        String cod = sc.next();
        System.out.println("\n");

        System.out.println("INSERIRE DATI LIBRO");
        System.out.println("\n");
        System.out.println("inserire titolo");
        String titolo = sc.next();
        System.out.println("\n");
        System.out.println("inserire autore");
        String autore = sc.next();
        System.out.println("\n");
        System.out.println("inserire isbn");
        String isbn = sc.next();
        System.out.println("\n");

        Libro L = new Libro(titolo , autore , isbn);
        Abbonato A = new Abbonato(nome , cognome , cod , L);

        abbonati.add(A);
        libri_in_prestito.add(L);

        System.out.println("abbonato inserito");




        break;

        case 2: // restituzione libro

        System.out.println("inserire codice abbonato");
        String Codice = sc.next();
        System.out.println("\n");

        for(Abbonato abb : abbonati)
        {
          if(abb.getCod().equals(Codice))
          {
            System.out.println("inserire isbn libro da restituire");
            String c_book  = sc.next();
            System.out.println("\n");

            abb.removeLibro(c_book);

            System.out.println("libro restituito");
          }
        }

        break;

        case 3: //stampa stato libri in PRESTITO

        for(Abbonato a : abbonati)
        {
          System.out.println(a.toString());
        }

        break;

        default :

        System.out.println("errore");

        break;
      }
    }
  }
}
