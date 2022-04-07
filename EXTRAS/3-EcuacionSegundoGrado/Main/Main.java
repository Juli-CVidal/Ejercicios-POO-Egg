/*
// Curso Egg FullStack
 */
package Main;

//@author JulianCVidal
import Entidades.Raices;
import Entidades.ServiciosRaices;

public class Main {

    public static void main(String[] args) {
        Raices ra = ServiciosRaices.obtenerCoeficientes();
        System.out.println("");
        ServiciosRaices.calcular(ra);
    }

}
