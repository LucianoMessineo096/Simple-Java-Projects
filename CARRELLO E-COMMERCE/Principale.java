/* UN SITO DI E-COMMERCE HA BISOGNO DELLE FUNZIONALITA PER LA GESTIONE DEL CARRELLO.
SCRIVETE LE CLASSI NECESSARIE PER FORNIRE QUESTE FUNZIONALITA' E VERIFICATENE IL CORRETTO FUNZIONAMENTO CON UN SEMPLICE PROGRAMMA DI TEST
GLI ARTICOLI POSSONO ESSERE LIBRI O VIDEOGIOCHI. PER CIASCUN ARTICOLO CHE SI PUO AGGIUNGERE AL CARRELLO LE INFORMAZIONI DA MEMORIZZARE SONO
CODICE NUMERICO, UNA DESCRIZIONE TESTUALE E IL COSTO. IN AGGIUNTA I LIBRI HANNO TITOLO E AUTORE , MENTRE I VIDEOGIOCHI HANNO LA PIATTAFORMA.
LA CLASSE PRINCIPALE DEVE ARCHIVIARE LE INFORMAZIONI DI UN CARRELLO IN UNA OPPORTUNA STRUTTURA DATI E DEVE FORNIRE METODI PER AGGIUNGERE UN LIBRO,
AGGIUNGERE UN VIDEOGIOCO, RIMUOVERE UN ARTICOLO, STAMPARE IL CONTENUTO DETTAGLIATO DELL'INTERO CARRELLO, VISUALIZZARE IL COSTO DELL'INTERO CARRELLO,
VISUALIZZARE IL COSTO TOTALE DEI SOLI LIBRI E VIDEOGIOCHI.
*/
import java.util.*;

public class Principale
{
  public static void main(String args[])
  {
    /*scanner*/

    Scanner sc= new Scanner(System.in);

    /*struttura dati*/

    ArrayList Carrello = new ArrayList();

    /************************************************************/
    /*MAIN*/
    /************************************************************/

    System.out.println("***CARRELLO E-COMMERCE***");

    while(true)
    {
      System.out.println("1.inserire videogioco");
      System.out.println("2.inserire libro");
      System.out.println("3.rimuovere articolo dal carrello");
      System.out.println("4.dettagli carrello");

      int i =sc.nextInt();

      switch(i)
      {
        case 1 : /*inserire videogioco*/



      }
    }


  }
}
