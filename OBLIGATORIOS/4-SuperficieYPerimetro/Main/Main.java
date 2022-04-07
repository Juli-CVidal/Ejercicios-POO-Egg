/*
// Curso Egg FullStack
 */
package Main;

//@author JulianCVidal
import Entidades.Rectangulo;
import Entidades.ServiciosRectangulo;

public class Main {

    public static void main(String[] args) {
        ServiciosRectangulo ServRes = new ServiciosRectangulo();
        Rectangulo rect = ServRes.crearRectangulo();

        System.out.println("El perímetro es: " + ServRes.calcularPerimetro(rect.getBase(), rect.getAltura()));
        System.out.println("La superficie es: " + ServRes.calcularSuperficie(rect.getBase(), rect.getAltura()));

        System.out.println("\nEl rectángulo ingresado es: ");
        ServRes.mostrarRectangulo(rect.getBase(), rect.getAltura());
    }

}
