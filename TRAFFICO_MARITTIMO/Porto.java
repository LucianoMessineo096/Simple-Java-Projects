/* fisso una dimensione per il porto in larghezza e lunghezza

    larghezza = 1500;
    lunghezza = 1500;
*/

import java.util.*;

public class Porto{

    private int dimX=1500;
    private int dimY=1500;
    private int capienzaMax=3;
    ArrayList<Nave> navi = new ArrayList<>();

    
    /***********************metodi di classe********************************* */
    public void gestioneCollisioni(){


    }

    public void inserimentoNavi(Nave newNave){
        if(navi.size()==capienzaMax){
            System.out.println("il porto ha raggiunto la capienza massima, cancella almeno una nave");
        }else{
            if(navi.size()==0){
                navi.add(newNave);
                System.out.println("la nave e stata inserita");
            }else{
                boolean flag=controlloPosizioneNewNave(navi , newNave);

                if(flag==false){
                    navi.add(newNave);
                }
            }
        }
    }

    public boolean controlloPosizioneNewNave(ArrayList<Nave> navi , Nave newNave){
        boolean collisione=false;
        
        for(Nave nave : navi){
            if((nave.getX()==newNave.getX()) && (nave.getY()==newNave.getY())){
                System.out.println("attenzione la nuova nave inserita collide con: "+nave.getID()+" riprovare");
                collisione=true;
            }
        }

        return collisione;
    }

    /***************getter*************************************************** */
    public ArrayList<Nave> getNavi(){
        return this.navi;
    }
}