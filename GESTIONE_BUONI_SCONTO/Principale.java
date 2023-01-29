import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;


public class Principale
{
  public static void main(String args[])
  {
    /*scanner*/

     Scanner sc = new Scanner(System.in);

    /*arraylist*/

    ArrayList<Cliente> clienti = new ArrayList<>();
    ArrayList<double> totbuoni = new ArrayList<>();
    ArrayList<Cliente> buoni_usati = new ArrayList<>();

    /*random*/

    Random rnd = new Random();


    System.out.println("**GESTIONE BUONI SCONTO**");

    while(true)
    {
      System.out.println("1.INSERIRE CLIENTE");
      System.out.println("2.SPENDERE IL BUONO");
      System.out.println("3.STAMPA CONTATTI CHE HANNO UTILIZZATO IL BUONO");
      System.out.println("4.STAMPA TOTALE SPESO CON I BUONI");

      int i = sc.nextInt();

      switch(i)
      {

        case 1: /*inserire cliente*/

        System.out.println("inserire nome cliente");
        String nome = sc.next();
        System.out.println("\n");
        System.out.println("inserire cognome cliente");
        String cognome = sc.next();
        System.out.println("\n");
        System.out.println("inserire sesso cliente");
        String sesso = sc.next();
        System.out.println("\n");
        System.out.println("inserire data di nascita cliente");
        String data_n = sc.next();
        System.out.println("\n");
        System.out.println("inserire email cliente");
        String email = sc.next();
        System.out.println("\n");
        System.out.println("inserire codice cliente");
        int cod_cliente = sc.nextInt();
        System.out.println("\n");

        System.out.println("generazione buono sconto");
        int b_sconto = rnd.nextInt( 51);

        System.out.println("il cliente ha ricevuto un buono sconto del"+b_sconto+"%");

        Cliente C = new Cliente(nome , cognome , sesso , data_n , email , cod_cliente , b_sconto);

        clienti.add(C);

        break;

        case 2: /*spendere il buono*/

        System.out.println("inserire importo sul quale effettuare lo sconto");
        double imp = sc.nextDouble();
        System.out.println("inserire codice cliente");
        int codice_cliente = sc.nextInt();

        for(Cliente c : clienti)
        {
          if(c.getCod_cliente().equals(codice_cliente) )
          {
            System.out.println("dati cliente:" +" "+ c.toString());
            System.out.println("\n");

            System.out.println("inserire buono sconto associato al cliente");
            int buono_sconto = sc.nextInt();
            System.out.println("\n");

            double prezzo_scontato = (imp*buono_sconto)/100;

            System.out.println("prezzo senza sconto: "+" "+ imp);
            System.out.println("\n");
            System.out.println("prezzo scontato:" +" "+ prezzo_scontato);
            System.out.println("\n");

            clienti.remove(c);
            buoni_usati.add(c);
            totbuoni.add(prezzo_scontato);




          }
          else
          {
            System.out.println("codice cliente non trovato");
          }
        }

        break;

        case 3: /*stampa contatti che hanno utilizzato il buono*/

        for(int z=0 ; z<buoni_usati.size() ; z++)
        {
          System.out.println(buoni_usati.get(z));
        }



        break;

        case 4: /*stampare totale speso con i buoni*/

        double count=0;

        for(int k=0 ; k<totbuoni.size() ; k++)
        {
          count+=totbuoni.get(k);

        }

        System.out.println("il totale speso con i buoni è:" +" "+ count);

        break;

        default:

        System.out.println("errore");

        break;


      }/*parentesi finale switch*/
    }


  }
}
