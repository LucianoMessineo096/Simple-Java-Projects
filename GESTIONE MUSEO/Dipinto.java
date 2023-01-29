public class Dipinto extends OperaArte
{
  private String tecnica;
  private double dim_x;
  private double dim_y;

  /*costruttori*/

  public Dipinto(String titolo , String autore , String dataDiCreazione , String tecnica , double dim_x , double dim_y)
  {
    super(titolo , autore , dataDiCreazione);
    setTecnica(tecnica);
    setDim_X(dim_x);
    setDim_Y(dim_y);
  }

  public Dipinto()
  {

  }

  /*metodi*/

  public String toString()
  {
    return super.toString() + " " + tecnica + " " + dim_x + " " + dim_y;
  }


  //////////////////////////////////////////////////////////////////////////////

  public String setTecnica(String tecnica)
  {
    return this.tecnica=tecnica;
  }

  public double setDim_X(double dim_x)
  {
    return this.dim_x=dim_x;
  }

  public double setDim_Y(double dim_y)
  {
    return this.dim_y=dim_y;
  }
}
