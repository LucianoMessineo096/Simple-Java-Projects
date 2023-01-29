import java.util.Random;
import java.lang.Math;

public class Nave{

    private String ID;
    private double x;
    private double y;
    private double velocita;
    private double direzione;
    private double lunghezza;
    private double larghezza;
    private int numPasseggeri;

    public int numNavi=0;
    Random rand = new Random();

    public Nave(String ID,double coordinataX,double coordinataY,double velocita,double direzione,int numPasseggeri){
        this.ID=ID;
        setXY(coordinataX,coordinataY);
        setVelDir(velocita,direzione);
        this.lunghezza=(double)(rand.nextInt(327));
        this.larghezza=(double)(rand.nextInt(35));
        setNumPasseggeri(numPasseggeri);

        numNavi+=1;
    }

    /*********************************setter********************************/
    public void setVelDir(double velocita,double direzione){

        if((velocita<0 || velocita>500) || (direzione<0 || direzione>359)){
            System.out.println("attenzione la velocita deve essere compresa tra ->  0<= velocita <=500"+
                                "la direzione deve essere compresa tra ->  0<= direzione <=359");
        }else{
            this.velocita=velocita;
            this.direzione=direzione;
        }
    }

    public void setXY(double coordinataX,double coordinataY){
        if((coordinataX<0 || coordinataX>1500) || (coordinataY<0 || coordinataY>1500)){
            System.out.println("attenzione le coordinate devono essere comprese tra ->  0<= coordinata <=1500");
        }else{
            this.x=coordinataX;
            this.y=coordinataY;
        }
    }

    public void setNumPasseggeri(int numPasseggeri){
        if(numPasseggeri<1 && numPasseggeri>9000){
            System.out.println("attenzione il numero di passeggeri  deve essere compreso tra ->  0<= passeggeri <=9000");
        }else{
            this.numPasseggeri=numPasseggeri;
        }
    }

    /*****************************************metodi di classe***************************************************/
    public void avanza(){

        this.x +=this.velocita*Math.cos(this.direzione*3.14/180); 
        this.y +=this.velocita*Math.sin(this.direzione*3.14/180);

        if((this.x>=1400 && this.x<=1499) && (this.y>=1400 && this.y<=1499))
        {
            System.out.println("la nave: "+this.ID+" si sta avvicinando all'uscita del porto, si trova alle coordinate X: "+this.x+" e Y: "+this.y);
        }else if((this.x>=0 && this.x<=100) && (this.y>=0 && this.y<=100)){
            System.out.println("la nave: "+this.ID+ " si trova all'entrata del porto alle coordinate X: "+this.x+" e Y: "+this.y);
        }else if(this.x==1500 && this.y==1500){
            System.out.println("la nave: "+this.ID+ " si trova all'uscita del porto alle coordinate X: "+this.x+" e Y: "+this.y);
        }
        else{
            System.out.println("la nave: "+this.ID+ " si trova alle coordinate X: "+this.x+" e Y: "+this.y);
        }
    }

    public void showInfo(){
        System.out.println("ID: "+this.ID+" X: "+this.x+" Y: "+this.y+" velocita: "+this.velocita+" direzione: "+this.direzione+
                            "lunghezza: "+this.lunghezza+" larghezza: "+this.larghezza+" passeggeri: "+this.numPasseggeri);
    }

    /********************************getter **************************************************************************************/
    public String getID(){
        return this.ID;
    }

    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }
}