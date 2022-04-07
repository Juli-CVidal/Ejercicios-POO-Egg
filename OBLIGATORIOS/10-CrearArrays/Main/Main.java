/*
// Curso Egg FullStack
 */

import Entidades.ServiciosArray;

// @author JulianCVidal
public class Main {

    public static void main(String[] args) {
        ServiciosArray servAr = new ServiciosArray();
        double[] arrayA = servAr.crearArrayA(50);
        System.out.println("El arreglo A es: ");
        servAr.printArray(arrayA);
        System.out.println("Ordenado es: ");
        servAr.ordenarArray(arrayA);
        servAr.printArray(arrayA);

        double[] arrayB = servAr.crearArrayB(arrayA, 20);
        System.out.println("El array B es: ");
        servAr.printArray(arrayB);
    }

}
