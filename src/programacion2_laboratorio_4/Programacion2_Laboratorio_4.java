package programacion2_laboratorio_4;

import com.sun.prism.paint.Color;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Programacion2_Laboratorio_4 {

    static Scanner leer = new Scanner(System.in);
    static ArrayList<Equipo> Equipos = new ArrayList();

    public static void main(String[] args) {
        while (true) {
            System.out.print("1. Crear Equipos\n"
                    + "2. Crear Jugadores para equipo\n"
                    + "3. Jugar\n"
                    + "Ingrese su opcion: ");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre: ");
                    String nombre = leer.next();
                    System.out.print("Ingrese nombre del estadio: ");
                    String estadio = leer.next();
                    System.out.print("Ingrese el pais: ");
                    String pais = leer.next();
                    System.out.print("Ingrese el nombre del entrenador: ");
                    String nombreent = leer.next();
                    System.out.print("Nombre del dueno: ");
                    String nombreduen = leer.next();
                    System.out.print("Ingrese la mascota: ");
                    String mascota = leer.next();
                    System.out.print("Ingrese la fecha de creacion: ");
                    String fecha = leer.next();
                    System.out.print("Ingrese el color: ");
                    String color = leer.next();
                    Equipos.add(new Equipo(nombre, estadio, pais, nombreent, nombreduen, mascota, fecha, color));
                    break;//Fin break de pedir datos
                case 2:
                    for (int i = 0; i < Equipos.size(); i++) {
                        System.out.println(i + 1 + "- " + Equipos.get(i));
                    }
                    System.out.print("Ingrese nombre: ");
                    String nombrej = leer.next();
                    System.out.print("Ingrese apodo: ");
                    String apodoj = leer.next();
                    System.out.print("Ingrese su numero: ");
                    int numeroj = leer.nextInt();
                    System.out.print("Ingrese su equipo de futbol favorito: ");
                    String futfav = leer.next();
                    System.out.print("Ingrese su equipo de baloncesto favorito: ");
                    String basketfav = leer.next();
                    System.out.print("Ingrese su jugador favorito: ");
                    String jugadorfav = leer.next();
                    System.out.print("1. Mayor edad\n"
                            + "2. Menor edad\n"
                            + "Ingrese opcion: ");
                    boolean mayoredad;
                    int temp1 = leer.nextInt();
                    if (temp1 == 1) {
                        mayoredad = true;
                    } else {
                        mayoredad = false;
                    }
                    System.out.print("Ingrese su fecha de nacimient: ");
                    String fechanam = leer.next();
                    System.out.print("Ingrese su estrellas: ");
                    int estrellas = leer.nextInt();
                    System.out.print("1. Pateador/n"
                            + "2. Tirador/n"
                            + "Ingrese opcion: ");
                    int temp2 = leer.nextInt();
                    switch (temp2) {
                        case 1:
                            System.out.print("Ingres su habilidad: ");
                            int hablidad1 = leer.nextInt();
                            System.out.print("Ingrese su fuerza: ");
                            int fuerza1 = leer.nextInt();
                            System.out.print("Ingrese su habilidad regateadora: ");
                            int habgateadora1 = leer.nextInt();
                            Equipos.get(temp1).agregarjugadores(new Pateador(hablidad1, fuerza1, habgateadora1, nombrej, apodoj, numeroj, futfav, basketfav, jugadorfav, mayoredad, fechanam, estrellas));
                            break;
                        case 2:
                            System.out.print("Habilidad de tiros de 3: ");
                            int tiro3 = leer.nextInt();
                            System.out.print("Habilidad de tiros de 2: ");
                            int tiro2 = leer.nextInt();
                            System.out.print("Ingrese la habilidad de Tirador: ");
                            int habtiro = leer.nextInt();
                            Equipos.get(temp1).agregarjugadores(new Pateador(tiro3, tiro2, habtiro, nombrej, apodoj, numeroj, futfav, basketfav, jugadorfav, mayoredad, fechanam, estrellas));
                            break;
                        default:
                            throw new AssertionError();
                    }//fin switch
                    break;
                case 3:

                    break;
                default:
                    throw new AssertionError();
            }//Fin switch opciones
        }//Fin while infinito 
    }//Fin main

}//Fin public class
