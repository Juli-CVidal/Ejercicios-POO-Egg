/*
// Curso Egg FullStack
 */

package Entidades;

// @author JulianCVidal

import java.util.Scanner;

public class ServiciosPersona {
    public Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona(){
        Persona pers = new Persona();
        System.out.print("Ingrese su nombre: ");
        pers.setNombre(leer.next());
        
        System.out.print("Su edad: ");
        pers.setEdad((int) pedirValorPositivo());
        
        System.out.println("Su sexo: ");
        System.out.print("H(hombre), M(mujer), O(otro): ");
        String sexo = leer.next().toUpperCase().substring(0,1);
        //Así obtengo únicamente la primera letra, y en mayúsculas
        
        while (!sexo.equals("H") && !sexo.equals("M") && !sexo.equals("O")){
            System.out.print("Ingrese una opción válida: ");
            sexo = leer.next().toUpperCase().substring(0,1);
        }
        pers.setSexo(sexo);
        
        System.out.print("Ingrese su altura (en mts.): ");
        pers.setAltura(pedirValorPositivo());

        System.out.print("Y su peso (en kgs.): ");
        pers.setPeso(pedirValorPositivo());
        
        return pers;
    }
    
    public double pedirValorPositivo(){
        double num = leer.nextDouble();
        
        while (num<=0){
            System.out.print("Reintente: ");
            num = leer.nextDouble();
        }
        return num;
    }
    
    public int calcularMC(Persona pers){
        double peso = pers.getPeso();
        double altura = pers.getAltura();
        double MC = peso/(Math.pow(altura, 2));
        
        if (MC<20){ //debajo de su peso ideal
            return -1;
        }
        if (MC>=20 && MC<=25){ //está en su peso ideal
            return 0;
        }
        
        return 1; //en sobrepeso
    }
    
    public boolean esMayorDeEdad(Persona pers){
        return pers.getEdad() >= 18;
    }
    
    public void mostrarDatos(Persona pers){
        System.out.println("Nombre: " + pers.getNombre());
        System.out.println("Edad: " + pers.getEdad());
        System.out.println("Sexo: " + pers.getSexo());
        System.out.println("Altura: " + pers.getAltura());
        System.out.println("Peso: " + pers.getPeso());
        
        int MC=calcularMC(pers);
        resultadoMC(pers);  
        
        menorOMayor(pers);
    }
    
    public void resultadoMC(Persona pers){
        int MC = calcularMC(pers);
        System.out.print("Se encuentra ");
        
        switch (MC){
            case -1:
                System.out.print("debajo de su peso ideal.");
                break;
                
            case 0:
                System.out.print("en su peso ideal.");
                break;
                
            case 1:
                System.out.print("sobre su peso ideal.");
                break;
        }
    }
    
    public void menorOMayor(Persona pers){
        if (esMayorDeEdad(pers) == true){
            System.out.println("Mayor de edad");
        }else{
            System.out.println("Menor de edad");
        }
    }
}
