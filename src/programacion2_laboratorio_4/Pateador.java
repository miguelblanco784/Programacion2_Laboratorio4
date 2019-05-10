/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion2_laboratorio_4;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Francisco Pagoaga
 */
public class Pateador extends Jugador {
    Scanner input=new Scanner(System.in);
    private int habpateadora;
    private int fuerza;
    private int habregateadora;
    Random r=new Random();
    
    public Pateador() {
        super();
    }

    public Pateador(int habpateadora, int fuerza, int habregateadora, String nombre, String apodo, int numero, String favfutbol, String favbaloncesto, String jugadorfav, boolean mayoredad, int nacimiento, int numestrellas) {
        super(nombre, apodo, numero, favfutbol, favbaloncesto, jugadorfav, mayoredad, nacimiento, numestrellas);
        this.habpateadora = habpateadora;
        this.fuerza = fuerza;
        this.habregateadora = habregateadora;
    }

    public int getHabpateadora() {
        return habpateadora;
    }

    public int getFuerza() {
        return fuerza;
    }

    public int getHabregateadora() {
        return habregateadora;
    }

    public void setHabpateadora(int habpateadora) {
        this.habpateadora=habpateadora;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public void setHabregateadora(int habregateadora) {
        this.habregateadora = habregateadora;
    }
    
    @Override
    public boolean Atacar(){
        double x=(habpateadora+fuerza+habregateadora)*0.65*(super.getNumestrellas()/10);
        int y=1+r.nextInt(100);
        boolean resp;
        if (x<y) {
            resp=true;
        } else{
            resp=false;
        }
        return resp;
    }
    
    
}
