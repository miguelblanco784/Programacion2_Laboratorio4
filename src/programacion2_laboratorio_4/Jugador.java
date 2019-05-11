package programacion2_laboratorio_4;

import java.util.Scanner;

public class Jugador {

    Scanner input = new Scanner(System.in);
    private String nombre;
    private String apodo;
    private int numero;
    private String favfutbol;
    private String favbaloncesto;
    private String jugadorfav;
    private boolean mayoredad;
    private String nacimiento;
    private int numestrellas;
    private boolean latiene;

    public Jugador() {
    }

    public Jugador(String nombre, String apodo, int numero, String favfutbol, String favbaloncesto, String jugadorfav, boolean mayoredad, String nacimiento, int numestrellas) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.numero = numero;
        this.favfutbol = favfutbol;
        this.favbaloncesto = favbaloncesto;
        this.jugadorfav = jugadorfav;
        this.mayoredad = mayoredad;
        this.nacimiento = nacimiento;
        this.numestrellas = numestrellas;
    }

    public boolean isLatiene() {
        return latiene;
    }

    public void setLatiene(boolean latiene) {
        this.latiene = latiene;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public int getNumero() {
        return numero;
    }

    public String getFavfutbol() {
        return favfutbol;
    }

    public String getFavbaloncesto() {
        return favbaloncesto;
    }

    public String getJugadorfav() {
        return jugadorfav;
    }

    public boolean isMayoredad() {
        return mayoredad;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public int getNumestrellas() {
        return numestrellas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setFavfutbol(String favfutbol) {
        this.favfutbol = favfutbol;
    }

    public void setFavbaloncesto(String favbaloncesto) {
        this.favbaloncesto = favbaloncesto;
    }

    public void setJugadorfav(String jugadorfav) {
        this.jugadorfav = jugadorfav;
    }

    public void setMayoredad(boolean mayoredad) {
        this.mayoredad = mayoredad;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public void setNumestrellas(int numestrellas) {
        while (numestrellas > 5 || numestrellas < 1) {
            System.out.println("Numero no valido\nIngrese numero de estrellas:");
            numestrellas = input.nextInt();
        }
        this.numestrellas = numestrellas;
    }

    public boolean Atacar() {
        return false;
    }//polimorfismo del metodo atacar

    public boolean tirode3() {
        return false;
    } //polimorfismo de metodo para tiros de 3

    public boolean tirode2() {
        return true;
    }//polimorfismo de metodos para tiros de 2
}
