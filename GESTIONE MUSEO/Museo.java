import java.util.ArrayList;
import java.util.Scanner;

public class Museo
{
  private String nome;
  private String indirizzo;
  private ArrayList<OperaArte> opere = new ArrayList<>();

  /*Scanner*/

  Scanner sc = new Scanner(System.in);

  /*costruttori*/

  public Museo(String nome , String indirizzo)
  {
    setNome(nome);
    setIndirizzo(indirizzo);

  }

  public Museo()
  {

  }


  /*metodi*/

  public String toString()
  {
    return nome + "" + indirizzo;

  }
///////////////////////////////////////////////////////////////////////////////

  /*gestione scelte*/

  public void inserimentoOpera()
  {


    System.out.println("1.inserire scultura\n2.inserire dipinto");

    int scelta = sc.nextInt();

    if(scelta==1)
    {
      /*scultura*/

      System.out.println("TITOLO SCULTURA");
      String titolo = sc.next();
      System.out.println("AUTORE SCULTURA");
      String autore = sc.next();
      System.out.println("DATA DI CREAZIONE SCULTURA");
      String dataDiCreazione = sc.next();
      System.out.println("MATERIALE SCULTURA");
      String materiale = sc.next();
      System.out.println("ALTEZZA SCULTURA");
      double altezza = sc.nextDouble();

      Scultura A = new Scultura(titolo , autore ,dataDiCreazione , materiale , altezza);

      opere.add(A);

      System.out.println("opera inserita con successo");
    }
    else if(scelta==2)
    {
      /*dipinto*/

      System.out.println("TITOLO DIPINTO");
      String titolo = sc.next();
      System.out.println("AUTORE DIPINTO");
      String autore = sc.next();
      System.out.println("DATA DI CREAZIONE DIPINTO");
      String dataDiCreazione = sc.next();
      System.out.println("TECNICA DIPINTO");
      String tecnica = sc.next();
      System.out.println("LUNGHEZZA DIPINTO");
      double dim_x = sc.nextDouble();
      System.out.println("LARGHEZZA DIPINTO");
      double dim_y = sc.nextDouble();

      Dipinto A = new Dipinto(titolo , autore ,dataDiCreazione , tecnica , dim_x , dim_y);

      opere.add(A);

      System.out.println("opera inserita con successo");
    }
    else
    {
      System.out.println("scelta errata");
    }


   }

   public void cancellazioneOpera()
   {
     System.out.println("inserire titolo dell'opera da eliminare");

     String titolo = sc.next();
     System.out.println("");

     for(int i=0; i<opere.size(); i++)
     {
       if(opere.get(i).nome.equals(titolo))
       {
         opere.remove(i);
       }
     }
    }

    public void stampaDettagliOpera()
    {
      System.out.println("inserire titolo opera");

      String titolo = sc.next();

      for(int i=0 ; i<opere.size() ; i++)
      {
        if(opere.get(i).nome.equals(titolo))
        {
          System.out.println(opere.get(i).toString());
        }
      }
    }

  /////////////////////////////////////////////////////////////////////////////
   public String setNome(String nome)
   {
     return this.nome=nome;
   }

   public String setIndirizzo(String indirizzo)
   {
     return this.indirizzo=indirizzo;
   }

}
