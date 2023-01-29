import java.util.Scanner;
import java.util.ArrayList;

public class Principale
{
  public static void main(String args[])
  {

    /*ArrayList*/

    ArrayList<Auto> venditeA = new ArrayList<Auto>();
    ArrayList<Moto> venditeM = new ArrayList<Moto>();
    ArrayList<Cliente> cliente = new ArrayList<Cliente>();

    /*scanner*/

    Scanner sc = new Scanner(System.in);



    while(true)
    {
      /*menu*/

      System.out.println("**CONCESSIONARIA MESSINEO**");
      System.out.println("1.ACQUISTO");
      System.out.println("2.RESO");
      System.out.println("3.CALCOLO RATA");
      System.out.println("4.STAMPA DETTAGLI DI VENDITA");
      System.out.println("5.ESCI");

      int i = sc.nextInt();

      switch(i)
      {
        case 1: /*acquisto*/

        System.out.println("inserire dati cliente");

        String nome = sc.next();
        String cognome = sc.next();
        int eta = sc.nextInt();
        String cod_cliente = sc.next();

        Cliente C = new Cliente(nome , cognome , eta , cod_cliente);

        cliente.add(C);

        System.out.println("cliente aggiunto");

        System.out.println("\n");

        System.out.println("scegliere:");
        System.out.println("1.Acquisto auto");
        System.out.println("2.Acquisto moto");
        System.out.println("\n");

        int j = sc.nextInt();

        switch(j)
        {
          case 1: /*acquisto auto*/

          System.out.println("Scegliere auto e caratteristiche ");

          System.out.println("scegliere casa produttrice");
          String c_prod = sc.next();
          System.out.println("scegliere codice modello");
          String c_modello = sc.next();
          System.out.println("scegliere cilindrata");
          int  cilindr = sc.nextInt();
          System.out.println("scegliere colore");
          String color = sc.next();
          System.out.println("scegliere numero porte");
          int port = sc.nextInt();

          Auto A = new Auto(c_prod , c_modello , cilindr , color , port);

          venditeA.add(A);

          System.out.println("auto venduta");

          break;

          case 2: /*acquisto moto*/

          System.out.println("Scegliere moto e caratteristiche ");

          System.out.println("scegliere casa produttrice");
          String casa_prod = sc.next();
          System.out.println("scegliere codice modello");
          String cod_modello = sc.next();
          System.out.println("scegliere cilindrata");
          int  cilindrata = sc.nextInt();
          System.out.println("scegliere colore");
          String colore = sc.next();
          System.out.println("scegliere tipo sella");
          String sella = sc.next();

          Moto M = new Moto(casa_prod , cod_modello , cilindrata , colore , sella);

          venditeM.add(M);

          System.out.println("moto venduta");

          break;

          default:

          System.out.println("errore");

          break;
        }

        break;

        case 2: /*reso*/



        case 3: /*calcolo rata*/



        break;

        case 4: /*stampa dettagli vendita*/

        System.out.println("1.stampa dettagli vendita ");

        break;

        case 5: /*esci*/

        break;

        default:

        System.out.println("errore");

        break;

      }
    }



  }
}
