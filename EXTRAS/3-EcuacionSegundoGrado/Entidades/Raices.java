/*
// Curso Egg FullStack
 */
package Entidades;

// @author JulianCVidal
import java.util.Scanner;

public class Raices {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private int a, b, c; //coeficiente principal, secundario y término independiente

    public Raices() {
    }

    public Raices(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }
    public void setC(int c) {
        this.c = c;
    }

}
