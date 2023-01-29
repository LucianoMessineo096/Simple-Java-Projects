import java.util.ArrayList;
import java.util.Scanner;

public class Principale
{
  public static void main(String args[])
  {
    ArrayList<Persona> miaLista = new ArrayList<>();

    String nome, cognome;
    int età;

    /*INSERIMENTO*/

    System.out.println("effettuare la scelta");
    System.out.println("1.INSERIRE PERSONE\n2.CERCARE UNA PERSONA IN BASE AL NOME\n3.STAMPARE LA LISTA\n4.CANCELLARE LA LISTA\n5.ESCI");

    Scanner sc = new Scanner(System.in);
    int scelta = sc.nextInt();

    /*GESTIONE ARRAYLIST*/

    while(true)
    {
      switch(scelta)
      {
        case 1://inserire una persona nella lista

        System.out.println("inserire nome-cognome-età");

        nome=sc.next();
        cognome=sc.next();
        età=sc.next();

        miaLista.add(new Persona(nome,cognome,età));

        break;

        case 2: //cercare una persona nella lista in base al nome

        /*
        1.inserire NOME.
        2.scorrere l'intera lista .
         2.1 confrontare il nome inserito con quello presente alla posizione
             i-esima nella lista.
        2.2 se il nome inserito è presente nella lista stampo tutti gli i-esimi
             elementi che combaciano con quel nome, altrimenti nulla. */

        System.out.println("INSERIRE NOME DA CERCARE");

        nome=sc.next();

        for(Persona p : miaLista)
        {
          if(p.getNome().equals(nome))//se nome di p è uguale a nome inserito
          {
            System.out.println(p);
          }
          else
          {
            System.out.println("nome inserito non trovato");
          }
        }

        break;

        case 3: //stampare la lista

        System.out.println(miaLista);

        break;

        case 4: //cancellare la lista

        miaLista.clear();

        break;

        case 5: //esci

        break;

        default :

        System.out.println("inserimento non valido");

        break;
     }
    }




  }
}
