/*
// Curso Egg FullStack
 */
package Main;

//@author JulianCVidal
import Entidades.Puntos;
import Entidades.ServiciosPuntos;

public class Main {

    public static void main(String[] args) {
        Puntos pts = ServiciosPuntos.pedirPuntos();

        System.out.println("La distancia entre los puntos ingresados es igual a: " + ServiciosPuntos.calcularDistancia(pts));
    }

}
