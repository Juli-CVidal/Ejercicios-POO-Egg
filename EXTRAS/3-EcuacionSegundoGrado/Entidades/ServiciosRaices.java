/*
// Curso Egg FullStack
 */
package Entidades;

// @author JulianCVidal
import java.util.Scanner;

public class ServiciosRaices {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public static Raices obtenerCoeficientes(){
        Raices ra = new Raices();
        System.out.print("Ingrese el coeficiente principal: ");
        ra.setA(leer.nextInt());
        
        System.out.print("El segundo coeficiente: ");
        ra.setB(leer.nextInt());
        
        System.out.print("Y el término independiente: ");
        ra.setC(leer.nextInt());
        
        return ra;
    }

    public static double getDiscriminante(Raices ra) {
        return (Math.pow(ra.getB(), 2) - (4 * ra.getA() * ra.getC())); //b^2 - 4*a*c
    }

    public static boolean tieneRaices(Raices ra) {
        return (getDiscriminante(ra) > 0);
    }

    public static boolean tieneRaiz(Raices ra) {
        return (getDiscriminante(ra) == 0);
    }

    public static void obtenerRaices(Raices ra) {
        if (tieneRaices(ra) == true) {
            System.out.println("Las raíces de la ecuación son: ");
            System.out.println("X1: " + primeraSolucion(ra));
            System.out.println("X2: " + segundaSolucion(ra));
        }
    }

    public static void obtenerRaiz(Raices ra) {
        if (tieneRaiz(ra) == true) {
            System.out.println("La solución de la ecuación es: " + primeraSolucion(ra));
        }
    }

    public static void calcular(Raices ra) {
        if (tieneRaiz(ra) == false && tieneRaices(ra) == false) {
            System.out.println("La ecuación no tiene solución.");
            return;
        }
        if (tieneRaiz(ra) == true && tieneRaices(ra) == false) {
            obtenerRaiz(ra);
            return;
        }

        obtenerRaices(ra);
    }

    public static double primeraSolucion(Raices ra) {
        int a = ra.getA(), b = ra.getB(), c = ra.getC();

        return ((-b - Math.sqrt(getDiscriminante(ra))) / (2 * a)); // (-b - sqrt(discrminante)) / 2a
    }

    public static double segundaSolucion(Raices ra) {
        int a = ra.getA(), b = ra.getB(), c = ra.getC();

        return ((-b + Math.sqrt(getDiscriminante(ra))) / (2 * a)); // (-b + sqrt(discrminante)) / 2a
    }
}
