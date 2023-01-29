import java.lang.Math;

public class Complesso
{
  private double im;
  private double re;

  /*costruttori*/

  public Complesso(double re, double im)
  {
    setRe(double re);
    setIm(double im);

  }

  public Complesso(double re)
  {
    setRe(double re);

  }

  public Complesso()
  {

  }

  /*metodi*/

  public String toString()
  {
    return null;
  }

  public boolean equals()
  {
    return true;
  }

  public double somma(double re_B , double im_B)
  {

    final double re_S = (re + re_B);
    final double im_S = (im + im_B);


    return null;
  }

  public double differenza(double re_B , double im_B)
  {
    final double re_D = (re - re_B);
    final double im_D = (im - im_B);

    return null;
  }

  public double prodotto(double re_B , double im_B)
  {

    final double re_P = ((re * re_b) - (im * im_B));
    final double im_P = ((re * im_B) + (re_B * im));

    return null;
  }

  public double rapporto()
  {
    return null;
  }

  public double distanza(double re_B , double im_B)
  {

    final double d= sqrt( pow((re_B - re), 2) + pow((im_B - im), 2));

    return null;
  }

///////////////////////////////////////////////////////////////////////////////
/*incapsulamento*/

  public double setIm(double im)
  {
    return this.im=im;
  }

  public double setRe(double re)
  {
    return this.re=re;
  }








}
