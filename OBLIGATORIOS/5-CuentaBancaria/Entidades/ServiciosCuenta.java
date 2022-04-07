/*
//@author JulianCVidal
// Curso Egg FullStack
 */
package Entidades;

import java.util.Scanner;

public class ServiciosCuenta {

    public Scanner leer = new Scanner(System.in);

    public Cuenta CrearCuenta() {
        Cuenta acc = new Cuenta();

        //debe tener 10 digitos
        System.out.print("Ingrese su número de cuenta (10 dígitos): ");
        int numCuenta = leer.nextInt();
        acc.setNumeroCuenta(Validar(numCuenta, 10));

        System.out.print("Ingrese su DNI: ");
        acc.setDNI(leer.nextLong());

        System.out.print("Ingrese su saldo actual: ");
        acc.setSaldo(leer.nextDouble());

        System.out.print("Y sus intereses: ");
        acc.setInteres(leer.nextDouble());
        return acc;
    }

    public void ingresar(Cuenta acc, double ingreso) {
        acc.setSaldo(acc.getSaldo() + ingreso);
    }

    public void retirar(Cuenta acc, double retiro) {
        if (retiro > acc.getSaldo()) {
            System.out.println("No se puede retirar esa cantidad de dinero.");
            System.out.println("Saldo disponible: " + acc.getSaldo());
        } else {
            acc.setSaldo(acc.getSaldo() - retiro);
        }
    }

    public void extraccionRapida(Cuenta acc) {
        System.out.print("Ingrese el monto a retirar (máximo 20% de su saldo): ");
        double retiro = leer.nextDouble();
        while (retiro > (acc.getSaldo()) * 0.2) {
            System.out.print("Ingrese un monto más bajo: ");
            retiro = leer.nextDouble();
        }
        acc.setSaldo(acc.getSaldo() - retiro);
    }

    public void consultarSaldo(Cuenta acc) {
        System.out.println("Saldo disponible: " + acc.getSaldo());
    }

    public void consultarDatos(Cuenta acc) {
        System.out.println("DNI: " + acc.getDNI());
        System.out.println("Número de cuenta: " + acc.getNumeroCuenta());
        System.out.println("Saldo: " + acc.getSaldo());
        System.out.println("Intereses: " + acc.getInteres());
    }

    public int Validar(int num, int cant) {
        while ((int) (Math.log10(num) + 1) != cant) { //para obtener los dígitos
            System.out.print("Reintente: ");
            num = leer.nextInt();
        }
        return num;
    }
}
