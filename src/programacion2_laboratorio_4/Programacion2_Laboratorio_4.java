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
    static ArrayList Equipos = new ArrayList();

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
                    System.out.print("Ingrese la fecha de creacion: \n"
                            + "Ejemplo yyyy/MM/dd");
                    String fecha = leer.next();
                    DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
                    Date fechacreacion;
                    try {
                        fechacreacion = df.parse(fecha);
                    } catch (ParseException ex) {
                        System.out.println("La fecha fue ingresada mal no se agregara una fecha");
                        fechacreacion = new Date();
                    }
                    System.out.print("Ingrese el color: ");
                    String color = leer.next();

                    break;//Fin break de pedir datos
                case 2:

                    break;
                case 3:

                    break;
                default:
                    throw new AssertionError();
            }//Fin switch opciones
        }//Fin while infinito 
    }//Fin main

}//Fin public class
