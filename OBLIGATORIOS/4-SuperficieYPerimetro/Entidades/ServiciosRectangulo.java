/*
// Curso Egg FullStack
 */
package Entidades;

// @author JulianCVidal
import java.util.Scanner;

public class ServiciosRectangulo {

    public Rectangulo crearRectangulo() {
        Rectangulo rect = new Rectangulo();
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese la medida de la base: ");
        rect.setBase(leer.nextDouble());

        System.out.print("Y de la altura: ");
        rect.setAltura(leer.nextDouble());

        return rect;
    }

    public double calcularPerimetro(double base, double altura) {
        return (base + altura) * 2;
    }

    public double calcularSuperficie(double base, double altura) {
        return base * altura;
    }

    public void mostrarRectangulo(double base, double altura) {
        String aux;
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i == 0 || i == altura - 1) {
                    System.out.print("* ");
                } else {
                    if (j == 0 || j == base - 1) {
                        aux = "* ";
                    } else {
                        aux = "  ";
                    }
                    System.out.print(aux);
                }
            }
            System.out.println("");
        }
    }
}
