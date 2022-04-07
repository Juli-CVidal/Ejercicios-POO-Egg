/*
// Curso Egg FullStack
 */

package Main;

 //@author JulianCVidal
import Entidades.Cadena;
import Entidades.ServiciosCadena;
import java.util.Scanner;



public class Main {
    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        ServiciosCadena ServCad = new ServiciosCadena();
        Cadena frase = ServCad.pedirFrase();
        String letra,nuevaFrase;
        int opc;
        
        do{
            System.out.println("\n1.Contar Vocales\n2.Invertir Frase\n3.Contar cuántas veces aparece una letra");
            System.out.println("4.Comparar longitud con otra frase\n5.Unir con otra frase");
            System.out.println("6.Reemplazar la letra 'a' por otra\n7.Ver si la frase contiene una letra");
            System.out.println("8.Salir");
            System.out.print("Ingrese una opción: ");
            opc = leer.nextInt();
        
        
            switch (opc){
                case 1: //contar vocales
                    ServCad.mostrarVocales(frase);
                    break;

                case 2: //invertir frase
                    ServCad.mostrarFraseInvertida(frase);
                    break;

                case 3: //contar repeticiones
                    System.out.print("Ingrese una letra: ");
                    letra = leer.next().substring(0,1).toUpperCase();
                    System.out.println("La letra " + letra + " se repite " + ServCad.vecesRepetido(frase,letra) + " veces");
                    break;

                case 4: //comparar longitudes
                    System.out.print("Ingrese una frase: ");
                    nuevaFrase = leer.next();
                    ServCad.compararLongitud(frase,nuevaFrase);
                    break;

                case 5: //unir frases
                    System.out.print("Ingrese una frase: ");
                    nuevaFrase = leer.next();
                    ServCad.unirFrases(frase,nuevaFrase);
                    break;

                case 6: //Reemplazar la letra a
                    System.out.print("Ingrese una letra: ");
                    letra = leer.next().substring(0,1);
                    ServCad.reemplazar(frase, letra);
                
                case 7: //Ver si la letra está en la frase
                    System.out.print("Ingrese una letra: ");
                    letra = leer.next().substring(0,1).toUpperCase();

                    if (ServCad.contiene(frase, letra) == true){
                        System.out.println("La letra " + letra + " se encuentra en la frase");      
                    }else{
                        System.out.println("La letra no se encuentra en la frase");
                    }
                case 8:
                    break;
                    
                default: 
                    System.out.println("No ha ingresado una opción válida.");
                    break;
            }
            
            if (opc!=8){
                esperarTecla();
            }
        }while(opc!=8);
    }

    public Main() {
    }

    
     public static void esperarTecla() {
        System.out.print("Presione Enter para continuar.");
        String pass = leer.nextLine();
    }
}
