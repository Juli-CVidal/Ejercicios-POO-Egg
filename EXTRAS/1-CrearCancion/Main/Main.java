/*
// Curso Egg FullStack
 */
package Main;

//@author JulianCVidal
import Entidades.Cancion;
import java.util.Scanner;

public class Main {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        Cancion song = new Cancion();
        System.out.print("Ingrese el nombre de la canción: ");
        song.setTitulo(leer.next());

        System.out.print("Ingrese el autor: ");
        song.setAutor(leer.next());
    }

}
