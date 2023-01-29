/*Scrivete un programma che usi una Map in cui sia le chiavi sia i valori sono stringhe: rispettivamente, i
nomi degli studenti e i loro voti in un esame. Chiedete all’utente del programma se vuole inserire o
rimuovere studenti, modificarne il voto o stampare tutti i voti. La visualizzazione dovrebbe essere ordinata
per nome e avere un aspetto simile a questo:
Carl: B+
Joe: C
Sarah: A*/
///////////////////////////////////////////////////////////////////////////////
import java.util.*;


public class Principale
{
  public static void main(String args[])
  {
    /*scanner*/

    Scanner sc = new Scanner(System.in);

    /*map*/

    HashMap<String , String> voti = new HashMap<>();

    System.out.println("**gestione voti**");

    while(true)
    {
      System.out.println("1.inserire studente");
      System.out.println("2.rimuovere studente");
      System.out.println("3.modificare voto");
      System.out.println("4.stampare tutti i voti");

      int i =sc.nextInt();

      switch(i)
      {
        case 1: //inserire studente//

        System.out.println("inserire nome studente");
        String nome = sc.next();
        System.out.println("\n");
        System.out.println("inserire matricola studente");
        String matricola = sc.next();
        System.out.println("\n");
        System.out.println("inserire voto");
        String voto = sc.next();
        System.out.println("\n");

        Studente S = new Studente(nome , voto ,matricola);

        voti.put(matricola , voto);

        System.out.println("studente inserito");

        break;

        case 2: //rimuovere studente//

        System.out.println("inserire matricola studente");
        String Matricola = sc.next();
        System.out.println("\n");
        System.out.println("inserire voto dello studente da rimuovere");
        String vote = sc.next();
        System.out.println("\n");

        voti.remove(Matricola , vote);

        System.out.println("studente rimosso");

        break;

        case 3: //modificare voto//

        System.out.println("inserire matricola studente");
        String matr = sc.next();
        System.out.println("\n");

        for(String key : voti.keySet()) //iterazione per chiavi//
        {
          if(voti.get(key).equals(matr))
          {
            System.out.println("inserire nuovo voto");
            String Voto = sc.next();
            System.out.println("\n");

            voti.replace(matr , Voto );

            System.out.println("voto modificato");
          }
          
        }

        break;

        case 4: //stampare tutti i voti//

        for (Map.Entry<String, String> keys : voti.entrySet())
        {
          System.out.println("Key = " + keys.getKey() + ", Value = " + keys.getValue());
        }


        break;

        default:

        System.out.println("errore");

        break;
      }
    }
  }
}
