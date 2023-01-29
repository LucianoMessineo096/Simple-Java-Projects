import java.util.Scanner;


public class ProgrammaInterattivo
{
  public static void main(String args[])
  {
    Scanner scanner =new Scanner(System.in);// acquisizione da tastiera
    String stringa="";

    System.out.println("Digita qualcosa e batti enter, oppure " +
    "scrivi \"fine\" per terminare il programma");

    while(!(stringa=scanner.next()).equals("fine"))                             //NEXT: SERVE A BLOCCARE L'INPUT DA TASTIERA
    {
      System.out.println("Hai digitato " + stringa.toUpperCase() + "!");        // FINCHE' NO SI PREME ENTER
    }
                                                                                //EQUALS: METODO CHE SERVE A CONFRONTARE UN QUALCOSA
    System.out.println("Fine programma!");
  }
}
