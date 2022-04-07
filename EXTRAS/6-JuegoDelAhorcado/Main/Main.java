/*
// Curso Egg FullStack
 */
package Main;

//@author JulianCVidal
import Entidades.Ahorcado;
import Entidades.ServiciosAhorcado;

public class Main {
    
    public static void main(String[] args) {
        Ahorcado juego = ServiciosAhorcado.crearJuego();
        ServiciosAhorcado.Jugar(juego);
    }
    
}
