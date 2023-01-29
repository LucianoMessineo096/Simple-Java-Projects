/*In occasione di una gara canora si vuole gestire il televoto. Il pubblico da casa può votare per uno dei 15
partecipanti ma può votare al massimo 5 volte. Il sistema deve poter raccogliere i voti in forma anonima e
alla fine delle operazioni stampare la classifica risultante dal televoto.
Scrivete quindi un programma che permette di inserire un nuovo voto, verifica se da quel numero telefonico
sono stati effettuati meno di 5 voti e, in caso affermativo, aggiorna la classifica. Si osservi che non si
possono memorizzare i singoli voti (il voto deve restare anonimo) ma bisogna memorizzare l’elenco dei
votanti e del numero di voti effettuati da ciascuno.

Scrivete un programma che all’interno di un menu testuale, permette di
1) simulare l’arrivo di un nuovo voto tramite inserimento di numero di telefono del votante e numero del cantante votato,
2) stampare il totale dei voti ricevuti fino a quel momento
 3) stampare il numero di voti ricevuti da ciascun cantante.*/
////////////////////////////////////////////////////////////////////////////////
import java.uitl.Scanner;
import java.util.ArrayList;

public class Principale
{
  public static void main(String args[])
  {
    /*scanner*/

    Scanner sc = new Scanner(System.in);

    /*arraylist*/

    ArrayList<Votante> voto = new ArrayList<Votante>();
    ArrayList<Cantante> cantante = new ArrayList<Cantante>();


    System.out.println("**TELEVOTO**");

    while(true)
    {
      System.out.println("1.VOTO");
      System.out.println("2.STAMPA TOTALE VOTI");
      System.out.println("3.STAMPA VOTI RICEVUTI DAL CANTANTE");

      int i = sc.nextInt();

      switch(i)
      {
        case 1: /*arrivo di un nuovo voto tramite numero di telefono*/

        System.out.println("inserire numero di telefono");
        String num = sc.next();
        System.out.println("inserire numero del cantante da votare");
        int cantante = sc.nextInt();

        Votante V = new Votante(num);
        Cantante C = new Cantante(cantante);

        voto.add(V);
        System.out.println("voto acquisito");
        cantante.add(C);
        System.out.println("numero cantante acquisito");



        break;

        case 2: /*stampare totale voti ricevuti*/

        System.out.println("numero totale di voti ricevuti :" +" "+ voto.size());

        break;

        case 3: /*stampare voti ricevuti per quel cantante*/

        System.out.println("inserire numero del cantante per vedere il numero di voti");

        int codice = sc.nextInt();
        int count=0;

        for(Cantante C : cantante)
        {
          if(C.getCodice().equals(codice))
          {
            count++;
          }
        }

        System.out.println("il cantante scelto ha ricevuto n°" +count+"voti");

        break;

        default:
      }
    }
  }
}
