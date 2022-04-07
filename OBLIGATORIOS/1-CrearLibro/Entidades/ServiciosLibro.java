/*
// Curso Egg FullStack
 */
package Entidades;

// @author JulianCVidal
import java.util.Scanner;

public class ServiciosLibro {

    public Libro crearLibro() {
        Libro libro;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.print("Ingrese el nombre del libro: ");
        String nombre = leer.next();

        System.out.print("Ingrese su ISBN: ");
        int isbm = leer.nextInt();

        System.out.print("Ingrese el nombre de su autor: ");
        String autor = leer.next();

        System.out.print("Ingrese la cantidad de páginas: ");
        int pags = leer.nextInt();

        libro = new Libro(isbm, nombre, autor, pags);

        return libro;
    }

    public void MostrarDatos(Libro lib) {
        System.out.println("\nISBM: " + lib.ISBN + "\nTítulo: " + lib.titulo + "\nAutor: " + lib.autor + "\nPáginas: " + lib.pags);
    }
}
