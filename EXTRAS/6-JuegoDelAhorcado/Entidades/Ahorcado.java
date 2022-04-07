/*
// Curso Egg FullStack
 */
package Entidades;

// @author JulianCVidal
public class Ahorcado {

    private final String[] mascotas = {"perro", "gato", "chancho", "loro", "iguana", "serpiente", "araña", "hamster", "tortuga", "peces", "conejo", "huron", "pajaro", "cobaya"};
    private final String palAdivinar;
    private String[] mostrar;
    private final int longAdivinar;
    private int intentos;

    private String letrasJugadas; //para guardar un registro de qué letras se han jugado
    private String letrasEncontradas; //para ver qué letras que contiene la palabra a adivinar han sido descubiertas

    private int adivinadas; //para ver cuántas letras faltan por adivinar
    private int faltantes; //para ver cuántas letras se han adivinado

    public Ahorcado() {
        this.palAdivinar = this.mascotas[(int) (Math.random() * mascotas.length)];
        this.longAdivinar = this.palAdivinar.length();

        this.mostrar = new String[this.longAdivinar];
        for (int i = 0; i < this.longAdivinar; i++) {
            this.mostrar[i] = "_";
        }

        this.adivinadas = 0;
        this.faltantes = (int) palAdivinar.chars().count(); //así obtengo la cantidad de letras que no se repiten
    }

    public Ahorcado(int intentos, String letrasJugadas, String letrasEncontradas, int letrasAdivinadas, int letrasFaltantes) {
        this.palAdivinar = this.mascotas[(int) (Math.random() * mascotas.length)];
        this.longAdivinar = this.palAdivinar.length();

        this.mostrar = new String[this.longAdivinar];
        for (int i = 0; i < this.longAdivinar; i++) {
            this.mostrar[i] = "_";
        }

        this.intentos = intentos;
        this.letrasJugadas = letrasJugadas;
        this.letrasEncontradas = letrasEncontradas;
        this.adivinadas = 0;
        this.faltantes = (int) palAdivinar.chars().count(); //así obtengo la cantidad de letras que no se repiten
    }

    public String[] getMascotas() {
        return mascotas;
    }

    public String getPalAdivinar() {
        return palAdivinar;
    }

    public int getLongAdivinar() {
        return longAdivinar;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public String getLetrasJugadas() {
        return letrasJugadas;
    }

    public void setLetrasJugadas(String letraJugada) {
        if (letrasJugadas != null) {
            if (!letrasJugadas.contains(letraJugada)) {
                this.letrasJugadas += letraJugada; //así voy agregando las letras que se van jugando
            }

        } else {
            this.letrasJugadas = letraJugada;
        }

    }

    public int getAdivinadas() {
        return adivinadas;
    }

    public int getFaltantes() {
        return faltantes;
    }

    public String getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(String letra) {
        if (palAdivinar.contains(letra)) {
            int reps = contarRepeticiones(letra);
            
            if (this.letrasEncontradas == null) {
                this.letrasEncontradas = letra;
                this.adivinadas += reps;
                this.faltantes -= reps;
                
            } else if (!this.letrasEncontradas.contains(letra)) {
                this.letrasEncontradas += letra; //agrego las letras que pertenecen a la palabra a adivinar que se han encontrado 
                this.adivinadas += reps;
                this.faltantes -= reps;
            }
        }
    }

    public int contarRepeticiones(String letra) { //para verificar si la palabra a adivinar tiene letras repetidas (chancho tiene dos C y dos H, por ejemplo)
        int reps = 0, leng = this.getLongAdivinar();
        for (int i = 0; i < leng; i++) {
            if (this.palAdivinar.substring(i, i + 1).equals(letra)) {
                reps++;
            }
        }
        return reps;
    }

    public void setMostrar(String letra) {
        int leng = this.getLongAdivinar();
        letra = letra.toUpperCase();
        String palAdivin = this.palAdivinar.toUpperCase();
        
        for (int i = 0; i < leng; i++) {
            if (palAdivin.substring(i, i + 1).equals(letra)) {
                this.mostrar[i] = letra;
            }
        }
    }

    public void getMostrar() {
        for (int i = 0; i < this.longAdivinar; i++) {
            System.out.print(this.mostrar[i] + " ");
        }
        System.out.println("");
    }

}
