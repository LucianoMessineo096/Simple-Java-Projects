/*Un punto nel piano si può rappresentare tramite una classe con due variabili d’istanza: x e y di tipo double.
Scrivete una classe (incapsulata) con tutti i metodi e i costruttori che ritenete utili (incluso il metodo String
toString() e boolean equals(Punto)). Scrivere quindi un programma che realizzi le seguenti
operazioni con punti nel piano:
- Crea due punti con dati inseriti da tastiera dall’utente (usate il metodo nextDouble di Scanner)
- Dati i due punti, ne calcola la loro distanza
- Dati i due punti, determina il punto medio del segmento che li unisce
- Dati i due punti verifica se sono uguali (usando il metodo equals che avete implementato)
Note:
Nel metodo equals non potete verificare l’uguaglianza delle coordinate con == perché sono valori double
e quindi approssimati. Potete dire che sono uguali quando la loro distanza è minore di un valore molto
piccolo prefissato, ad esempio di 1E-10)
Quando inserite un double da tastiera potreste dover utilizzare la virgola invece del punto per il separatore
dei decimali in quanto dipende dai settaggi del computer su cui gira la JVM.*/

public class Punto
{
  private double ascissa;
  private double ordinata;

  ////////////COSTRUTTORE///////////////

  public Punto(double ascissa , double ordinata)
  {
    setAscissa();
    setOrdinata();
  }


  //////////INCAPSULAMENTO//////////////

  public double setAscissa(double ascissa)
  {
    this.ascissa=ascissa;

  }

  public double setOrdinata(double ordinata)
  {
    this.ordinata=ordinata;
  }

  public double getAscissa()
  {
    return ascissa;
  }

  public double getOrdinata()
  {
    return ordinata;
  }

  /////////////////METODI//////////////////





}
