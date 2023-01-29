import java.util.Scanner;


public class ProgrammaInterattivo
{
  public static void main(String args[])
  {

    // ACQUISIZIONE

    Scanner scanner= new Scanner(System.in);

    String v[]={"alfa", "beta", "gamma", "delta", "epsilon", "kappa", "lambda",
                 "sigma","omega"};

    String stringa="";

    System.out.println("inserire parola per continuare , altrimenti inserire alfa, beta, gamma, delta, epsilon, kappa, lambda, sigma,omega per terminare il programma");

    //FASE CONTROLLO

    while(!(stringa = scanner.next()).equals("fine")) {
			skip = false;
			for(int i=0; i<vietate.length; ++i){
				if(stringa.equals(vietate[i])){
					skip = true;
					break;
				}
			}
			if(!skip)
				System.out.println("Hai digitato " + stringa.toUpperCase() + "!");
		}
		System.out.println("Fine programma!");


  }
}
