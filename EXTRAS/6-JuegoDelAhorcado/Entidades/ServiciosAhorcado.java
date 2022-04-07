/*
// Curso Egg FullStack
 */
package Entidades;

// @author JulianCVidal
import java.util.Scanner;

public class ServiciosAhorcado {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static Ahorcado crearJuego() {
        Ahorcado juego = new Ahorcado();
        System.out.print("Ingrese la cantidad de intentos: ");
        int intentos = leer.nextInt();
        while (intentos <= 0) {
            System.out.print("Ingrese un valor positivo: ");
            intentos = leer.nextInt();
        }
        juego.setIntentos(intentos);

        return juego;
    }

    public static void buscar(Ahorcado juego, String letra) {
        if (juego.getPalAdivinar().contains(letra)) {
            juego.setLetrasEncontradas(letra);
            juego.setMostrar(letra);

            System.out.println("La letra ingresada se encuentra en la palabra");

        } else {
            System.out.println("La letra ingresada no se encuentra en la palabra");
        }
    }

    public static boolean encontradas(Ahorcado juego, String letra) {
        String letrasJugadas = juego.getLetrasJugadas();
        System.out.println("Letras encontradas: " + juego.getAdivinadas());
        System.out.println("Letras restantes: " + juego.getFaltantes());

        if (letrasJugadas != null && letrasJugadas.contains(letra)) {
            System.out.println("La letra ingresada ya ha sido jugada");
        } else {
            System.out.println("No ha jugado antes a la letra ingresada");
            juego.setLetrasJugadas(letra);
            return juego.getPalAdivinar().contains(letra);
        }

        return false;
    }

    public static void Jugar(Ahorcado juego) {
        int cantLetras = juego.getLongAdivinar();
        int intentos;
        String letra;
        do {
            intentos = juego.getIntentos();
            System.out.println("-------------------------------------");
            juego.getMostrar();
            System.out.println("Intentos restantes: " + intentos);
            System.out.println("Longitud de la palabra a adivinar: " + juego.getLongAdivinar());
            System.out.print("Ingrese una letra: ");
            letra = leer.next().substring(0, 1).toLowerCase();

            buscar(juego, letra);
            if (encontradas(juego, letra) == false) {
                juego.setIntentos(intentos - 1);
            }

            if (juego.getIntentos() >= 0 && juego.getFaltantes() != 0) {
                esperarTecla();
            }
        } while (juego.getIntentos() >= 0 && juego.getFaltantes() != 0);

        System.out.println("\n\n -------------------------------------------");
        if (juego.getIntentos() >= 0 && juego.getFaltantes() == 0) {
            System.out.println("Ha ganado el juego, felicitaciones!!!");
        } else {
            System.out.println("Ha perdido el juego, suerte la próxima..");
            System.out.println("La palabra a adivinar era: " + juego.getPalAdivinar());
        }

    }

    public static void esperarTecla() {
        System.out.println("Presione Enter para continuar.");
        String pass = leer.next();
    }

}
