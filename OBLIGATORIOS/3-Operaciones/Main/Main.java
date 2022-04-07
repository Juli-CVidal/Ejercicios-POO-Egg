/*
// Curso Egg FullStack
 */
package Main;

//@author JulianCVidal
import Entidades.Operacion;
import Entidades.ServiciosOperacion;

public class Main {

    public static void main(String[] args) {
        ServiciosOperacion ServOps = new ServiciosOperacion();
        Operacion nums = ServOps.crearOperacion();

        ServOps.mostrarResultados(nums);

    }

}
