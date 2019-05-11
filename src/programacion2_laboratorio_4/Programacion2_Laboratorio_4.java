package programacion2_laboratorio_4;

import java.awt.Color;
import java.util.*;

public class Programacion2_Laboratorio_4 {

    static int contjug1, contjug2;
    static Equipo Jugador1;
    static Equipo Jugador2;
    static Scanner leer = new Scanner(System.in);
    static ArrayList<Equipo> Equipos = new ArrayList();

    public static void main(String[] args) {
        while (true) {
            System.out.print("1. Crear Equipos\n"
                    + "2. Jugadores\n"
                    + "3. Jugar\n"
                    + "Ingrese su opcion: ");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("1. Eliminar\n"
                            + "2. Modificar\n"
                            + "3. Agregar\n"
                            + "Ingrese opcion:");
                    int temp5 = leer.nextInt();
                    switch (temp5) {
                        case 1:
                            for (int i = 0; i < Equipos.size(); i++) {
                                System.out.println(i + 1 + "- " + Equipos.get(i));
                            }
                            System.out.print("Ingrese su equipo: ");
                            int temp12 = leer.nextInt() - 1;
                            Equipos.remove(temp12);
                            break;
                        case 2:

                            break;
                        case 3:
                            boolean v = true;
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
                            break;
                        default:
                            throw new AssertionError();
                    }
                    break;//Fin break de pedir datos

                case 2:
                    System.out.print("1. Eliminar\n"
                            + "2. Modificar\n"
                            + "3. Agregar\n"
                            + "Ingrese opcion:");
                    int temp4 = leer.nextInt();
                    switch (temp4) {
                        case 1:
                            for (int i = 0; i < Equipos.size(); i++) {
                                System.out.println(i + 1 + "- " + Equipos.get(i));
                            }
                            System.out.print("Ingrese su equipo: ");
                            int temp13 = leer.nextInt() - 1;
                            for (int i = 0; i < Equipos.get(temp13).getJugadores().size(); i++) {
                                System.out.println(i + 1 + "- " + Equipos.get(temp13).getJugadores().get(i));
                            }
                            int op = leer.nextInt() - 1;
                            Equipos.get(temp13).getJugadores().remove(op);
                            break;
                        case 2:
                            for (int i = 0; i < Equipos.size(); i++) {
                                System.out.println(i + 1 + "- " + Equipos.get(i));
                            }
                            System.out.print("Ingrese su equipo: ");
                            temp13 = leer.nextInt() - 1;
                            for (int i = 0; i < Equipos.get(temp13).getJugadores().size(); i++) {
                                System.out.println(i + 1 + "- " + Equipos.get(temp13).getJugadores().get(i));
                            }
                            op = leer.nextInt() - 1;
                            int opc;
                            if (Equipos.get(temp13).getJugadores().get(op) instanceof Pateador) {
                                System.out.println("Lista de modificar\n"
                                        + "1)Nombre\n"
                                        + "2)Apodo\n"
                                        + "3)Numero\n"
                                        + "4)Equipo de futbol favorito\n"
                                        + "5)Equipo de baloncesto favorito\n"
                                        + "6)Jugador Favorito\n"
                                        + "7)Mayor de edad\n"
                                        + "8)Fecha de Nacimiento\n"
                                        + "9)Estrellas\n"
                                        + "10)Habilidad Pateadora\n"
                                        + "11)Fuerza\n"
                                        + "12)Habilidad Regateadora");
                                opc = leer.nextInt();
                                boolean v = true;
                                switch (opc) {
                                    case 1:
                                        System.out.print("Ingrese nombre: ");
                                        String nombrej = leer.next();
                                        Equipos.get(temp13).getJugadores().get(op).setNombre(nombrej);
                                        break;
                                    case 2:
                                        System.out.print("Ingrese apodo: ");
                                        String apodoj = leer.next();
                                        Equipos.get(temp13).getJugadores().get(op).setApodo(apodoj);
                                        break;
                                    case 3:
                                        System.out.print("Ingrese su numero: ");
                                        int numeroj = leer.nextInt();
                                        Equipos.get(temp13).getJugadores().get(op).setNumero(numeroj);
                                        break;
                                    case 4:
                                        System.out.print("Ingrese su equipo de futbol favorito: ");
                                        String futfav = leer.next();
                                        Equipos.get(temp13).getJugadores().get(op).setFavfutbol(futfav);
                                        break;
                                    case 5:
                                        System.out.print("Ingrese su equipo de baloncesto favorito: ");
                                        String basketfav = leer.next();
                                        Equipos.get(temp13).getJugadores().get(op).setFavbaloncesto(basketfav);
                                        break;
                                    case 6:
                                        System.out.print("Ingrese su jugador favorito: ");
                                        String jugadorfav = leer.next();
                                        Equipos.get(temp13).getJugadores().get(op).setJugadorfav(jugadorfav);
                                        break;
                                    case 7:
                                        System.out.print("1. Mayor edad\n"
                                                + "2. Menor edad\n"
                                                + "Ingrese opcion: ");
                                        int temp1 = leer.nextInt();
                                        if (temp1 == 1) {
                                            Equipos.get(temp13).getJugadores().get(op).setMayoredad(true);
                                        } else {
                                            Equipos.get(temp13).getJugadores().get(op).setMayoredad(false);
                                        }
                                        break;
                                    case 8:
                                        System.out.print("Ingrese su fecha de nacimiento: ");
                                        String fechanam = leer.next();
                                        Equipos.get(temp13).getJugadores().get(op).setNacimiento(fechanam);
                                        break;
                                    case 9:
                                        System.out.print("Ingrese su estrellas: ");
                                        int estrellas = 0;
                                        v = true;
                                        while (v) {
                                            try {
                                                estrellas = leer.nextInt();
                                                validestrellas(estrellas);
                                                v = false;
                                            } catch (MiExepcion e) {
                                                System.out.println("Tienen que estar en rango del 1 al 5:");
                                                v = true;
                                            } catch (InputMismatchException e) {
                                                System.out.println("Ingrese numeros");
                                                v = true;
                                            }
                                        }
                                        Equipos.get(temp13).getJugadores().get(op).setNumestrellas(estrellas);
                                        break;
                                    case 10:
                                        System.out.print("Ingres su habilidad: ");
                                        int hablidad1 = 0;
                                        v = true;
                                        while (v) {
                                            try {
                                                hablidad1 = leer.nextInt();
                                                validacion(hablidad1);
                                                v = false;
                                            } catch (MiExepcion e) {
                                                System.out.println("Tienen que estar en rango del 1 al 100");
                                                v = true;
                                            } catch (InputMismatchException e) {
                                                System.out.println("Ingrese numeros");
                                                v = true;
                                            }
                                        }
                                        break;
                                    case 11:
                                        System.out.print("Ingrese su fuerza: ");
                                        int fuerza1 = 0;
                                        v = true;
                                        while (v) {
                                            try {

                                                fuerza1 = leer.nextInt();
                                                validacion(fuerza1);
                                                v = false;
                                            } catch (MiExepcion e) {
                                                System.out.println("Tienen que estar en rango del 1 al 100");
                                                v = true;
                                            } catch (InputMismatchException e) {
                                                System.out.println("Ingrese numeros");
                                                v = true;
                                            }
                                        }

                                        break;
                                    case 12:
                                        System.out.print("Ingrese su habilidad regateadora: ");
                                        int habgateadora1 = 0;
                                        v = true;
                                        while (v) {
                                            try {
                                                habgateadora1 = leer.nextInt();
                                                validacion(habgateadora1);
                                                v = false;
                                            } catch (MiExepcion e) {
                                                System.out.println("Tienen que estar en rango del 1 al 100");
                                                v = true;
                                            } catch (InputMismatchException e) {
                                                System.out.println("Ingrese numeros");
                                                v = true;
                                            }
                                        }
                                        break;
                                }
                            } else if (Equipos.get(temp13).getJugadores().get(op) instanceof Tirador) {
                                System.out.println("Lista de modificar\n"
                                        + "1)Nombre\n"
                                        + "2)Apodo\n"
                                        + "3)Numero\n"
                                        + "4)Equipo de futbol favorito\n"
                                        + "5)Equipo de baloncesto favorito\n"
                                        + "6)Jugador Favorito\n"
                                        + "7)Mayor de edad\n"
                                        + "8)Fecha de Nacimiento\n"
                                        + "9)Estrellas\n"
                                        + "10)Habilidad Pateadora\n"
                                        + "11)Fuerza\n"
                                        + "12)Habilidad Regateadora");
                                opc = leer.nextInt();
                                boolean v = true;
                                switch (opc) {
                                    case 1:
                                        System.out.print("Ingrese nombre: ");
                                        String nombrej = leer.next();
                                        Equipos.get(temp13).getJugadores().get(op).setNombre(nombrej);
                                        break;
                                    case 2:
                                        System.out.print("Ingrese apodo: ");
                                        String apodoj = leer.next();
                                        Equipos.get(temp13).getJugadores().get(op).setApodo(apodoj);
                                        break;
                                    case 3:
                                        int numeroj = 0;
                                        System.out.print("Ingrese su numero: ");
                                        numeroj = leer.nextInt();
                                        Equipos.get(temp13).getJugadores().get(op).setNumero(numeroj);
                                        break;
                                    case 4:
                                        System.out.print("Ingrese su equipo de futbol favorito: ");
                                        String futfav = leer.next();
                                        Equipos.get(temp13).getJugadores().get(op).setFavfutbol(futfav);
                                        break;
                                    case 5:
                                        System.out.print("Ingrese su equipo de baloncesto favorito: ");
                                        String basketfav = leer.next();
                                        Equipos.get(temp13).getJugadores().get(op).setFavbaloncesto(basketfav);
                                        break;
                                    case 6:
                                        System.out.print("Ingrese su jugador favorito: ");
                                        String jugadorfav = leer.next();
                                        Equipos.get(temp13).getJugadores().get(op).setJugadorfav(jugadorfav);
                                        break;
                                    case 7:
                                        System.out.print("1. Mayor edad\n"
                                                + "2. Menor edad\n"
                                                + "Ingrese opcion: ");
                                        int temp1 = leer.nextInt();
                                        if (temp1 == 1) {
                                            Equipos.get(temp13).getJugadores().get(op).setMayoredad(true);
                                        } else {
                                            Equipos.get(temp13).getJugadores().get(op).setMayoredad(false);
                                        }
                                        break;
                                    case 8:
                                        System.out.print("Ingrese su fecha de nacimiento: ");
                                        String fechanam = leer.next();
                                        Equipos.get(temp13).getJugadores().get(op).setNacimiento(fechanam);
                                        break;
                                    case 9:
                                        System.out.print("Ingrese su estrellas: ");
                                        int estrellas = 0;
                                        v = true;
                                        while (v) {
                                            try {
                                                estrellas = leer.nextInt();
                                                validestrellas(estrellas);
                                                v = false;
                                            } catch (MiExepcion e) {
                                                System.out.println("Tienen que estar en rango del 1 al 5:");
                                                v = true;
                                            } catch (InputMismatchException e) {
                                                System.out.println("Ingrese numeros");
                                                v = true;
                                            }
                                        }
                                        Equipos.get(temp13).getJugadores().get(op).setNumestrellas(estrellas);
                                        break;
                                }
                            }
                            break;
                        case 3:
                            boolean v = true;
                            for (int i = 0; i < Equipos.size(); i++) {
                                System.out.println(i + 1 + "- " + Equipos.get(i));
                            }
                            System.out.print("Ingrese el equipo: ");
                            int temp10 = leer.nextInt() - 1;
                            System.out.print("Ingrese nombre: ");
                            String nombrej = leer.next();
                            System.out.print("Ingrese apodo: ");
                            String apodoj = leer.next();
                            int numeroj = 0;
                            System.out.print("Ingrese su numero: ");
                            numeroj = leer.nextInt();
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
                            System.out.print("Ingrese su fecha de nacimiento: ");
                            String fechanam = leer.next();
                            System.out.print("Ingrese su estrellas: ");
                            int estrellas = 0;
                            v = true;
                            while (v) {
                                try {

                                    estrellas = leer.nextInt();
                                    validestrellas(estrellas);
                                    v = false;
                                } catch (MiExepcion e) {
                                    System.out.println("Tienen que estar en rango del 1 al 5:");
                                    v = true;
                                } catch (InputMismatchException e) {
                                    System.out.println("Ingrese numeros");
                                    v = true;
                                }
                            }
                            System.out.print("1. Pateador\n"
                                    + "2. Tirador\n"
                                    + "Ingrese opcion: ");
                            int temp2 = leer.nextInt();
                            switch (temp2) {
                                case 1:
                                    System.out.print("Ingres su habilidad: ");
                                    int hablidad1 = 0;
                                    v = true;
                                    while (v) {
                                        try {
                                            hablidad1 = leer.nextInt();
                                            validacion(hablidad1);
                                            v = false;
                                        } catch (MiExepcion e) {
                                            System.out.println("Tienen que estar en rango del 1 al 100");
                                            v = true;
                                        } catch (InputMismatchException e) {
                                            System.out.println("Ingrese numeros");
                                            v = true;
                                        }
                                    }
                                    System.out.print("Ingrese su fuerza: ");
                                    int fuerza1 = 0;
                                    v = true;
                                    while (v) {
                                        try {

                                            fuerza1 = leer.nextInt();
                                            validacion(fuerza1);
                                            v = false;
                                        } catch (MiExepcion e) {
                                            System.out.println("Tienen que estar en rango del 1 al 100");
                                            v = true;
                                        } catch (InputMismatchException e) {
                                            System.out.println("Ingrese numeros");
                                            v = true;
                                        }
                                    }
                                    System.out.print("Ingrese su habilidad regateadora: ");
                                    int habgateadora1 = 0;
                                    v = true;
                                    while (v) {
                                        try {
                                            habgateadora1 = leer.nextInt();
                                            validacion(habgateadora1);
                                            v = false;
                                        } catch (MiExepcion e) {
                                            System.out.println("Tienen que estar en rango del 1 al 100");
                                            v = true;
                                        } catch (InputMismatchException e) {
                                            System.out.println("Ingrese numeros");
                                            v = true;
                                        }
                                    }

                                    Equipos.get(temp10).agregarjugadores(new Pateador(hablidad1, fuerza1, habgateadora1, nombrej, apodoj, numeroj, futfav, basketfav, jugadorfav, mayoredad, fechanam, estrellas));
                                    break;
                                case 2:
                                    System.out.print("Habilidad de tiros de 3: ");
                                    int tiro3 = 0;
                                    v = true;
                                    while (v) {
                                        try {
                                            tiro3 = leer.nextInt();
                                            validacion(tiro3);
                                            v = false;
                                        } catch (MiExepcion e) {
                                            System.out.println("Tienen que estar en rango del 1 al 100");
                                            v = true;
                                        } catch (InputMismatchException e) {
                                            System.out.println("Ingrese numeros");
                                            v = true;
                                        }
                                    }

                                    System.out.print("Habilidad de tiros de 2: ");
                                    int tiro2 = 0;
                                    v = true;
                                    while (v) {
                                        try {
                                            tiro2 = leer.nextInt();
                                            validacion(tiro2);
                                            v = false;
                                        } catch (MiExepcion e) {
                                            System.out.println("Tienen que estar en rango del 1 al 100");
                                            v = true;
                                        } catch (InputMismatchException e) {
                                            System.out.println("Ingrese numeros");
                                            v = true;
                                        }
                                    }
                                    System.out.print("Ingrese la habilidad de Tirador: ");
                                    v = true;
                                    int habtiro = 0;
                                    while (v) {
                                        try {
                                            habtiro = leer.nextInt();
                                            validacion(habtiro);
                                            v = false;
                                        } catch (MiExepcion e) {
                                            System.out.println("Tienen que estar en rango del 1 al 100");
                                            v = true;
                                        } catch (InputMismatchException e) {
                                            System.out.println("Ingrese numeros");
                                            v = true;
                                        }
                                    }
                                    Equipos.get(temp10).agregarjugadores(new Pateador(tiro3, tiro2, habtiro, nombrej, apodoj, numeroj, futfav, basketfav, jugadorfav, mayoredad, fechanam, estrellas));
                                    break;
                                default:
                                    throw new AssertionError();
                            }//fin switch
                            break;
                        default:
                            throw new AssertionError();
                    }
                    break;//Break de Jugadores

                case 3:
                    boolean p = true;
                    for (int i = 0; i < Equipos.size(); i++) {
                        System.out.println(i + 1 + "- " + Equipos.get(i));
                    }
                    System.out.print("Ingrese su equipo Jugador 1: ");
                    int temp15 = leer.nextInt() - 1;
                    Jugador1 = Equipos.get(temp15);
                    int temp20 = 0;

                    for (int i = 0; i < Equipos.size(); i++) {
                        System.out.println(i + 1 + "- " + Equipos.get(i));
                    }
                    System.out.print("Ingrese su equipo Jugador 2: ");
                    int temp14 = leer.nextInt() - 1;
                    Jugador2 = Equipos.get(temp14);
                    int temp21 = 0;

                    while (p) {//Inicio Juego
                        System.out.println("Jugador 1");
                        for (int i = 0; i < 5; i++) {
                            System.out.println(i + 1 + "-" + Jugador1.getJugadores().get(i));
                        }
                        System.out.print("La tiene: " + Jugador1.getJugadores().get(temp20));
                        Jugador1.getJugadores().get(temp20).setLatiene(true);
                        for (int i = 0; i < 4; i++) {
                            System.out.print("1. Patear\n"
                                    + "2. Tirar"
                                    + "3. Pasar"
                                    + "Ingrese opcion: ");
                            int temp16 = leer.nextInt();
                            switch (temp16) {
                                case 1:
                                    if (Jugador1.getJugadores().get(temp20).Atacar()) {
                                        contjug1++;
                                    }
                                    i = 5;
                                    break;
                                case 2:
                                    System.out.println("1. Tiro 2\n"
                                            + "3. Tiro 3\n"
                                            + "Ingrese opcion: ");
                                    int temp17 = leer.nextInt();
                                    switch (temp17) {
                                        case 1:
                                            if (Jugador1.getJugadores().get(temp20).tirode2()) {
                                                contjug1 += 2;
                                            }
                                            break;
                                        case 2:
                                            if (Jugador1.getJugadores().get(temp20).tirode3()) {
                                                contjug1 += 3;
                                            }
                                            break;
                                        default:
                                            throw new AssertionError();
                                    }
                                    i = 5;
                                    break;
                                case 3:
                                    System.out.print("A quien se la quiere pasar: ");
                                    Jugador1.getJugadores().get(temp20).setLatiene(false);
                                    temp20 = leer.nextInt();
                                    Jugador1.getJugadores().get(temp20).setLatiene(true);
                                    break;
                                default:
                                    throw new AssertionError();
                            }
                        }//fin for de jugar
                        System.out.println("1. Patear\n"
                                + "2. Tirar\n"
                                + "Ingrese opcion: ");
                        int temp16 = leer.nextInt();

                        switch (temp16) {
                            case 1:
                                if (Jugador1.getJugadores().get(temp20).Atacar()) {
                                    contjug1++;
                                }
                                break;
                            case 2:
                                System.out.println("1. Tiro 2\n"
                                        + "3. Tiro 3\n"
                                        + "Ingrese opcion: ");
                                int temp17 = leer.nextInt();
                                switch (temp17) {
                                    case 1:
                                        if (Jugador1.getJugadores().get(temp20).tirode2()) {
                                            contjug1 += 2;
                                        }
                                        break;
                                    case 2:
                                        if (Jugador1.getJugadores().get(temp20).tirode3()) {
                                            contjug1 += 3;
                                        }
                                        break;
                                    default:
                                        throw new AssertionError();
                                }
                                break;
                            default:
                                throw new AssertionError();
                        }

//=======================================================================================================================
                        System.out.println("Jugador 2");
                        for (int i = 0; i < 5; i++) {
                            System.out.println(i + 1 + "-" + Jugador2.getJugadores().get(i));
                        }
                        System.out.print("La tiene: " + Jugador2.getJugadores().get(temp21));
                        Jugador2.getJugadores().get(temp21).setLatiene(true);
                        for (int i = 0; i < 4; i++) {
                            System.out.print("1. Patear\n"
                                    + "2. Tirar"
                                    + "3. Pasar"
                                    + "Ingrese opcion: ");
                            int temp23 = leer.nextInt();
                            switch (temp23) {
                                case 1:
                                    if (Jugador2.getJugadores().get(temp21).Atacar()) {
                                        contjug2++;
                                    }
                                    i = 5;
                                    break;
                                case 2:
                                    System.out.println("1. Tiro 2\n"
                                            + "3. Tiro 3\n"
                                            + "Ingrese opcion: ");
                                    int temp17 = leer.nextInt();
                                    switch (temp17) {
                                        case 1:
                                            if (Jugador2.getJugadores().get(temp21).tirode2()) {
                                                contjug2 += 2;
                                            }
                                            break;
                                        case 2:
                                            if (Jugador2.getJugadores().get(temp21).tirode3()) {
                                                contjug2 += 3;
                                            }
                                            break;
                                        default:
                                            throw new AssertionError();
                                    }
                                    i = 5;
                                    break;
                                case 3:
                                    System.out.print("A quien se la quiere pasar: ");
                                    Jugador2.getJugadores().get(temp21).setLatiene(false);
                                    temp21 = leer.nextInt();
                                    Jugador2.getJugadores().get(temp21).setLatiene(true);
                                    break;
                                default:
                                    throw new AssertionError();
                            }
                        }//fin for de jugar
                        System.out.println("1. Patear\n"
                                + "2. Tirar\n"
                                + "Ingrese opcion: ");
                        int temp23 = leer.nextInt();

                        switch (temp23) {
                            case 1:
                                if (Jugador2.getJugadores().get(temp21).Atacar()) {
                                    contjug2++;
                                }
                                break;
                            case 2:
                                System.out.println("1. Tiro 2\n"
                                        + "3. Tiro 3\n"
                                        + "Ingrese opcion: ");
                                int temp17 = leer.nextInt();
                                switch (temp17) {
                                    case 1:
                                        if (Jugador2.getJugadores().get(temp21).tirode2()) {
                                            contjug2 += 2;
                                        }
                                        break;
                                    case 2:
                                        if (Jugador2.getJugadores().get(temp21).tirode3()) {
                                            contjug2 += 3;
                                        }
                                        break;
                                    default:
                                        throw new AssertionError();
                                }
                                break;
                            default:
                                throw new AssertionError();
                        }

//=======================================================================================================================
                        if (contjug1 == 11) {
                            System.out.println("FELICIDADES JUGADOR 1!!!!");
                            p = false;
                        } else if (contjug2 == 11) {
                            System.out.println("FELICIDADES JUGADOR 2!!!!");
                            p = false;
                        }
                    }//FIN WHILE TRUE
                    break;
                default:
                    throw new AssertionError();
            }//Fin switch opciones
        }//Fin while infinito 
    }//Fin main

    static void validacion(int x) throws MiExepcion {
        if (x > 100 || x < 1) {
            throw new MiExepcion(Color.red, "No se aceptan valor mayores que 100 o menores que 1");
        }
    }

    static void validestrellas(int x) throws MiExepcion {
        if (x > 5 || x < 1) {
            throw new MiExepcion(Color.red, "Rangos tienen que estar entre 1-5");
        }
    }
}//Fin public class
