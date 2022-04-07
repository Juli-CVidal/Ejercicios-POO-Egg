/*
// Curso Egg FullStack
 */
package Entidades;

// @author JulianCVidal
public class ServiciosCafetera {

    public void llenarCafetera(Cafetera caf) {
        System.out.println("Se ha llenado la cafetera.");
        caf.setCantidadActual(caf.getCapacidadMaxima());
    }

    public void servirTaza(Cafetera caf, int cantServir) { // cant = cantidad
        int cantActual = caf.getCantidadActual();
        if (cantServir > cantActual) {
            System.out.println("No se ha podido llenar la taza completamente");
            System.out.println("Se ha llenado " + cantActual + " unidades, faltaron " + (cantServir - cantActual) + " unidades para llenar la taza.");
            caf.setCantidadActual(0);
        } else {
            System.out.println("Se ha llenado la taza");
            caf.setCantidadActual(cantActual - cantServir);
            System.out.println("Unidades de café restantes en la cafetera: " + (cantActual - cantServir));
        }
    }

    public void vaciarCafetera(Cafetera caf) {
        System.out.println("Se ha vaciado la cafetera.");
        caf.setCantidadActual(0);
    }

    public void agregarCafe(Cafetera caf, int cantAgregar) {
        int cantActual = caf.getCantidadActual();
        int capMaxima = caf.getCapacidadMaxima();

        if (cantActual + cantAgregar > capMaxima) {
            System.out.println("Se ha excedido la capacidad máxima, se llenará la cafetera y se descartará el excedente");
            llenarCafetera(caf);
        } else {
            System.out.println("Se ha recargado la cafetera, contiene " + (cantActual + cantAgregar) + " unidades de " + capMaxima);
            caf.setCantidadActual(cantActual + cantAgregar);
        }
    }
}
