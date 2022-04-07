/*
// Curso Egg FullStack
 */
package Entidades;

// @author JulianCVidal
import java.util.Scanner;

public class ServiciosMatematica {

    public Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Matematica pedirNumeros() {
        Matematica mate = new Matematica();
        System.out.print("Ingrese el primer número: ");
        mate.setNum1(leer.nextDouble());

        System.out.print("Y el segundo: ");
        mate.setNum2(leer.nextDouble());
        return mate;
    }

    public double devolverMayor(Matematica mate) {
        return Math.max(mate.getNum1(), mate.getNum2());
    }

    public long calcularPotencia(Matematica mate) {
        long num1 = (long) mate.getNum1();
        long num2 = (long) mate.getNum2();

        if (num1 < num2) {
            return (long) (Math.pow(num2, num1));
        } else {
            return (long) (Math.pow(num1, num2));
        }
    }

    public double calcularRaiz(Matematica mate) {
        double num1 = Math.abs(mate.getNum1());
        double num2 = Math.abs(mate.getNum2());

        if (num1 < num2) {
            return Math.sqrt(Math.abs(num1));
        } else {
            return Math.sqrt(Math.abs(num2));
        }
    }
}
