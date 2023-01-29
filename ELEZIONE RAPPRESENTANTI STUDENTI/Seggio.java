import java.util.ArrayList;
import java.util.Scanner;

public class Seggio
{
  private max_num_studenti=10;
  private max_num_candidati=3;
  private ArrayList<Studenti> studenti = new ArrayList<>();
  private ArrayList<Candidati> candidati = new ArrayList<>();

  /*costruttore*/

  public Seggio()
  {

  }

  /*scanner*/

  Scanner sc = new Scanner(System.in);

  /*metodi*/

  public void inserisci()
  {
    System.out.println("1.inserisci studente nella lista");
    System.out.println("2.inserisci candidato nella lista");

    int i= sc.nextInt();

    if(i==1)
    {
      /*inserimento studente*/

      System.out.println("inserire matricola");
      int matricola= sc.nextInt();
      System.out.println("inserire codice elettorale");
      long int codice= sc.nextLong();
      System.out.println("inserire nome");
      String nome= sc.next();
      System.out.println("inserire cognome");
      String cognome= sc.next();

      Studenti A= new Studenti(matricola , codice , nome , cognome );

      studenti.add(A);

      System.out.println("studente inserito con successo");
    }
    else if(i==2)
    {
      /*inserimento candidato*/

      System.out.println("inserire matricola");
      int matricola= sc.nextInt();
      System.out.println("inserire codice elettorale");
      long int codice= sc.nextLong();
      System.out.println("inserire nome");
      String nome= sc.next();
      System.out.println("inserire cognome");
      String cognome= sc.next();
      System.out.println("inserire nome lista");
      String nome_lista= sc.next();

      Studenti B= new Studenti(matricola , codice , nome , cognome , nome_lista );

      candidati.add(B);

      System.out.println("candidato inserito con successo");
    }
    else
    {
      System.out.println("inserimento non valido");
    }



    public void cancellazione()
    {

      System.out.println("1.cancella studente dalla lista");
      System.out.println("2.cancella candidato dalla lista");

      int i= sc.nextInt();

      if(i==1)
      {
        /*studente*/

        System.out.println("inserire matricola studente da cancellare dalla lista");

        int matricola= sc.nextInt();

        for(int j=0 ; j<studenti.size() ; j++)
        {
          if(studenti.get(j).equals(matricola))
          {
            studenti.remove(j);

            System.out.println("studente rimosso");
          }
        }
      }
      else if(i==2)
      {
        /*candidato*/

        System.out.println("inserire matricola candidato da cancellare dalla lista");

        int matricola= sc.nextInt();

        for(int j=0 ; j<candidati.size() ; j++)
        {
          if(candidati.get(j).equals(matricola))
          {
            candidati.remove(j);

            System.out.println("studente rimosso");
          }
        }
      }
      else
      {
        System.out.println("scelta errata");
      }
    }

    public void statoLista()
    {
      System.out.println("1.stampa stato lista studenti");
      System.out.println("2.stampa stato lista candidati");

      int i= sc.nextInt();

      if(i==1)
      {
        /*lista studenti*/

        for(int j=0 ; j<studenti.size() ; j++)
        {
          System.out.println(studenti.get(j));
        }
      }
      else if(i==2)
      {
        /*lista candidati*/

        for(int j=0 ; j<candidati.size() ; j++)
        {
          System.out.println(candidati.get(j));
        }
      }
      else
      {
        System.out.println("scelta errata");
      }
    }



  }




}
