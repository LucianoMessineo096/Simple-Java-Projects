/* LE APPLICAZIONI JAVA POSSONO RICEVERE IN INPUT I VALORI CHE L'UTENTE
INDICA DA LINEA DI COMANDO. IN PRATICA I PARAMETRI VENGONO AGGIUNTI AL COMANDO
CHE INVOCA L'APPLICAZIONE, SUBITO DOPO IL NOME DELLA CLASSE CHE DEVE ESSERE ESEGUITA
SUCCESSIVAMENTEL'INTERPRETE JAVA PASSA L'ELENCO DEI PARAMETRI AL METODO MAIN DELL'APPLICAZIONE
TRAMITE UN ARRAY DI STRINGHE.
*/
//args.length vede la grandezza dell'array

public class Contatore
{
  public static void main(String args[])
  {
    int sum=1;

    for(int i=0;i<args.length;i++)
    {
      System.out.println(args[i]);

      sum+=i;

    }

    System.out.println("Hai inserito\t"+ sum + "\targomenti");
  }
}
