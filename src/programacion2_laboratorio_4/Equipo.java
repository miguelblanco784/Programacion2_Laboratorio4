package programacion2_laboratorio_4;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Francisco Pagoaga
 */
public class Equipo {
    private String nombre;
    private String estadio;
    private String pais;
    private String nomentrenador;
    private String nomduenio;
    private String mascota;
    private String fecha;
    private String color;
    private ArrayList<Jugador> jugadores=new ArrayList();

    public Equipo() {
    }

    public Equipo(String nombre, String estadio, String pais, String nomentrenador, String nomduenio, String mascota, String fecha, String color) {
        this.nombre = nombre;
        this.estadio = estadio;
        this.pais = pais;
        this.nomentrenador = nomentrenador;
        this.nomduenio = nomduenio;
        this.mascota = mascota;
        this.fecha = fecha;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEstadio() {
        return estadio;
    }

    public String getPais() {
        return pais;
    }

    public String getNomentrenador() {
        return nomentrenador;
    }

    public String getNomduenio() {
        return nomduenio;
    }

    public String getMascota() {
        return mascota;
    }

    public String getFecha() {
        return fecha;
    }

    public String getColor() {
        return color;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setNomentrenador(String nomentrenador) {
        this.nomentrenador = nomentrenador;
    }

    public void setNomduenio(String nomduenio) {
        this.nomduenio = nomduenio;
    }

    public void setMascota(String mascota) {
        this.mascota = mascota;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
    
    
}
