public class Elenco
{
  private int num;
  private String descr;

  public Elenco(int num , String descr)
  {
    setNum(num);
    setDescr(descr);
  }

  public String toString()
  {
    return "priorita : " + getNum() +" "+ "descrizione : " + getDescr();
   }



  ////////////////////////////////////////////////////////////////////////

  public int setNum(int num)
  {
    return this.num=num;
  }

  public String setDescr(String descr)
  {
    return this.descr=descr;
  }

  public int getNum()
  {
    return num;
  }

  public String getDescr()
  {
    return descr;
  }
}
