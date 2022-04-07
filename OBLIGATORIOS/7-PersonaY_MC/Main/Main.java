/*
// Curso Egg FullStack
 */

package Main;

 //@author JulianCVidal
import Entidades.Persona;
import Entidades.ServiciosPersona;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        ServiciosPersona ServPers = new ServiciosPersona();
        Persona[] pers = new Persona[4];
        for (int i = 0; i < 4; i++) {
            System.out.println("Persona Nº" + (i+1) + ": ");
            pers[i] = ServPers.crearPersona();
        }
        
        int[] MCs = {ServPers.calcularMC(pers[0]), ServPers.calcularMC(pers[1]), ServPers.calcularMC(pers[2]), ServPers.calcularMC(pers[3])};
        int[] edades = {pers[0].getEdad(), pers[1].getEdad(), pers[2].getEdad(), pers[3].getEdad()};
        System.out.println("\nDe las cuatro personas: ");
        porcentajesMC(MCs);
        System.out.println("\nY");
        cantidadesEdad(edades);
         
    }
    
    public static void porcentajesMC(int[] MCs){
        int bajo = 0 , ideal = 0, sobre = 0;
        
        for (int i = 0; i < 4; i++) {
            switch(MCs[i]){
                case -1:
                    bajo++;
                    break;
                    
                case 0:
                    ideal++;
                    break;
                    
                case 1:
                    sobre++;
                    break;     
            }
        }
        
        System.out.println(bajo + " están bajo su peso ideal.");
        System.out.println(ideal + " están en su peso ideal.");
        System.out.println(sobre + " están sobre su peso ideal.");
        
    }
    
    public static void cantidadesEdad(int[] edades){
        int menor = 0, mayor = 0;
        for (int i = 0; i < 4; i++) {
            if (edades[i]<18){
                menor++;
            }else{
                mayor++;
            }
        }
        
        System.out.println(menor + " son menores de edad");
        System.out.println(mayor +  " son mayores de edad");
    }
    
    public static void esperarTecla() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Presione Enter para continuar.");
        String pass = leer.next();
    }
}
