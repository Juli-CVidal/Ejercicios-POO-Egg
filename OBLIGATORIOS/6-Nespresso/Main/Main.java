/*
//@author JulianCVidal
// Curso Egg FullStack
 */
package Main;

//@author JulianCVidal
import Entidades.Cafetera;
import Entidades.ServiciosCafetera;
import java.util.Scanner;

public class Main {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        ServiciosCafetera ServCaf = new ServiciosCafetera();
        System.out.print("Ingrese la cantidad máxima de café que puede contener la cafetera: ");
        Cafetera cafetera = new Cafetera(leer.nextInt());

        int opc;

        do {
            System.out.println("\n1.Llenar Cafetera\n2.Servir Taza\n3.Vaciar Cafetera");
            System.out.println("4.Agregar Cafe\n5.Salir");
            System.out.print("Ingrese una opción: ");
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    ServCaf.llenarCafetera(cafetera);
                    break;

                case 2:
                    System.out.print("\n¿Cuánto café quiere? ");
                    ServCaf.servirTaza(cafetera, leer.nextInt());
                    break;

                case 3:
                    ServCaf.vaciarCafetera(cafetera);
                    break;

                case 4:
                    System.out.print("\n¿Cuánto café quiere agregar a la cafetera? ");
                    ServCaf.agregarCafe(cafetera, leer.nextInt());
                    break;
                    
                case 5:
                    break;
                    
                default:
                    System.out.println("No se ha ingresado una opción válida.");
                    break;
            }

            
            if (opc == 2 || opc == 4) {
                esperarTecla();
            }

        } while (opc != 5);

    }

    public static void esperarTecla() {
        System.out.print("Presione Enter para continuar.");
        String pass = leer.next();
    }

}
