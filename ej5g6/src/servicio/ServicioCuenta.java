/*
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
 */
package servicio;

import entidad.Cuenta;
import java.util.Scanner;

/**
 *
 * @author agos.tutto
 */
public class ServicioCuenta {

    public Cuenta crearCuenta() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su numero de cuenta");
        int numeroCuenta = leer.nextInt();
        System.out.println("Ingrese su dni");
        long dni = leer.nextLong();
        System.out.println("Ingrese su saldo actual");
        double saldo = leer.nextDouble();
        Cuenta c1 = new Cuenta(numeroCuenta, dni, saldo);
        System.out.println("Ingrese 1: para ingresar dinero \n 2: para retirar dinero \n 3: para hacer una extraccion rapida \n 4: para consultar su saldo \n 5: para ver los datos de su cuenta \n 0 para salir");
        int op = leer.nextInt();
        do {
            switch (op) {
            case 1:
               c1.ingresar(c1.getSaldoActual());
                break;
            case 2:
                c1.retiro(c1.getSaldoActual());
                break;
            case 3:
                c1.extraccionRapida(c1.getSaldoActual());
                break;
            case 4:
                System.out.println("su saldo actual es: " + c1.consultarSaldo());
                break;
            case 5:
                c1.consultarDatos();
                break;
        }
        System.out.println("Ingrese 1: para ingresar dinero \n 2: para retirar dinero \n 3: para hacer una extraccion rapida \n 4: para consultar su saldo \n 5: para ver los datos de su cuenta \n 0 para salir");
        op = leer.nextInt();
    }
    while (op!= 0);

    return c1;
}
}