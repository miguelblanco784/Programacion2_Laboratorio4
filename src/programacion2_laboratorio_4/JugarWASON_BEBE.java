package programacion2_laboratorio_4;

import java.util.Scanner;
import static programacion2_laboratorio_4.Programacion2_Laboratorio_4.Equipos;

public class JugarWASON_BEBE {

    private int contjug1, contjug2;
    private Equipo Jugador1;
    private Equipo Jugador2;
    Scanner leer = new Scanner(System.in);

    public void cracion() {
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
    }//fin creacion

}
