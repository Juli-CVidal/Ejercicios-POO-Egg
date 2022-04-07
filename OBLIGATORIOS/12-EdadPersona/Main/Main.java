/*
// Curso Egg FullStack
 */
package Main;

//@author JulianCVidal
import Entidades.Persona;
import Entidades.ServiciosPersona;
import java.util.Scanner;

public class Main {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        Persona pers = ServiciosPersona.crearPersona();
        int opc;

        do {
            System.out.println("\n1.Ver cuántos años tengo\n2.Comparar edades");
            System.out.print("3.Mostrar mi información\n4.Salir\nElija una opción: ");
            opc = leer.nextInt();
            System.out.println("");

            switch (opc) {
                case 1: //calcular edad
                    System.out.println("Usted tiene " + ServiciosPersona.calcularEdad(pers) + " años");
                    break;

                case 2: //comparar edades
                    System.out.print("Por favor ingrese una edad: ");
                    int compEdad = leer.nextInt();
                    while (compEdad < 0) {
                        System.out.print("Ingrese un número positivo: ");
                        compEdad = leer.nextInt();
                    }

                    if (ServiciosPersona.menorQue(pers, compEdad)) {
                        System.out.println("Usted es menor");
                    } else {
                        System.out.println("Usted es mayor");
                    }
                    break;

                case 3: //mostrar info
                    System.out.println("Sus datos son: ");
                    ServiciosPersona.mostrarPersona(pers);
                    break;

                case 4: //salir
                    break;

                default:
                    System.out.println("No ha ingresado una opción válida.");
            }
            if (opc >= 1 && opc <= 3) {
                esperarTecla();
            }
        } while (opc != 4);
    }

    public static void esperarTecla() {
        System.out.print("Presione Enter para continuar.");
        String pass = leer.next();
    }

}
