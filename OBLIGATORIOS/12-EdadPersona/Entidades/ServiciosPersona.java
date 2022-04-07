/*
// Curso Egg FullStack
 */
package Entidades;

// @author JulianCVidal
import java.util.Date;
import java.util.Scanner;

public class ServiciosPersona {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static Persona crearPersona() {
        Persona pers = new Persona();
        System.out.print("Ingrese su nombre: ");
        pers.setNombre(leer.next());

        System.out.println("Le pediremos su fecha de nacimiento:");
        System.out.print("Por favor ingrese el año: ");
        int anio = leer.nextInt();
        int mes = pedirNumero(12, "mes") - 1;
        int dia;

        switch (mes) { //así no permito ingresar fechas como 30 de febrero o 31 de abril 
            case 3:
            case 5:
            case 8:
            case 10:
                dia = pedirNumero(30, "día");
                break;

            case 1:
                dia = pedirNumero(28, "día");
                break;

            default:
                dia = pedirNumero(31, "día");
                break;

        }

        pers.setFechaNacimiento(new Date(anio, mes, dia));
        return pers;
    }

    public static int pedirNumero(int rango, String var) {
        System.out.println("Ingrese un número entre 1 y " + rango + "(inclusive).");
        System.out.print("Ingrese el " + var + ": ");
        int num = leer.nextInt();
        while (num <= 0 || num > rango) {
            System.out.print("Reintente: ");
            num = leer.nextInt();
        }
        return num;
    }

    public static int calcularEdad(Persona pers) {
        Date nacim = pers.getFechaNacimiento();
        Date actual = new Date();

        int edad = actual.getYear() - nacim.getYear() + 1900;
        if (nacim.getMonth() > actual.getMonth() || (actual.getMonth() == nacim.getMonth() && nacim.getDay() > actual.getDate())) {
            edad--;
        }

        return edad;
    }

    public static boolean menorQue(Persona pers, int edad) {
        return calcularEdad(pers) < edad;
    }

    public static void mostrarPersona(Persona pers) {
        Date nacim = pers.getFechaNacimiento();
        System.out.println("Nombre: " + pers.getNombre());
        System.out.println("Fecha de nacimiento: " + nacim.getDate() + "/" + (nacim.getMonth() + 1) + "/" + nacim.getYear());
        System.out.println("Edad: " + calcularEdad(pers));
    }
}
