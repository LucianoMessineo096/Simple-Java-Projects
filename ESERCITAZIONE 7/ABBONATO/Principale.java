/*In un'applicazione per la gestione di una videoteca, i clienti sono memorizzati in oggetti della classe
Persona. Ogni Persona è caratterizzata da una dataDiNascita, nome, cognome, codiceFiscale, indirizzo,
citta, cap. Creare una classe Abbonato che estenda la classe Persona memorizzando in un'opportuna
variabile d'istanza sconto la percentuale di sconto a cui l'abbonato ha diritto su ogni acquisto effettuato.
Prevedere opportuni metodi per l'incapsulamento di questa variabile.
Creare inoltre una classe AbbonatoPremium che, oltre ad aver diritto ad uno sconto, ha diritto ad un
acquisto gratuito ogni volta che accumuli una spesa complessiva superiore a 100€. Scrivere una classe
per testare le classi Abbonato e AbbonatoPremium che memorizzi una lista di oggetti e abbia
funzionalità per aggiungere nuovi abbonati, gestire il costo degli acquisti in base al tipo di abbinato e
stampare lo stato degli abbonati..*/
///////////////////////////////////////////////////////////////////////////////
import java.util.*;

public class Principale
{
  public static void main(String args[])
  {
    ///////////////////////////////////////

    /*random*/
    Random rnd = new Random();



    /*scanner*/
    Scanner sc = new Scanner(System.in);

    /*arraylist*/

    ArrayList<Abbonato> Abbonati = new ArrayList<>();
    ArrayList<AbbonatoPremium> Abbonatip = new ArrayList<>();

    ///////////////////////////////////////

    System.out.println("**ABBONAMENTI**");

    while(true)
    {
      System.out.println("1.AGGIUNGERE ABBONATO");
      System.out.println("2.GESTIONE COSTI");
      System.out.println("3.STAMPA STATO ABBONATI");
      System.out.println("4.ESCI");

      int i= sc.nextInt();


      switch(i)
      {
        case 1: //aggiungere abbonati//


        System.out.println("*inserimento abbonato");
        System.out.println("\n");

        System.out.println("1.inserire abbonato");
        System.out.println("2.inserire abbonato premium");
        int j = sc.nextInt();

        System.out.println("inserire nome");
        String nome = sc.next();
        System.out.println("\n");
        System.out.println("inserire cognome");
        String cognome = sc.next();
        System.out.println("\n");
        System.out.println("inserire data di nascita");
        String data_nascita = sc.next();
        System.out.println("\n");
        System.out.println("inserire codice fiscale");
        String c_fiscale = sc.next();
        System.out.println("\n");
        System.out.println("inserire indirizzo");
        String indirizzo = sc.next();
        System.out.println("\n");
        System.out.println("inserire citta");
        String citta = sc.next();
        System.out.println("\n");
        System.out.println("inserire cap");
        int cap = sc.nextInt();
        System.out.println("\n");

        int bound = 60;
        int sconto = rnd.nextInt(bound);

        int acquisto = 0;

        if(j==1)
        {
          Abbonato abb = new Abbonato(nome , cognome , data_nascita , c_fiscale , indirizzo , citta , cap , sconto ,acquisto);

          Abbonati.add(abb);

          System.out.println("Abbonato aggiunto");

        }
        else if(j==2)
        {
          AbbonatoPremium abbp = new AbbonatoPremium(nome , cognome , data_nascita , c_fiscale , indirizzo , citta , cap , sconto , acquisto);

          Abbonatip.add(abbp);

          System.out.println("Abbonato premium aggiunto");
        }
        else
        {
          System.out.println("errore");
        }



        break;

        case 2: //gestire costo acquisti per abbonato//

        System.out.println("*gestione acquisti*");
        System.out.println("\n");

        System.out.println("1.gestire acquisti abbonati");
        System.out.println("2.gestire acquisti abbonati premium");
        int k = sc.nextInt();

        if(k==1) /*abbonato*/
        {
          System.out.println("inserire codice fiscale dell'abbonato");
          String c_fisc = sc.next();

          for(Abbonato abb : Abbonati)
          {
            if(abb.getC_fiscale().equals(c_fisc))
            {
              System.out.println("abbonato trovato , inserire importo");
              int importo = sc.nextInt();

              abb.setAcquisto(abb.getAcquisto() + importo);
            }
            else
            {
              System.out.println("abbonato non trovato");
            }
          }
        }
        else if(k==2) /*abbonato premium*/
        {
          System.out.println("inserire codice fiscale dell'abbonato premium");
          String co_fisc = sc.next();

          for(AbbonatoPremium abbp : Abbonatip)
          {
            if(abbp.getC_fiscale().equals(co_fisc))
            {
              System.out.println("abbonato trovato ,inserire importo");
              int imp = sc.nextInt();

              abbp.setAcquistoG(abbp.getAcquistoG() + imp);

              if(abbp.getAcquistoG()>=100)
              {
                System.out.println("puoi effettuare un acquisto gratuito");
              }
            }
          }
        }
        else
        {
          System.out.println("errore");
        }

        break;

        case 3: //stampa stato abbonati//

        for(int z=0 ; z<Abbonati.size() ; z++)
        {
          System.out.println(Abbonati.get(z));
        }

        System.out.println("\n");

        for(int t=0 ; t<Abbonatip.size() ; t++)
        {
          System.out.println(Abbonatip.get(t));
        }



        break;

        case 4: //esci//

        break;

        default:

        System.out.println("errore");

        break;
      }
    }
  }
}
