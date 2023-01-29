/*Creare una gerarchia di classi che possa rappresentare le seguenti entità: Persona, Professore,
Studente, StudenteTriennale e StudenteMagistrale.
Ogni Professore ha una dataAssunzione, un ruolo (Ricercatore, Professore Associato o Professore
Ordinario), un dipartimento di appartenenza (es. DIID, DICAM, ...). Ogni Professore percepisce un
salario (prevedere quindi i metodi getSalario() e setSalario()).
Ogni Studente ha una dataIscrizione, una matricola, un corsoDiLaurea a cui è iscritto. Ogni Studente
paga un contributo d'Iscrizione al corso.
Uno StudenteTriennale deve conseguire 180 CFU e proviene da una scuolaSuperiore (una stringa per
memorizzare la scuola di provenienza). Uno StudenteMagistrale deve conseguire 120 CFU e proviene
da un corsoTriennale (una stringa per memorizzare il corso di laurea triennale di provenienza).
Prevedere opportuni metodi per l'incapsulamento dei dati.
Laddove possibile, riutilizzare classi sviluppate in esercitazioni precedenti (per es. Persona
dell’esercitazione precedente). In ogni classe prevedere il metodo toString() che restituisce una stringa
descrittiva dell'oggetto (es. per Persona: "<nome> <cognome> <dataDiNascita> <indirizzo>", per
Studente: "<matricola<nome> <cognome> <dataDiNascita> <indirizzo> <corsoDiLaurea>...", etc).*/
///////////////////////////////////////////////////////////////////////////////

import java.util.*;

public class Principale
{
  public static void main(String args[])
  {
    //////////////////////////////////////////////////

    Scanner sc = new Scanner(System.in);

    ArrayList<Professore> Professori = new ArrayList<>();
    ArrayList<StudenteTriennale> StudentiT = new ArrayList<>();
    ArrayList<StudenteMagistrale> StudentiM = new ArrayList<>();

    ///////////////////////////////////////////////////

    System.out.println("**UNIVERSITA'");

    while(true)
    {
      System.out.println("1.aggiungere professore");
      System.out.println("2.aggiungere studente triennale");
      System.out.println("3.aggiungere studente magistrale");

      int i = sc.nextInt();

      switch(i)
      {
        case 1: //Professore//

        System.out.println("**inserire dati professore**");
        System.out.println("\n");

        System.out.println("nome");
        String nome = sc.next();
        System.out.println("cognome");
        String cognome = sc.next();
        System.out.println("eta");
        int eta = sc.nextInt();
        System.out.println("data di assunzione");
        String data_assunzione = sc.next();
        System.out.println("ruolo");
        String ruolo = sc.next();
        System.out.println("dipartimento");
        String dipartimento = sc.next();

        Professore P = new Professore(nome , cognome , eta , data_assunzione , ruolo , dipartimento);

        Professori.add(P);

        System.out.println("professore inserito");
        System.out.println("\n");

        System.out.println("**lista professori**");

        for(int j=0 ; j<Professori.size() ; j++)
        {
          System.out.println(Professori.get(i));
        }

        break;

        case 2:  //studente triennale//

        System.out.println("**inserire dati studente triennale**");
        System.out.println("\n");

        System.out.println("nome");
        String Nome = sc.next();
        System.out.println("cognome");
        String Cognome = sc.next();
        System.out.println("eta");
        int Eta = sc.nextInt();
        System.out.println("data di iscrizione");
        String Data_iscrizione = sc.next();
        System.out.println("matricola");
        String Matricola = sc.next();
        System.out.println("corso di laurea");
        String Corso_laurea  = sc.next();
        System.out.println("cfu conseguiti");
        int Cfu = sc.nextInt();
        System.out.println("scuola superiore di provenienza");
        String Scuola_superiore = sc.next();

        StudenteTriennale ST = new StudenteTriennale(Nome , Cognome , Eta , Data_iscrizione , Matricola , Corso_laurea , Cfu , Scuola_superiore);

        StudentiT.add(ST);

        System.out.println("studente triennale inserito");

        System.out.println("**lista studenti triennali**");

        for(int k=0 ; k<StudentiT.size() ; k++)
        {
          System.out.println(StudentiT.get(k));
        }

        break;

        case 3:  //studente magistrale//

        System.out.println("**inserire dati studente magistrale**");
        System.out.println("\n");

        System.out.println("nome");
        String NOME = sc.next();
        System.out.println("cognome");
        String COGNOME = sc.next();
        System.out.println("eta");
        int ETA = sc.nextInt();
        System.out.println("data di iscrizione");
        String DATA_ISCRIZIONE = sc.next();
        System.out.println("matricola");
        String MATRICOLA = sc.next();
        System.out.println("corso di laurea");
        String CORSO_LAUREA  = sc.next();
        System.out.println("cfu conseguiti");
        int CFU = sc.nextInt();
        System.out.println("corso di laurea triennale di provenienza");
        String CORSO_TRIENNALE = sc.next();

        StudenteMagistrale SM = new StudenteMagistrale(NOME , COGNOME , ETA , DATA_ISCRIZIONE , MATRICOLA , CORSO_LAUREA , CFU , CORSO_TRIENNALE);

        StudentiM.add(SM);

        System.out.println("studente magistrale inserito");

        System.out.println("**lista studenti magistrali**");

        for(int z=0 ; z<StudentiM.size() ; z++)
        {
          System.out.println(StudentiM.get(z));
        }

        break;

        case 4:  //esci//

        break;

        default:

        break;
      }
    }
  }
}
