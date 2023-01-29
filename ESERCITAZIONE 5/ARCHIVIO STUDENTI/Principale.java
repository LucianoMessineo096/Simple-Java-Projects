/*Si scriva un programma interattivo che, utilizzando la classe Studente dell’esercitazione 4 e due
ArrayList<Studente>, dia la possibilità, tramite un semplice menu testuale, di archiviare gli studenti
(ArrayList che chiameremo archivio che contiene tutti gli studenti) e gestire le iscrizioni agli esami
(ArrayList che chiameremo esame che contiene solo gli studenti iscritti all’esame). L’utente dovrà poter
scegliere fra le seguenti opzioni:
a. inserire un nuovo studente nella lista archivio con dati inseriti dall’utente
b. cercare uno studente nella lista archivio in base alla matricola
c. cercare uno studente nella lista archivio in base al cognome (se ce ne è più di uno bisogna
stamparli tutti)
d. iscrivere uno studente all’esame (inserirlo quindi nella lista esame) in base alla matricola
e. rimuovere uno studente dall’esame in base alla matricola
f. stampare l’intera lista degli iscritti agli esami
g. cancellare l’intera lista degli iscritti all’esame
h. esci
Nota:
Scrivere nel main un ciclo infinito che chiede all’utente cosa vuole fare e tramite uno switch esegue
l’operazione richiesta.
Fate in modo che la matricola venga assegnata univocamente e automaticamente utilizzando una
variabile statica nella classe Studente che tiene conto di quanti oggetti sono stati creati e usa questo
numero progressivo come matricola.*/

////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;
import java.util.ArrayList;

public class Principale
{
  public static void main(String args[])
  {
    /*scanner*/

    Scanner sc = new Scanner(System.in);

    /*arraylist*/

    int index = 100;

    ArrayList <Studente> Studenti = new ArrayList<>(index);
    ArrayList <Esami> Esami = new ArrayList<>();





    ///////////////////////////////////////////////////////////////////////////
    System.out.println("**ARCHIVIO STUDENTI**");

    System.out.println("\n");

    while(true)
    {

      System.out.println("1.INSERIRE STUDENTE IN ARCHIVIO");
      System.out.println("2.CERCARE STUDENTE IN ARCHIVIO IN BASE ALLA MATRICOLA");
      System.out.println("3.CERCARE STUDENTE IN ARCHIVIO IN BASE AL COGNOME");
      System.out.println("4.ISCRIVERE STUDENTE ALL'ESAME");
      System.out.println("5.RIMUOVERE STUDENTE DALL'ESAME");
      System.out.println("6.STAMPARE LISTA STUDENTI");
      System.out.println("7.STAMPARE LISTA ESAME");
      System.out.println("8.ESCI");

      int i = sc.nextInt();

      switch(i)
      {
        case 1: /*inserire studente in archivio*//*funziona*/

        System.out.println("INSERIRE NOME STUDENTE");
        String Nome = sc.next();
        System.out.println("\n");

        System.out.println("INSERIRE COGNOME STUDENTE");
        String Cognome = sc.next();
        System.out.println("\n");

        System.out.println("INSERIRE MATRICOLA STUDENTE");
        String Matricola = sc.next();
        System.out.println("\n");

        Studente A = new Studente(Nome , Cognome , Matricola);

        Studenti.add(A);

        System.out.println("\n");
        System.out.println("studente inserito");

        break;

        case 2: /*cercare studente tramite matricola*/ /*funziona*/

        System.out.println("inserire matricola dello studente da cercare");
        System.out.println("\n");
        String matricola = sc.next();

        for(Studente s : Studenti)
        {
          if(s.getMatricola().equals(matricola))
          {
            System.out.println(s.toString());
          }
        }



        break;

        case 3: /*cercare studente tramite cognome*/ /*funziona*/

        System.out.println("inserire cognome dello studente da cercare");
        System.out.println("\n");
        String cognome = sc.next();

        for(Studente s : Studenti)
        {
          if(s.getCognome().equals(cognome))
          {
            System.out.println(s.toString());
            System.out.println("\n");
          }
        }

        break;

        case 4: /*iscrivere studente all'esame*/

        /*System.out.println("INSERIRE NOME STUDENTE");
        System.out.println("\n");
        String N = sc.next();

        System.out.println("INSERIRE COGNOME STUDENTE");
        System.out.println("\n");
        String C = sc.next();

        System.out.println("INSERIRE MATRICOLA STUDENTE");
        System.out.println("\n");
        String M = sc.next();

        Studente B = new Studente(N , C , M);

        Esami.add(B);

        System.out.println("\n");
        System.out.println("studente iscritto all'esame");*/


        break;

        case 5: /*rimuovere studente dall'esame*/

        /*System.out.println("inserire matricola dello studente da rimuovere");
        System.out.println("\n");
        String m = sc.next();

        for(int j=1 ; j<=Studenti.size(); j++)
        {
          if(Studenti.get(j).getMatricola().equals(m))
          {
            System.out.println(Studenti.get(j).toString());

            Studenti.remove(j);

            System.out.println("Studente rimosso");
          }
          else
          {
            System.out.println("studente non trovato");
          }
        }*/

        break;

        case 6: /*stampa lista studenti*//*funziona*/

        for(int j=0 ; j<Studenti.size() ; j++ )
        {
          System.out.println("Studente:" +" "+ Studenti.get(j));
        }

        break;

        case 7: /*stampa lista esame*/

        break;

        case 8: /*esci*/

        break;


        default:

        System.out.println("errore");

        break;
      }


    }

  }
}
