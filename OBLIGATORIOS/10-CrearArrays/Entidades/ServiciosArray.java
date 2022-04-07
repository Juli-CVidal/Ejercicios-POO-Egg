/*
// Curso Egg FullStack
 */
package Entidades;

// @author JulianCVidal
import java.util.Arrays;

public class ServiciosArray {

    public double[] crearArrayA(int len) {

        double[] array = new double[len];
        for (int i = 0; i < len; i++) {
            array[i] = Math.random() * 50 - 25;
        }

        return array;
    }

    public double[] crearArrayB(double[] arrayA, int len) {
        double[] arrayB = new double[len];
        System.arraycopy(arrayA, 0, arrayB, 0, len);
        return arrayB;
    }

    public void ordenarArray(double[] array) {
        Arrays.sort(array);
    }

    public void printArray(double[] array) {
        int len = array.length;
        System.out.print("[");
        for (int i = 0; i < len; i++) {
            System.out.printf("%.4f", array[i]);
            if (i != len - 1) {
                System.out.print("; ");
            }
        }
        System.out.println("]");
    }
}
