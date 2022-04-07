/*
// Curso Egg FullStack
 */

package Main;

 //@author JulianCVidal
import java.util.Date;
import java.util.Scanner;


public class Main {
    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public static void main(String[] args) {
        Date fechaActual = new Date();
        System.out.print("Por favor ingrese el año: ");
        int anio = leer.nextInt();
        int mes = pedirNumero(12,"mes");
        int dia;
        
        switch (mes) { //así no permito ingresar fechas como 30 de febrero o 31 de abril 
            case 4:
            case 6:
            case 9:
            case 11:
                
                dia = pedirNumero(30,"día");
                break;
            case 2:
                dia = pedirNumero(28,"día");
                break;
                
            default:
                dia = pedirNumero(31,"día");
                break;
        }
        Date fechaAnterior = new Date(anio,mes,dia);
        
        int diferencia = (fechaActual.getYear()+1900) - (fechaAnterior.getYear());
        if (fechaActual.getMonth() > mes || (fechaActual.getMonth() == mes && dia > fechaActual.getDate())){
            diferencia --;
        }
        
        System.out.println("Han pasado " + diferencia + " año/s entre la fecha actual y la ingresada.");
    }
    
    
    public static int pedirNumero(int rango, String var){
        System.out.println("Ingrese un número entre 1 y " + rango + "(inclusive).");
        System.out.print("Ingrese el " + var + ": ");
        int num = leer.nextInt();
        while (num<=0 || num>rango){
            System.out.print("Reintente: ");
            num = leer.nextInt();
        }
        return num;
    }

}
