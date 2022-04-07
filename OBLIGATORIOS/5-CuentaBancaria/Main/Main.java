/*
// Curso Egg FullStack
 */
package Main;

import Entidades.Cuenta;
import Entidades.ServiciosCuenta;
import java.util.Scanner;

public class Main {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        ServiciosCuenta ServCu = new ServiciosCuenta();
        Cuenta acc = ServCu.CrearCuenta();
        int opc;

        do {
            System.out.println("\n1.Ingresar\n2.Retirar\n3.Extracción Rápida");
            System.out.println("4.Consultar Saldo\n5.Consultar Datos\n6.Salir");
            System.out.print("Ingrese una opción: ");
            opc = leer.nextInt();
            System.out.println("");

            switch (opc) {
                case 1:
                    System.out.println("INGRESAR");
                    System.out.print("Ingrese el monto: ");
                    ServCu.ingresar(acc, leer.nextDouble());
                    break;

                case 2:
                    System.out.println("RETIRAR");
                    System.out.print("Ingrese el monto: ");
                    ServCu.retirar(acc, leer.nextDouble());
                    break;

                case 3:
                    System.out.println("EXTRACCIÓN RÁPIDA");
                    ServCu.extraccionRapida(acc);
                    break;

                case 4:
                    ServCu.consultarSaldo(acc);
                    break;

                case 5:
                    ServCu.consultarDatos(acc);
                    break;

                default:
                    System.out.println("No se ha ingresado una opción válida.");
                    break;
            }

            if (opc != 6) {
                esperarTecla();
            }
        } while (opc != 6);

    }

    public static void esperarTecla() {
        System.out.print("Presione Enter para continuar.");
        String pass = leer.next();
    }

}
