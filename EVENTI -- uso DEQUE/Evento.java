public abstract class Evento
{
  private int identificativo;
  private String descrizione_testuale;

  public String toString()
  {
    return "identificativo" +" "+ getIdentificativo() +" "+ "descrizione" +" "+ getTesto();
  }

   /////////////////////////////////////////////////////////////////////////////

   public int setIdentificativo(int identificativo)
   {
     return this.identificativo=identificativo;
   }

   public String setTesto(String descrizione_testuale)
   {
     return this.descrizione_testuale=descrizione_testuale;
   }

   public int getIdentificativo()
   {
     return identificativo;
   }

   public String getTesto()
   {
     return descrizione_testuale;
   }
}
