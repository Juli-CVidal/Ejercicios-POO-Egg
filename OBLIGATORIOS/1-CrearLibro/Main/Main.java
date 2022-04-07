
package Main;
import Entidades.Libro;
import Entidades.ServiciosLibro;

/**
 *
 * @author Administrador
 */
public class Main {

    public static void main(String[] args) {
        ServiciosLibro ServLib = new ServiciosLibro();

        Libro lib1 = ServLib.crearLibro();
        
        ServLib.MostrarDatos(lib1);
    }
}
