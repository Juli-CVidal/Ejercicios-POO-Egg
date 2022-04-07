/*
// Curso Egg FullStack
 */
package Main;

//@author JulianCVidal
import Entidades.ServiciosMatematica;
import Entidades.Matematica;
import java.util.Scanner;

public class Main {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        ServiciosMatematica ServMat = new ServiciosMatematica();
        Matematica mate = ServMat.pedirNumeros();

        int opc;
        do {
            System.out.println("\n1.Mostrar cuál es el mayor número\n2.Calcular la potencia del mayor número elevado al menor");
            System.out.println("3.Calcular la raíz cuadrada del menor número");
            System.out.print("4.Salir\nSeleccione una opción: ");
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("El mayor número ingresado es: " + ServMat.devolverMayor(mate));
                    break;

                case 2:
                    System.out.println("La potencia del mayor número elevado al menor es: " + ServMat.calcularPotencia(mate));
                    break;

                case 3:
                    System.out.println("La raíz cuadrada del menor número es: " + ServMat.calcularRaiz(mate));
                    break;

                case 4:
                    break;

                default:
                    System.out.println("No ha ingresado una opción válida.");
            }

            if (opc != 4) {
                esperarTecla();
            }
        } while (opc != 4);
    }

    public static void esperarTecla() {
        System.out.print("Presione Enter para continuar.");
        String pass = leer.next();
    }

}
