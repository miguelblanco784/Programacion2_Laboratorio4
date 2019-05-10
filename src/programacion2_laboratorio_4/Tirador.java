/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion2_laboratorio_4;
import java.util.Random;
/**
 *
 * @author Francisco Pagoaga
 */
public class Tirador extends Jugador {
    Random r=new Random();
    private int tiro3;
    private int tiro2;
    private int manejobalon;

    public Tirador() {
        super();
    }
    
    public Tirador(int tiro3, int tiro2, int manejobalon, String nombre, String apodo, int numero, String favfutbol, String favbaloncesto, String jugadorfav, boolean mayoredad, int nacimiento, int numestrellas) {
        super(nombre, apodo, numero, favfutbol, favbaloncesto, jugadorfav, mayoredad, nacimiento, numestrellas);
        this.tiro3 = tiro3;
        this.tiro2 = tiro2;
        this.manejobalon = manejobalon;
    }

    public int getTiro3() {
        return tiro3;
    }

    public void setTiro3(int tiro3) {
        this.tiro3 = tiro3;
    }

    public int getTiro2() {
        return tiro2;
    }

    public void setTiro2(int tiro2) {
        this.tiro2 = tiro2;
    }

    public int getManejobalon() {
        return manejobalon;
    }

    public void setManejobalon(int manejobalon) {
        this.manejobalon = manejobalon;
    }
    
    @Override
    public boolean tirode3(){
        double x=(tiro3+manejobalon)*0.90*(super.getNumestrellas()/10);
        int y=1+r.nextInt(100);
        boolean resp;
        if (x>=y) {
            resp=true;
        } else{
            resp=false;
        }
        return resp;
    }//metodos sobreescritos para su polimorfismo, ya con connotacion override
    
    @Override
    public boolean tirode2(){
        double x=(tiro2+manejobalon)*0.95*(super.getNumestrellas()/10);
        int y=1+r.nextInt(100);
        boolean resp;
        if (x>=y) {
            resp=true;
        } else{
            resp=false;
        }
        return resp;
    }//metodos sobreescritos para su polimorfismo, ya con connotacion override
    
}
