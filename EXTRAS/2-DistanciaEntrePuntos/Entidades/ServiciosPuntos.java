/*
// Curso Egg FullStack
 */
package Entidades;

// @author JulianCVidal
import java.util.Scanner;

public class ServiciosPuntos {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static Puntos pedirPuntos() {
        Puntos pts = new Puntos();

        System.out.println("Ingrese las coordenadas del punto 1:");
        System.out.print("X: ");
        pts.setX1(leer.nextDouble());
        System.out.print("Y: ");
        pts.setY1(leer.nextDouble());

        System.out.println("Y las del segundo punto: ");
        System.out.print("X: ");
        pts.setX2(leer.nextDouble());
        System.out.print("Y: ");
        pts.setY2(leer.nextDouble());

        return pts;
    }

    public static double calcularDistancia(Puntos pts) {

        return Math.sqrt(Math.pow((pts.getX2() - pts.getX1()), 2) + Math.pow((pts.getY2() - pts.getY2()), 2));
    }
}
