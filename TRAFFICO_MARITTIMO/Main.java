/* SIMULAZIONE TRAFFICO MARITTIMO
Scrivete un programma per la simulazione del traffico marittimo in prossimità di un porto.
Si supponga che ogni nave sia caratterizzata da un codice univoco (String) e abbia una posizione in coordinate 
cartesiane (double), una velocità (double), una direzione (int fra 0 e 359), lunghezza e larghezza (entrambi double) 
e numero di passeggeri a bordo (int).
Le navi devono avere un metodo avanza(), che aggiorna le coordinate in base alla velocità e alla direzione (vedi 
suggerimenti).
Scrivete una classe Nave con tutti i dati, metodi e costruttori che ritenete opportuni.
Scrivete una classe Porto che, attraverso un suo metodo, permette di invocare il metodo avanza() di tutti i natanti 
presenti nello stretto.
La classe Porto deve permettere l’inserimento e l’eliminazione dei vari natanti.
Prevedete nella classe Porto anche un metodo per la verifica e prevenzione di collisioni (per semplicità il messaggio 
di pericolo verrà attivato quando la distanza fra due natanti è inferiore a una certa soglia che fisserete voi 
arbitrariamente).
Utilizzate le classi di cui sopra in un programma che crea un oggetto Porto, gestisce l’interazione con l’utente 
mediante un menu per inserimento o eliminazione di navi e, quando richiesto, invoca il metodo che fa avanzare tutti 
i natanti, stampa lo stato di tutte le navi e verifica la presenza di potenziali collisioni.
Suggerimenti:
La nuova posizione della nave si calcola con le formule:
x+=velocita*cos(direzione*3.14/180); 
y+=velocita*sin(direzione*3.14/180);
La distanza tra due punti P0(x0, y0) e P1(x1, y1) si può calcolare nel seguente modo:
double dx = x1 – x0;
double dy = y1 – y0;
double distanza sqrt(dx*dx + dy*dy);
*/
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.*;

public class Main{
    public static void main(String[] args){

        /*variabili*/
        boolean flag=true;
        Scanner sc = new Scanner(System.in);

        System.out.println("*********************************");
        System.out.println("Programma di gestione del porto");
        System.out.println("*********************************");

        Porto porto = new Porto();

        do{
            switch(menu()){

                case 1: //inserimento nuova nave
                    /*ogni nuova nave viene inserita in un ArrayList*/
                    Nave nave=inserimentoDatiNave();
                    porto.inserimentoNavi(nave);
                    break;

                case 2: //avanzamento nave

                
                    break;
                case 3: //cancellazione nave
                    cancellaNavi(porto.getNavi());
                    break;

                case 4: //stato porto
                    menuStato(porto);
                    break;

                case 5: //esci
                    flag=false;
                    System.out.println("sei uscito");
                    break;

                default:
                    System.out.println("!errore di inserimento riprovare");
            }
        }while(flag);
    }

    /****************metodi*******************/
    public static int menu(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("****************************");
        System.out.println("1.inserimento nuova nave");
        System.out.println("2.avanzamento nave");
        System.out.println("3.cancellazione nave");
        System.out.println("4.stato porto");
        System.out.println("5.esci");
        System.out.println("****************************");
        int choice = sc.nextInt();

        return choice;
    }

    public static void menuStato(Porto porto){
        Scanner sc = new Scanner(System.in);
        boolean flag=true;
        
        System.out.println("****************************");
        System.out.println("1.visualizza navi");
        System.out.println("2.informazioni nave");
        System.out.println("3.gestisci collisione");
        System.out.println("4.informazioni porto");
        System.out.println("5.esci");
        System.out.println("****************************");
        int choice = sc.nextInt();

        do{
            switch(choice){

                case 1: //visualizza navi
                    if(porto.getNavi().size()==0){
                        System.out.println("non e presente nessuna nave ");
                        flag=false;
                    }else{
                        stampaNavi(porto.getNavi());
                        flag=false;
                    }
                    break;

                case 2: //informazioni nave

                    break;

                case 3: //gestisci collisione

                    break;

                case 4: //informazioni porto

                    break;

                case 5: //esci
                    flag=false;
                    System.out.println("uscita");

                    break;

                default:
                    System.out.println("!attenzione input errato");

                    break;
            }
        }while(flag);
    }

    public static Nave inserimentoDatiNave(){
        Scanner sc = new Scanner(System.in);
        String ID;
        double coordinataX;
        double coordinataY;
        double velocita;
        double direzione;
        int numPasseggeri;

        System.out.println("ID: ");
        ID=sc.next();
        System.out.println("coordinataX: ");
        coordinataX=sc.nextDouble();
        System.out.println("coordinataY: ");
        coordinataY=sc.nextDouble();
        System.out.println("velocita: ");
        velocita=sc.nextDouble();
        System.out.println("direzione: ");
        direzione=sc.nextDouble();
        System.out.println("numero Passeggeri: ");
        numPasseggeri=sc.nextInt();
        
        Nave nave = new Nave(ID,coordinataX,coordinataY,velocita,direzione,numPasseggeri);
        return nave;
    }

    public static void stampaNavi(ArrayList<Nave> navi){
        
        for(Nave nave : navi){
            nave.showInfo();
        }
    }

    public static void cancellaNavi(ArrayList<Nave> navi){
        Scanner sc=new Scanner(System.in);
        boolean flag2=true;

        /*copio gli id delle navi in un altro arraylist*/
        ArrayList<String> idNavi = new ArrayList<>();

        for(Nave nave : navi){
            if(navi.size()!=0){
                idNavi.add(nave.getID());
            }else{
                System.out.println("non e' presente nessuna nave");
                break;
            }
        }

        /*se trovo l'id della nave la cancello*/
        do{
            System.out.print("inserire l'id della nave: ");
            String ID = sc.next();

            if(idNavi.contains(ID)!=true){
                System.out.println("la nave inserita non e' presente, riprovare");
                flag2=true;
            }else{
                for(Nave nave : navi){
                    if(nave.getID().equals(ID)){
                        navi.remove(nave);
                        idNavi.remove(nave.getID());
                        System.out.println("la nave e stata rimossa");
                        flag2=false;
                        break;
                    }
                }
            }
        }while(flag2);
    }
}

