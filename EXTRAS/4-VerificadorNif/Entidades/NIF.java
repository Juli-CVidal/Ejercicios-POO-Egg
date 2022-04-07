/*
// Curso Egg FullStack
 */
package Entidades;

// @author JulianCVidal
public class NIF {

    private long Dni;
    private char letra;

    public NIF() {
    }

    public NIF(long Dni, char letra) {
        this.Dni = Dni;
        this.letra = letra;
    }

    public long getDni() {
        return Dni;
    }
    public void setDni(long Dni) {
        this.Dni = Dni;
    }

    public char getLetra() {
        return letra;
    }
    public void setLetra(char letra) {
        this.letra = letra;
    }

}
