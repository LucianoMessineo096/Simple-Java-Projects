/*SIMULAZIONE DEL GIOCO DEL TRIS.
Regole del gioco: Si gioca in due su una scacchiera 3x3 inizialmente vuota. I giocatori alternativamente
mettono rispettivamente uno O o un X in una casella vuota.
Vince chi riesce a completare un filotto di tre elementi per primo. Il filotto può essere orizzontale, verticale o
diagonale. Se nessuno dei due riesce a fare un filotto e non ci sono più celle disponibili la partita è pari.
Problema: Scrivete un programma in grado di gestire partite a tris fra due giocatori umani o fra un giocatore
e il computer. Lo svolgimento di una partita consiste nel chiamare alternativamente per i due giocatori un
metodo, che potremmo chiamare gioca, e di verificare se la mossa è valida, se uno dei due giocatori ha vinto
o se la partita è pari.
Per il giocatore umano il metodo gioca semplicemente chiederà all’utente dove inserire il segno.
Per il giocatore computer il metodo gioca potrebbe semplicemente inserire il segno in una qualsiasi posizione
fra quelle disponibili.
Scrivete le classi necessarie allo scopo e utilizzatele in un programma di prova per testarne il corretto
funzionamento (sia nel caso umano contro umano che umano contro computer).
Suggerimenti: Si potrebbero derivare i giocatori (umani e computer) da un’unica classe astratta giocatore.
Probabilmente conviene anche definire una classe partita che gestisce lo svolgimento della partita stessa*/

import java.util.Scanner;

public class Partita
{
  public static void main(String args[])
  {
    System.out.println("**TRIS**");

    /*scanner*/

    Scanner sc = new Scanner(System.in);

    /*MENU*/

    System.out.println("PREMERE");
    System.out.println("1.AVVIARE PARTITA A 2 GIOCATORI");
    System.out.println("2.AVVIARE PARTITA CON COMPUTER");

    /*corpo programma*/

    int i=sc.nextInt();

    while(true)
    {
      switch(i)
      {
        case 1: /*caso giocatori umani*/

        Umano g1= new Umano();
        Umano g2= new Umano();

        for(int i=0;i<9;i++)
        {
          if(i%2==0)
          {
            System.out.println("turno giocatore 1");

            System.out.println("seleziona riga compresa tra 1 e 3");
            int r = sc.nextInt();

            if(r>3 || r<1)
            {
              System.out.println("errore! non puoi inserire valori al di fuori dei limiti della tabella");
            }
            else
            {
              continue;
            }


            System.out.println("seleziona colonna compresa tra 1 e 3");
            int c = sc.nextInt();

            if(c>3 || c<1)
            {
              System.out.println("errore! non puoi inserire valori al di fuori dei limiti della tabella");
            }
            else
            {
              continue;
            }

            g1.gioca1(r , c);

          }
          else
          {
            System.out.println("turno giocatore 1");

            System.out.println("seleziona riga compresa tra 1 e 3");
            int row = sc.nextInt();

            if(r>3 || r<1)
            {
              System.out.println("errore! non puoi inserire valori al di fuori dei limiti della tabella");
            }
            else
            {
              continue;
            }


            System.out.println("seleziona colonna compresa tra 1 e 3");
            int col = sc.nextInt();

            if(c>3 || c<1)
            {
              System.out.println("errore! non puoi inserire valori al di fuori dei limiti della tabella");
            }
            else
            {
              continue;
            }

            g2.gioca2(row , col);
          }
        }


        case 2: /*caso giocatore computer*/

        Umano g1 = new Umano();
        Computer pc = new Computer();

        for(int i=0;i<9;i++)
        {
          if(i%2==0)
          {
            System.out.println("turno giocatore 1");

            System.out.println("seleziona riga compresa tra 1 e 3");
            int r = sc.nextInt();

            if(r>3 || r<1)
            {
              System.out.println("errore! non puoi inserire valori al di fuori dei limiti della tabella");
            }
            else
            {
              continue;
            }


            System.out.println("seleziona colonna compresa tra 1 e 3");
            int c = sc.nextInt();

            if(c>3 || c<1)
            {
              System.out.println("errore! non puoi inserire valori al di fuori dei limiti della tabella");
            }
            else
            {
              continue;
            }

            g1.gioca1(r , c);


          }
          else
          {
            System.out.println("turno computer");

            pc.gioca2();


          }
        }



        default:

        System.out.println("scelta errata");


      }
    }


  }
}
