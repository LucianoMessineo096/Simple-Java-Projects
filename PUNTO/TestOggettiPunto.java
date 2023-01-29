public class TestOggettiPunto
{
  public static void main(String args[])
  {
    Punto punto1; //dichiarazione oggetto punto1 di tipo Punto
    punto1= new Punto();//istanziazione dell'oggetto punto 1
    punto1.x=2;//assegnazione tramite operatore dot
    punto1.y=6;//""""""""""""""""""""""""""""""""""

    //metodo piu veloce per dichiarare e istanziare un TestOggettiPunto
    Punto punto2=new Punto();
    punto2.x=5;
    punto2.y=4;

    //stampa valori a schermo

    System.out.println(punto1.x);
    System.out.println(punto1.y);
    System.out.println(punto2.x);
    System.out.println(punto2.y);

  }
}
