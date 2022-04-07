/*
// Curso Egg FullStack
 */
package Main;

//@author JulianCVidal
import Entidades.NIF;
import Entidades.ServiciosNIF;

public class Main {

    public static void main(String[] args) {
        NIF dni_nif = ServiciosNIF.crearNif();
        
        ServiciosNIF.mostrar(dni_nif);
    }

}
