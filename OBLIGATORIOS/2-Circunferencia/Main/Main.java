/*
// Curso Egg FullStack
 */
package Main;

//@author JulianCVidal
import Entidades.Circunferencia;
import Entidades.ServiciosCircunferencia;

public class Main {
    
    public static void main(String[] args) {
        ServiciosCircunferencia ServCir = new ServiciosCircunferencia();
        
        Circunferencia circ = ServCir.crearCircunferencia();
        
        ServCir.mostrarArea(circ);
        ServCir.mostrarPerimetro(circ);
        
    }
    
}
