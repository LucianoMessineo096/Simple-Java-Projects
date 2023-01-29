public class ContaParola
{
  public static void main(String args[])
  {
    int sum=1;
    int sum_2=0;

    for(int i=0;i<args.length;i++)
    {
      //stampa elementi array
      System.out.println(args[i]);

      sum+=i;

      //controllo sull'array
      if(args[i].equals(args[i+1]))
      {

        sum_2+=i;
      }

    }

    System.out.println("hai inserito\t"+sum+"\targomenti");
    System.out.println("hai inserito\t"+sum_2+"\targomenti uguali");
  }
}
