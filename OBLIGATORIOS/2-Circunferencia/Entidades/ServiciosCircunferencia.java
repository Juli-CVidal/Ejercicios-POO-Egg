/*
// Curso Egg FullStack
 */
package Entidades;

// @author JulianCVidal
import java.util.Scanner;

public class ServiciosCircunferencia {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Circunferencia crearCircunferencia() {
        System.out.print("Ingrese el radio de la circunferencia: ");
        double radio = leer.nextDouble();

        return new Circunferencia(radio);
    }

    public void mostrarArea(Circunferencia circ) {
        System.out.println("Área de la cicunferencia: " + (Math.PI * Math.pow(circ.getRadio(), 2)));
    }

    public void mostrarPerimetro(Circunferencia circ) {
        System.out.println("Perímetro de la circunferencia: " + (2 * Math.PI * circ.getRadio()));
    }
}
