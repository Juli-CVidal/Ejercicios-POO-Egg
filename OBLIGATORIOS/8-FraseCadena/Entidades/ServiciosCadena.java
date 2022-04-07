/*
// Curso Egg FullStack
 */
package Entidades;

// @author JulianCVidal
import java.util.Scanner;

public class ServiciosCadena {

    public Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cadena pedirFrase() {
        Cadena cad = new Cadena();
        System.out.print("Ingrese una frase: ");
        String frase = leer.next();

        cad.setFrase(frase);
        cad.setLongitud(frase.length());

        return cad;
    }

    public void mostrarVocales(Cadena cad) {
        int a = vecesRepetido(cad, "a"), e = vecesRepetido(cad, "e"), i = vecesRepetido(cad, "i"), o = vecesRepetido(cad, "o"), u = vecesRepetido(cad, "u");
        System.out.println("La frase contiene: ");
        System.out.print(a + " A, ");
        System.out.print(e + " E, ");
        System.out.print(i + " I, ");
        System.out.print(o + " O y ");
        System.out.println(u + " U");
        System.out.println("En total tiene " + (a + e + i + o + u) + " vocales.");
    }

    public void mostrarFraseInvertida(Cadena cad) {
        String cadOriginal = cad.getFrase();
        int longCadOriginal = cad.getLongitud();
        //System.out.println("La frase invertida es: " + invertirRecursivo(cad.getFrase(), cad.getLongitud() - 1));
        System.out.println("La frase invertida es: " + invertirIterativo(cad.getFrase()));
    }

    public String invertirRecursivo(String str, int i) {
        if (i == 0) {
            return str.charAt(0) + "";
        }
        char letra = str.charAt(i);
        return letra + invertirRecursivo(str, i - 1);
    }

    public String invertirIterativo(String cadOriginal) {
        int leng = cadOriginal.length();
        String cadInvertida = "";
        for (int i = 0; i < leng; i++) {
            cadInvertida += cadOriginal.substring(leng - i - 1, leng - i);
        }
        
        return cadInvertida;
    }

    public int vecesRepetido(Cadena cad, String letra) {
        letra = letra.substring(0, 1).toUpperCase(); //me aseguro de que sea una letra, y contabilizo repeticiones en mayúsculas y minúsculas
        String frase = cad.getFrase().toUpperCase();
        int longitud = cad.getLongitud();
        int reps = 0;

        for (int i = 0; i < longitud; i++) {
            if (frase.substring(i, i + 1).equals(letra)) {
                reps++;
            }
        }

        return reps;
    }

    public void compararLongitud(Cadena cad, String fraseComparar) {
        int longFrase = cad.getLongitud();
        int longFraseComp = fraseComparar.length();

        if (longFrase < longFraseComp) {
            System.out.println("La última frase ingresada es más larga.");

        } else if (longFrase > longFraseComp) {
            System.out.println("La frase ingresada anteriormente es más larga.");

        } else {
            System.out.println("Ambas frases tienen la misma longitud.");
        }
    }

    public void unirFrases(Cadena cad, String nuevaFrase) {
        System.out.println("Las cadenas unidas forman:");
        System.out.println(cad.getFrase() + nuevaFrase);
    }

    public void reemplazar(Cadena cad, String letra) {
        String frase = cad.getFrase();
        int longitud = cad.getLongitud();
        String nuevaFrase = "";

        for (int i = 0; i < longitud; i++) {
            if (frase.substring(i, i + 1).toUpperCase().equals("A")) {
                nuevaFrase += letra;
            } else {
                nuevaFrase += frase.substring(i, i + 1);
            }
        }

        System.out.println("La frase con los cambios es: ");
        System.out.println(nuevaFrase);
    }

    public boolean contiene(Cadena cad, String letra) {
        letra = letra.substring(0, 1).toUpperCase();

        return vecesRepetido(cad, letra) == 0;
    }
}
