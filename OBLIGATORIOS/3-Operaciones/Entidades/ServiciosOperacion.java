/*
// Curso Egg FullStack
 */
package Entidades;

// @author JulianCVidal
import java.util.Scanner;

public class ServiciosOperacion {

    Scanner leer = new Scanner(System.in);

    public Operacion crearOperacion() {
        Operacion nums = new Operacion();
        System.out.print("Ingrese el primer número: ");
        nums.setNum1(leer.nextDouble());

        System.out.print("Y el segundo: ");
        nums.setNum2(leer.nextDouble());

        return nums;
    }

    private double sumar(double num1, double num2) {
        return (num1 + num2);
    }

    private double restar(double num1, double num2) {
        return (num1 - num2);
    }

    private double multiplicar(double num1, double num2) {
        if (num1 == 0 && num2 == 0) {
            System.out.println("Uno de los números ingresados es igual a 0\n");
        }
        return (num1 * num2);

    }

    private double dividir(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("No se puede dividir por 0\n");
            return 0;
        }
        return (num1 / num2);
    }

    public void mostrarResultados(Operacion nums) {
        double num1 = nums.getNum1(), num2 = nums.getNum2();
        System.out.println("\nResultados: ");
        System.out.println("Suma: " + sumar(num1, num2) + "\n");
        System.out.println("Resta: " + restar(num1, num2) + "\n");
        System.out.println("Multiplicación: " + multiplicar(num1, num2) + "\n");
        System.out.println("Dividisión: " + dividir(num1, num2));
    }
}
