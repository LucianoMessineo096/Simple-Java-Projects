/*Analogamente a quanto fatto nell’esercitazione precedente con la classe Razionale scrivete una classe
Complex che permetta di fare le operazioni di somma, sottrazione, distanza, confronto e conversione in
String in forma binomiale a + i b.
Potreste ad esempio implementare i seguenti costruttori e metodi:
Complex(double re, double im)
Complex(double re)
Complex()
Complex somma(Complex altro)
Complex sottrai(Complex altro)
double distanza(Complex altro)
String toString()
booelan equals(Complex altro)
Scrivete un programma di prova in cui create alcuni oggetti con valori letti da tastiera utilizzando uno
Scanner e verificate il corretto funzionamento dei metodi e costruttori implementati.*/

///////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;


public class Principale
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);

    /*oggetti*/

    System.out.println("inserire parte reale e immaginaria del numero A");
    double re_A = sc.nextDouble();
    double im_A = sc.nextDouble();

    Complesso A = new Complesso(re_A, im_A);

    System.out.println("inserire parte reale e immaginaria del numero B");
    double re_B = sc.nextDouble();
    double im_B = sc.nextDouble();

    Complesso B = new Complesso(re_B, im_B);

    /*scanner*/

    System.out.println("**CALCOLATRICE COMPLESSA**\nPREMERE:\n1.SOMMA \n2.DIFFERENZA\n3.PRODOTTO\n4.RAPPORTO\n5.UGUAGLIANZA\n 6.DISTANZA\n");



    int i = sc.nextInt();

    /*scelta*/

    while(true)
    {

      switch(i)
      {
        case 1: /*somma*/

        double s= A.somma(re_B , im_B);

        case 2: /*differenza*/

        double d= A.differenza(re_B , im_B);

        case 3: /*prodotto*/

        double p= A.prodotto(re_B , im_B);

        case 4: /*rapporto*/



        case 5: /*uguaglianza*/



        case 6: /*distanza*/

        double D= A.distanza(re_B , im_B);

        default:

        System.out.println("scelta errata");
      }

    }
  }
}
