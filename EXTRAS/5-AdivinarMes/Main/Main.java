/*
// Curso Egg FullStack
 */
package Main;

//@author JulianCVidal
import Entidades.Meses;
import java.util.Scanner;

public class Main {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        Meses mes = new Meses();
        String mesSecreto = mes.getMesSecreto();
        String intento;
        System.out.println("Intente adivinar el mes: ");

        do {
            System.out.print("Ingrese un mes: ");
            intento = leer.next().toLowerCase();
            
            if (!intento.equals(mesSecreto)){
                System.out.println("No ha adivinado, siga intentando\n");
            }
        } while (!intento.equals(mesSecreto));

        System.out.println("Ha adivinado el mes, felicidades!!");
    }

}
