/*
// Curso Egg FullStack
 */
package Entidades;

// @author JulianCVidal
import java.util.Scanner;

public class ServiciosNIF {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static NIF crearNif() {
        char letraNif[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        NIF dni_nif = new NIF();

        System.out.print("Ingrese su DNI (8 dígitos): ");
        long dni = leer.nextLong();

        while (dni <= 0 || String.valueOf(dni).length() != 8) {
            System.out.print("Reintente: ");
            dni = leer.nextLong();
        }

        dni_nif.setDni(dni);
        dni_nif.setLetra(letraNif[obtenerIndice(dni)]);
        return dni_nif;
    }

    public static int obtenerIndice(long dni) {
        return (int) dni % 23;
    }
    
    public static void mostrar(NIF dni_nif){
        System.out.println("Su documento junto a su nif es: " + dni_nif.getDni() + "-" + dni_nif.getLetra() + ".");
    }
}
