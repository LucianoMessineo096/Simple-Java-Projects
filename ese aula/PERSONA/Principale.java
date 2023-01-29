public class Principale
{
  public static void main(String args[])
  {
    Persona p1= new Persona();//oggetto Persona
    Persona p2= new Persona();
    Persona p3= p1;

    p1.setNome("mario");
    p1.setCognome("rossi");
    p1.setEta(25);

    p2.setNome("luigi");
    p2.setCognome("neri");
    p2.setEta(22);

    System.out.println(p1.toString());
    System.out.println(p2.toString());

    p3.setEta(26);
    System.out.println(p1.toString());

  }
}
